package builder;/*
 * Copyright (C) Lowe’s Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe’s Companies, Inc.
 */

import java.util.List;
import lombok.Getter;

/**
 * @author Alka Kumari
 * @version 12/01/23
 */

@Getter
public abstract class StudentBuilder {
  //disadvantage duplicacy of codes

  private int age;
  private String name;
  private String fatherName;
  private String motherName;
   List<String> courses;
  private int rollNo;


  public StudentBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public StudentBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public StudentBuilder setFatherName(String fatherName) {
    this.fatherName = fatherName;
    return this;
  }

  public StudentBuilder setMotherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  public StudentBuilder setCourses(List<String> courses) {
    this.courses = courses;
    return this;
  }

  public StudentBuilder setRollNo(int rollNo) {
    this.rollNo = rollNo;
    return this;
  }

  public Student build() {
    return new Student(this);
  }

  public abstract StudentBuilder setCourses() ;

}
