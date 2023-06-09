package com.shristi.training;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class ChanneltoChannel {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rFile = new RandomAccessFile("demo.txt", "rw");
		RandomAccessFile wFile = new RandomAccessFile("trial.txt", "rw");
		try (rFile;wFile) {
			FileChannel rchannel = rFile.getChannel();
			FileChannel wchannel = wFile.getChannel();
			rchannel.transferTo(0, rchannel.size(),wchannel);
		}
		
		RandomAccessFile readFile = new RandomAccessFile("trial.txt", "rw");
		RandomAccessFile writeFile = new RandomAccessFile("trial1.txt", "rw");
		try (readFile;writeFile) {
			FileChannel readChannel = readFile.getChannel();
			FileChannel writeChannel = writeFile.getChannel();
			writeChannel.transferFrom(readChannel, 0, readChannel.size());
		}
		
	}
}
