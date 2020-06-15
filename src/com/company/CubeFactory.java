/*
 * Classname CubeFactory
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *
 *  1. Factory
 *
 */

package com.company;

public class CubeFactory {

    // Creating new Cube object with side parameter

    public static Cube create(int side){

        Cube cube = new Cube(side);

        return cube;

    }

}
