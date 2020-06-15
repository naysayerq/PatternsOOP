/*
 * Classname AbstractFactory
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *
 *  2. Abstract factory.
 *
 */

package com.company;

import org.w3c.dom.css.Rect;

public class AbstractFactory {

    public static IGeometry create(int a, int b, String type){


        // switch - case
        // determines, what figure it is and creates object

        switch (type){

            case ("Triangle"):
                return new Triangle (a, b);
            case ("Rectangle"):
                return new Rectangle(a, b);
            case ("Cone"):
                return new Cone(a, b);
            default:
                return null;
        }

    }

}
