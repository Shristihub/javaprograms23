package com.soc.fun;

public interface Compressor {

	void compressFiles(String... files);
}

//class JarCompressor implements Compressor{
//	@Override
//	public void compressFiles(String... files ) {
//		// Logic to compress to jar
//		for (String file : files) {
//			System.out.println("filename "+file);
//		}
//		System.out.println("compressed as a jar");
//	}
//	
//}
//class ZipCompressor implements Compressor{
//	@Override
//	public void compressFiles(String... files ) {
//		
//		for (String file : files) {
//			System.out.println("filename "+file);
//		}
//		// Logic to compress to zip
//		System.out.println("compressed as a zip");
//	}
	
//}
