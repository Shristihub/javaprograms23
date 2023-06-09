package com.shristi.training;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ScatteredReads {
	public static void main(String[] args) throws Exception {
		// create the file
		RandomAccessFile rAccessFile = new RandomAccessFile("demo.txt", "rw");
		try (rAccessFile) {
			// get the channel from the file
			FileChannel channel = rAccessFile.getChannel();

			// create the buffer
			ByteBuffer buffer1 = ByteBuffer.allocate(2);
			ByteBuffer buffer2 = ByteBuffer.allocate(100);

			// create a ByteBuffer Array
			ByteBuffer[] byteArray = { buffer1, buffer2 };

			// read from channel into buffer
			channel.read(byteArray);
			System.out.println();
			buffer1.flip();
			buffer2.flip();
			while (buffer1.hasRemaining()) {
				System.out.println((char) buffer1.get());
			}
			System.out.println();
			while (buffer2.hasRemaining()) {
				System.out.println((char) buffer2.get());
			}
		}
	}

}
