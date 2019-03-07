package com.sqli.shapes.shapes;

import java.io.StringWriter;

public class Shapes {

    private StringWriter out;
    private ShapeFactory shapeFactory = new ShapeFactory();

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(String shapeType, String dimensions) {
        Shape shape;
        try {
            shape = shapeFactory.createShape(shapeType);
            out.write((shape.calculateArea(dimensions)) + "\n");
        } catch (ShapeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
