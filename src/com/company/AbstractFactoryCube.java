/*
 * Classname AbstractFactoryCube
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *  2. Abstract factory.
 *
 */

package com.company;

public class AbstractFactoryCube {

    public static Cube create(int a){

        // if - else condition
        // checking side for incorrect value and for value == 4

        // creating cube with parameter a

        if (a == 4){
            System.out.println("Side of cube is " + a + "!");
            return new Cube (a);
        } else if (a <= 0){
            System.out.println("Incorrect side!");
        } else {
            return new Cube(a);
        }
        return null;

    }

}

