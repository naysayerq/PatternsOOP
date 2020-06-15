/*
 * Classname Quadrat
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

public class Quadrat extends Rectangle{


    // Constructor

    public Quadrat(int id, int length) {
        super(id, length, length);
    }


    // toString() method

    @Override
    public String toString() {
        return "Quadrat{}";
    }
}
