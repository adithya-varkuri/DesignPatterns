package com.structural.adapter;

public class Main {
	
	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		
		/**
		 * As Rectangle and Circle are our application classes and implements shape
		 * So we can easily call below methods 
		 */
		drawing.addShape(new Rectangle());
		drawing.addShape(new Circle());
		
		/*
		 * drawing.draw(); 
		 * drawing.reSize();
		 */
		
		/**
		 * As Geometricshape is third party interface and it has its own properties 
		 * So classes which are implementing Geometricshape can not be added to drawing.addShape.
		 * Now if we need to add Geometricshape classes then we need to convert Geometricshape classes to 
		 * Shape classes. For this we need to create adaptor class which will convert Geometricshape classes to 
		 * Shape classes
		 */
		
		//Object Adapter
		drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
		
		//Class Adapter
		drawing.addShape(new TriangleAdapter());
		
		
		//Two way Adapters
		 drawing.addShape(new TwoWaysAdapter(ShapeType.RECTANGLE));
         drawing.addShape(new TwoWaysAdapter(ShapeType.CIRCLE));
         drawing.addShape(new TwoWaysAdapter(ShapeType.TRIANGLE));
         drawing.addShape(new TwoWaysAdapter(ShapeType.RHOMBUS));
		
		drawing.draw(); 
		drawing.reSize();
	}
}
