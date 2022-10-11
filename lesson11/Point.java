package com.bilgeadam.course04.lesson11;

public class Point {
	String name;
	int xCoord;
	int yCoord;
	int zCoord;
	
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;
		return this.xCoord == other.xCoord && this.yCoord == other.yCoord && this.zCoord == other.zCoord;
	}
}
