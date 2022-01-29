package decorator;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public class CoffeeHouse {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getBeverageName());
    System.out.println(beverage.getPrice());

    System.out.println("After decorating with milk");

    beverage = new Milk(beverage);
    System.out.println(beverage.getBeverageName());
    System.out.println(beverage.getPrice());

    System.out.println("After decorating with milk and caramel");

    beverage = new Caramel(beverage);
    System.out.println(beverage.getBeverageName());
    System.out.println(beverage.getPrice());

    System.out.println("After decorating with milk and double caramel");

    beverage = new Caramel(beverage);
    System.out.println(beverage.getBeverageName());
    System.out.println(beverage.getPrice());

  }


}
