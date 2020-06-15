/*
 * Classname RectangleFactory
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

public class RectangleFactory {

    public static Rectangle create (int id, int length, int width) {

        // Creating Rectangle object with three parameters (id, length, width)

        Rectangle rectangle = new Rectangle(id, length, width);

        return rectangle;
    }

}
