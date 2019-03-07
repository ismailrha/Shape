package com.sqli.shapes.shapes;

public class Square extends Shape {

    public int calculateArea(String dimensions) {
        int[] dimension = formatDimensionsToNumbers(dimensions);
        return dimension[0] * dimension[0];
    }

    public int[] formatDimensionsToNumbers(String dimensions) {
        String[] dimension = dimensions.split(",");
        int[] dimensionsFormatted = {Integer.parseInt(dimension[0])};
        return dimensionsFormatted;
    }
}
