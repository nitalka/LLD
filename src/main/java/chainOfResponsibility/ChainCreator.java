package chainOfResponsibility;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 07/01/22
 */
public class ChainCreator {

  public Managers createChain() {
    HiringManager hiringManager = new HiringManager(5000, "Mike");
    SeniorManager seniorManager = new SeniorManager(15000, "Jack");
    Director director = new Director(25000, "Kale");

    hiringManager.setManager(seniorManager);
    seniorManager.setManager(director);
    return hiringManager;

  }

}
