package com.shristi.training;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureDemo {
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		AsynchronousFileChannel channel =AsynchronousFileChannel.open(Paths.get("trial1.txt"), StandardOpenOption.READ);
		
		// create a buffer
		ByteBuffer buffer1 = ByteBuffer.allocate(200);
		// read from channel into buffer
		Future<Integer> futureOp = channel.read(buffer1, 0);
		
		while(!futureOp.isDone()) {
			System.out.println("continue");
			System.out.println("Still processing");
		}
		buffer1.flip();
//		int result = futureOp.get();
		
//		System.out.println(result);
		while (buffer1.hasRemaining()) {
			System.out.print((char) buffer1.get());
		}
		
		
		
	}

}
