/*
 * Classname Triangle
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

public class Triangle implements IGeometry{

    // Parameters

    private double a;
    private double b;
    private double c;

    // FULL constructor

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Constructor with ONLY 2 parameters, created for Abstract Factory

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a + b*b);
    }

    // EMPTY constructor

    public Triangle() {
    }

    // Getters & Setters

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // toString() method

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
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
