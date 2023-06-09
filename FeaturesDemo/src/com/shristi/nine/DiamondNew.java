package com.shristi.nine;

public class DiamondNew {

	public static void main(String[] args) {

		// before java 9
		Mapper<String> mapper = new Mapper<String>("John") {
			@Override
			public void mapData() {
				System.out.println(data.toUpperCase());
			}
		};
		mapper.mapData();

		// post java 9 
		Mapper<String> mapperOne = new Mapper<>("John") {
			@Override
			public void mapData() {
				System.out.println(data.toUpperCase());
			}
		};
		mapperOne.mapData();
	}
}
