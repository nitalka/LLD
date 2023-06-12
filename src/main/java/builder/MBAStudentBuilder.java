package builder;/*
 * Copyright (C) Lowe’s Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe’s Companies, Inc.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alka Kumari
 * @version 12/01/23
 */


public class MBAStudentBuilder extends StudentBuilder{

  @Override
  public StudentBuilder setCourses() {
    List<String> courses = new ArrayList<>();
    courses.add("finance");
    courses.add("sales");
    courses.add("operations");
   this.courses = courses;
    return this;
  }
}
