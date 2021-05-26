package com.structural.adapter;

//Example this interface shape is our project interface and has below methods and implemented by Rectangle,circle classes
public interface Shape {
	void draw();

	void resize();

	String description();

	boolean isHide();

}
