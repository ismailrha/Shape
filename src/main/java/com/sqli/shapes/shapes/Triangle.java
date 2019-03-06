package com.sqli.shapes.shapes;

public class Triangle extends Shape {

	public int calculateArea(String dimensions) {
		int[] dimension = formatDimensionsToNumbers(dimensions);
		return (dimension[0] * dimension[1]) / 2;
	}

}