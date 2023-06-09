package com.shristi.nine;

public abstract class Mapper<T> {
	T data;
	public Mapper(T data) {
		this.data = data;
	}
	
	public abstract void mapData();
}
