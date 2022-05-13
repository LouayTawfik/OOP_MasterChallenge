package com.company.Louay;

public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Buffalo", 50.00, "Brown");
//        hamburger.addHamburgerAddition1("Tomato", 12.0);
//        hamburger.addHamburgerAddition2("Onions", 10.0);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Buffalo", 100.0);
        healthyBurger.addHealthAddition1("Lentils", 10.0);
        healthyBurger.addHamburgerAddition2("Sauce", 20.0);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

//        DeluxeBurger dB = new DeluxeBurger();
//        System.out.println("Total Deluxe Burger price is " + dB.itemizeHamburger());
//        dB.addHamburgerAddition1("ay 7aga", 50.0);
//        dB.addHamburgerAddition2("ay 7aga tany", 20.0);




    }
}
