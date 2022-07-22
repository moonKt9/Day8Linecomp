package com.bridgelab;

public class LineComputation {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	double length1,length2;
	
	public LineComputation() {
		
	}
public LineComputation(int x2,int y2) {
	this.x2=x2;
	this.y2=y2;
		
	}


public int getX1() {
	return x1;
}
public void setX1(int x1) {
	this.x1 = x1;
}
public int getY1() {
	return y1;
}
public void setY1(int y1) {
	this.y1 = y1;
}
public int getX2() {
	return x2;
}
public void setX2(int x2) {
	this.x2 = x2;
}
public int getY2() {
	return y2;
}
public void setY2(int y2) {
	this.y2 = y2;
}
public double length1() {
	 return Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
	
}
public double length2() {
	 return Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
	
}
}
