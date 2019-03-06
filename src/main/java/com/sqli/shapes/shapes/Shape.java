package com.sqli.shapes.shapes;

public abstract class Shape {

	public abstract int calculateArea(String dimensions);

	public int[] formatDimensionsToNumbers(String dimensions) {
		String[] dimension = dimensions.split(",");
		int[] dimensionsFormatted = { Integer.parseInt(dimension[0]), Integer.parseInt(dimension[1]) };
		return dimensionsFormatted;
	}
}
