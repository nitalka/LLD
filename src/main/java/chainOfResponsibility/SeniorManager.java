package chainOfResponsibility;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 07/01/22
 */
public class SeniorManager extends Managers {

  public SeniorManager(int approvalLimit, String name) {
    this.ManagerName = name;
    this.approvalLimit = approvalLimit;
  }

  @Override
  protected void processSalary(int empSalary) {
    System.out.println(this.ManagerName + " has approved on level 2, for salary " + empSalary);
  }
}
