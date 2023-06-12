package builder;/*
 * Copyright (C) Lowe’s Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe’s Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 12/01/23
 */


public class Director {
  private StudentBuilder studentBuilder;

  public Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent() {
    if(studentBuilder instanceof MBAStudentBuilder){
      return createMBAStudent();
    } else if (studentBuilder instanceof EngineeringStudentBuilder) {
      return createEngineeringStudent();
    }
    return null;
  }

  private Student createMBAStudent(){
    return studentBuilder.setAge(24).setRollNo(1).setName("soham").setCourses().build();
  }

  private Student createEngineeringStudent(){
    return studentBuilder.setAge(21).setRollNo(4).setName("sonali")
        .setFatherName("rahul").setMotherName("binita").setCourses().build();
  }
}
