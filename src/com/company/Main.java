/*
 * Classname Main
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *
 * Module 2 Task 4
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class:
 *
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student.
 *
 */

package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {


        // 1st method of object creation

        Rectangle rectangle1 = new Rectangle(1, 3, 4);


        // 2nd method of object creation

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setId(2);
        rectangle2.setLength(4);
        rectangle2.setWidth(7);


        // 3rd method of object creating (FACTORY)

        Rectangle rectangle3 = RectangleFactory.create(3, 4, 5);


        // 4th method of object creating (ABSTRACT FACTORY)

        IGeometry cube5 = AbstractFactoryCube.create(4);

        System.out.println(cube5);



        // ----------------------------------
        // Creating student object WITHOUT builder


        Student Andrew = new Student("Andriy", "Skryp", "Andriyovich",
                LocalDate.of(1998, Month.OCTOBER, 14),
                21, true, "Male", 5, "Bangol322@gmail.com", "+380501432916",
                "Perechyn, Ukraine", "Software-Engineer", "Systems Software",
                356128, 76, false, true, false,
                false, false, false,
                2, false, false, 0);



        // Creating student object WITH builder

        Student Vasya = new Student.Builder()
                .setFirstName("Vasya")
                .setLastName("Petrov")
                .setPatronymic("Jamesovich")
                .setBirthday(LocalDate.of(1995, Month.MARCH, 6))
                .setAge(24)
                .setIsAdult(true)
                .setGender("Male")
                .seteMail("rand3124@gmail.com")
                .setPhoneNumber("+9385285670")
                .setPlaceOfResidence("Bratislava, Slovakia")
                .setSpeciality("Designer")
                .setChair("RandChair")
                .setMarksheetNumber(591646)
                .setAverageScore(73)
                .setIsStateEmployee(true)
                .setIsSportsActivist(false)
                .setIsCulturalActivist(false)
                .setIsPublicFigure(true)
                .setIsPrivileged(true)
                .setIsScholar(false)
                .setParticipationsInScientificConferences(5)
                .setHasWork(false)
                .setIsCaptain(true)
                .setRetakingExams(3)
                .build();




        // Creating student object with method setSimilarTo()

        Student Petro = new Student.Builder()
                .setSimilarTo(Andrew)
                .setFirstName("Petro")
                .setLastName("Petrenko")
                .setPatronymic("Randomovych")
                .build();


        // Checking Info

        System.out.println(Andrew);
        System.out.println(Vasya);
        System.out.println(Petro);


    }
}
