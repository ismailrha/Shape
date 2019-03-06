package com.sqli.shapes.shapes;

public class ShapeFactory {

	private final String SQUARE = "SQUARE";
	private final String RECTANGLE = "RECTANGLE";
	private final String TRIANGLE = "TRIANGLE";

	public Shape createShape(String shapeType) throws ShapeException {

		if (shapeType.equals(TRIANGLE)) {
			return new Triangle();

		} else if (shapeType.equals(RECTANGLE)) {
			return new Rectangle();

		} else if (shapeType.equals(SQUARE)) {
			return new Square();
		} else
			throw new ShapeException("shape not initialized");
	}
}
