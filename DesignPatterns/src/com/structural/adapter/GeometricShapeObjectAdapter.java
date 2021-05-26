package com.structural.adapter;


/**
 *  This class is a adapter class which converts GeometricShape interface to Shape interface
 * This is Object adapter. All the classes that are implementing GeometricShape interface can be converted to shape interface
 */
public class GeometricShapeObjectAdapter implements Shape {

	GeometricShape adapte;

	public GeometricShapeObjectAdapter(GeometricShape adapte) {
		this.adapte = adapte;
	}

	@Override
	public void draw() {
		adapte.drawShape();

	}

	@Override
	public void resize() {
		System.out.println(description() + " can't be resized. Please create new one with required values.");
	}

	@Override
	public String description() {
		if (adapte instanceof Triangle) {
			return "Triangle object";
		} else if (adapte instanceof Rhombus) {
			return "Rhombus object";
		} else {
			return "Unknown object";
		}
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
