package com.shristi.training;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SelectorClient {

	public static void main(String[] args) throws Exception {
		InetSocketAddress hostAddress = new InetSocketAddress("localhost", 5151);
		SocketChannel clientChannel = SocketChannel.open(hostAddress);
		System.out.println("Client sending messages to server...");
		// Sending messages to the server
		String[] msg = new String[] { "This is a demo", "Sending more data", "over", "What next" };
		for (int i = 0; i < msg.length; i++) {
			byte[] message = new String(msg[i]).getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(message);
			// write into the channel from the buffer
			clientChannel.write(buffer);
			System.out.println(msg[i]);
			buffer.clear();
			Thread.sleep(3000);
		}
		clientChannel.close();
	}
}
