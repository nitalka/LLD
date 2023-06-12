package builder;/*
 * Copyright (C) Lowe’s Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe’s Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 12/01/23
 */


public class Main {

  public static void main(String[] args) {
    Director director = new Director(new EngineeringStudentBuilder());
    Director director1 = new Director(new MBAStudentBuilder());

    Student engineer = director.createStudent();
    Student mba = director1.createStudent();

    System.out.println(engineer.toString());
    System.out.println(mba.toString());
  }

}
