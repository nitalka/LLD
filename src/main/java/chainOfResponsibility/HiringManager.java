package chainOfResponsibility;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 07/01/22
 */
public class HiringManager extends Managers {

  public HiringManager(int approvalLimit, String name) {
    this.approvalLimit = approvalLimit;
    this.ManagerName = name;
  }

  @Override
  protected void processSalary(int empSalary) {
    System.out.println(this.ManagerName + " has approved on level 1, for salary " + empSalary);
  }
}
