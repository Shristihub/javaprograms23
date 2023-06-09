package com.soc.fun;

public class Convertor {

	public void showProcess(Compressor compressor, String... files) {
		System.out.println("Process of compression");
		compressor.compressFiles(files);
		System.out.println("Successfully completed");
		
	}
}
