package com.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

	List<Shape> shapes = new ArrayList<Shape>();

	public Drawing() {
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	public List<Shape> getShapes() {
		return new ArrayList<Shape>(shapes);
	}

	public void draw() {
		if(shapes.isEmpty()) {
			System.out.println("No shapes to Draw");
		}else {
			shapes.stream().forEach(shape -> shape.draw());
		}
	}
	
	public void reSize() {
		if(shapes.isEmpty()) {
			System.out.println("No shapes to Resize");
		}else {
			shapes.stream().forEach(shape -> shape.resize());
		}
	}
	
}
