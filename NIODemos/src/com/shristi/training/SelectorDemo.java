package com.shristi.training;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorDemo {

	public static void main(String[] args) throws IOException {

		// create a selector
		Selector selector = Selector.open();
		// get the channel
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
		InetSocketAddress address = new InetSocketAddress("localhost", 5151);
		// bind the channel
		serverSocketChannel.bind(address);
		// make this as non-blocking
		serverSocketChannel.configureBlocking(false);

		// get the valid operations on the channe;
		int operations = serverSocketChannel.validOps();
		System.out.println("valid operations" +operations);
		// register the channel with the selector
		SelectionKey keyAssigned = serverSocketChannel.register(selector, operations);
		
		for (;;) {
			System.out.println("Waiting");
			// returns the keys of the channels that are ready
			int keysReady = selector.select();
			System.out.println("keys of ready channel " + keysReady);
			Set<SelectionKey> selectedKeys = selector.selectedKeys();
			// iterate through the selected keys
			Iterator<SelectionKey> iterator = selectedKeys.iterator();
			while (iterator.hasNext()) {
				SelectionKey selectionKey = (SelectionKey) iterator.next();
				if (selectionKey.isConnectable()) {
					// connection with remote server
					System.out.println("Has finished operation");
				}
//				 is channel ready to accept connection
				if (selectionKey.isAcceptable()) {
					// client connection is accepted
					SocketChannel client = serverSocketChannel.accept();
					client.configureBlocking(false);
					// add connection to selector
					client.register(selector, SelectionKey.OP_READ);
					System.out.println("connection accepted from client");
				}
				if (selectionKey.isReadable()) {
					System.out.println("Ready for reading into channel");
					SocketChannel clientChannel = (SocketChannel) selectionKey.channel();
					ByteBuffer buffer = ByteBuffer.allocate(1000);
					// reading into buffer from channel
					clientChannel.read(buffer);
					String data = new String(buffer.array()).trim();
					System.out.println("message from client " + data);
					if (data.equals("over")) {
						clientChannel.close();
						System.out.println("close");
					}
				}

				iterator.remove();

			}
		}

	}

}
