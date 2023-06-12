package builder;/*
 * Copyright (C) Lowe’s Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe’s Companies, Inc.
 */

import java.util.List;

/**
 * @author Alka Kumari
 * @version 12/01/23
 */


public class Student {

  private int age;
  private String name;
  private String fatherName;
  private String motherName;
  private List<String> courses;
  private int rollNo;

  public Student(StudentBuilder builder) {
    this.age = builder.getAge();
    this.fatherName = builder.getFatherName();
    this.motherName = builder.getMotherName();
    this.rollNo = builder.getRollNo();
    this.courses = builder.getCourses();
    this.name = builder.getName();
  }

  public String toString() {
    return ""+ " roll number: " + this.rollNo +
        " age: " + this.age +
        " name: " + this.name +
        " father name: " + this.fatherName +
        " mother name: " + this.motherName +
        " subjects: " + this.courses.get(0) + "," + courses.get(1) + "," + courses.get(2);

  }
}
