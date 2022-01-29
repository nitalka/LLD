package chainOfResponsibility;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 07/01/22
 */
public abstract class Managers {

  protected Managers manager;
  String ManagerName;
  int approvalLimit;

  public void setManager(Managers manager) {
    this.manager = manager;
  }

  public void approveSalary(int empSalary) {
    if (approvalLimit > empSalary) {
      processSalary(empSalary);
    } else if (manager != null) {
      manager.approveSalary(empSalary);
    } else {
      System.out.println("Cannot make the offer to candidate");
    }
  }

  protected abstract void processSalary(int empSalary);

}
