package com.shristi.training;

import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		// create the file
		RandomAccessFile rAccessFile = new RandomAccessFile("demo.txt", "rw");
		FileWriter writer = new FileWriter("demo1.txt");
		try (rAccessFile; writer) {
			// get the channel from the file
			FileChannel channel = rAccessFile.getChannel();
			// create the buffer
			ByteBuffer buffer = ByteBuffer.allocate(100);

			// read from the channel into the buffer
			channel.read(buffer); // buffer is in write mode

			// flip th buffer to read mode
			buffer.flip();

			while (buffer.hasRemaining()) {
				char c = (char) buffer.get();
				System.out.print(c);
				writer.append(c);
			}

		}

	}

}
