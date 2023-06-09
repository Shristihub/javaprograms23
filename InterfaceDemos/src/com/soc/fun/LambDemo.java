package com.soc.fun;

public class LambDemo {

	public static void main(String[] args) {
		
//		Compressor compressor = new JarCompressor();
		Convertor convertor = new Convertor();
//		convertor.showProcess(compressor, "demo.java","trial.java");
			
		convertor.showProcess(files ->{
			System.out.println("compressiong to jar");
			for (String file : files) {
				System.out.println("filename "+file);
			}
		},"demo.java","trial.java" );
		
		// for zip
		convertor.showProcess(files ->{
			System.out.println("compressiong to zip");
			for (String file : files) {
				System.out.println("filename "+file);
			}
		},"demo.txt","pic.jpg" );
		
		
		
	}

}
