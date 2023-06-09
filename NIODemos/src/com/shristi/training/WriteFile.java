package com.shristi.training;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteFile {
	public static void main(String[] args) throws Exception {
//		// create the file
		RandomAccessFile rAccessFile = new RandomAccessFile("demo.txt", "rw");
		try (rAccessFile) {
			// get the channel from the file
			FileChannel channel = rAccessFile.getChannel();

			// create the buffer
			ByteBuffer buffer = ByteBuffer.allocate(100);

			// add messages and buffer is in write mode
			buffer.put("Hello This is java training!!!!!".getBytes());

			// flip th buffer to read mode
			buffer.flip();

			// write into the channel from the buffer
			channel.write(buffer);

			// flip the buffer  to show data
			buffer.flip();
			while (buffer.hasRemaining()) {
				char c = (char) buffer.get();
				System.out.print(c);
			}
		}

	}
}
