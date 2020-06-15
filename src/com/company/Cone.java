/*
 * Classname Cone
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

public class Cone implements IGeometry{

    // Parameters

    private int radius;
    private int height;

    // EMPTY constructor

    public Cone(){
    }

    // FULL constructor

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Getters & Setters

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    // toString() method

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }


    // IGeometry methods

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getLinearLength() {
        return 0;
    }
}
