package com.structural.adapter;

/**
 * This is class adapter
 * Thic class can only convert Triangle class to Shape interface
 *
 */
public class TriangleAdapter extends Triangle implements Shape{
	

	@Override
	public void draw() {
		drawShape();
	}

	@Override
	public void resize() {
		System.out.println(description() + " can't be resized. Please create new one with required values.");
	}

	@Override
	public String description() {
		return "Triangle object";
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
