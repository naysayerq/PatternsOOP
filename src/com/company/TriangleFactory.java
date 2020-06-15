/*
 * Classname TriangleFactory
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *
 *  1. Factory.
 *
 */

package com.company;

public class TriangleFactory {

    public static Triangle create(int a, int b, int c){

        // if - else condition, checking if this triangle can exist
        // and if yes, creates an object

        if (a + b > c) {
            return new Triangle(a, b, c);
        } else {
            return null;
        }

    }

}
