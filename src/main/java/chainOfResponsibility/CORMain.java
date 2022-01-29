package chainOfResponsibility;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 07/01/22
 */
public class CORMain {

  public static void main(String[] args) {
    ChainCreator chainCreator = new ChainCreator();
    Managers manager = chainCreator.createChain();
    manager.approveSalary(33000);

  }

}
