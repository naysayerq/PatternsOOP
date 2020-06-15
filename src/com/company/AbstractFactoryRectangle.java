/*
 * Classname AbstractFactoryRectangle
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *  2. Abstract factory.
 *
 */

package com.company;

import org.w3c.dom.css.Rect;

public class AbstractFactoryRectangle {

    public static Rectangle create(int a, int b){

        // if - else condition, checking for Quadrat

        if (a == b) {
            return new Quadrat(0, a);
        } else {
            return new Rectangle(a, b);
        }

    }

}
