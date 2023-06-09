package com.shristi.training;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GatheredWrites {
	public static void main(String[] args) throws Exception {
		// create the file
		RandomAccessFile rAccessFile = new RandomAccessFile("trial.txt", "rw");
		try (rAccessFile) {
			// get the channel from the file
			FileChannel channel = rAccessFile.getChannel();

			// create the buffer
			ByteBuffer buffer1 = ByteBuffer.allocate(20);
			ByteBuffer buffer2 = ByteBuffer.allocate(100);

			// add messages and buffer is in write mode
			buffer1.put("First Data is out".getBytes());
			buffer2.put("Second Data still waiting".getBytes());
			// create a ByteBuffer Array
			ByteBuffer[] byteArray = { buffer1, buffer2 };
			buffer1.flip();
			buffer2.flip();
			// read from buffer into channel
			channel.write(byteArray);
			System.out.println();
		
		}
	}

}
