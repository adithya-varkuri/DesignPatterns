package com.structural.adapter;

/**
 * Consider GeometricShape interface as a third party library interface or other applications interface
 * and have there own properties.
 *
 */
public interface GeometricShape {
	double area();
    double perimeter();
    void drawShape();

}
