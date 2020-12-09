//Enrique Cueva
//enrique5@gmail.com
package com.company;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Pizza for Programmers!");
        System.out.println("---------------------------------");

        System.out.print("Enter first name: ");
        String first = input.next();

        System.out.print("Enter last name: ");
        String last = input.next();

        Random rn = new Random();
        int small = 10;
        int big = 99;
        int randomNum = rn.nextInt(big - small) + small;

        String end = Character.toString(first.charAt(first.length() - 1)).toUpperCase();
        String beg = last.substring(0, 3).toLowerCase();
        String code = end + randomNum + beg;

        System.out.println("Your order ID is: \"" + code + "\"");

        System.out.println("Because of COVID-19 we can only offer delivery orders.");
        System.out.print("Please enter your zipcode: ");
        String zipcode = input.next();

        Pizza order = new Pizza();

        int inches;
        String user;
        char crustType;
        char top;
        int numberOfToppings = 0;
        String toppings = "Cheese ";
        char bev;
        double cost;
        final double taxRate = 1.06;
        double total;
        double finalTotal;

        System.out.println("What size(inches) pizza would you like to order?");
        System.out.println("| Small 10in - $4.00 | Medium 12in - $6.00 | Large 14in - $8.00 | Extra Large 16in - 10.00 |");
        inches = input.nextInt();
        if (inches == 10) {
            order.setSize(10);
            order.setCost(4.00);
        } else if (inches == 12) {
            order.setSize(12);
            order.setCost(6.00);
        } else if (inches == 14) {
            order.setSize(14);
            order.setCost(8.00);
        } else if (inches == 16) {
            order.setSize(16);
            order.setCost(10.00);
        } else {
            System.out.println("Sorry we cannot make pizzas that size but will assume you would like a Medium.");
            order.setSize(12);
            order.setCost(6.00);
        }

        System.out.println("What type of crust would you like? ");
        System.out.println("| Hand-tossed | Thin-crust | Deep-dish | (enter H, T, or D) ");
        user = input.next();
        crustType = Character.toUpperCase(user.charAt(0));

        switch (crustType) {
            case 'H' -> order.setCrust("Hand-tossed");
            case 'D' -> order.setCrust("Deep-dish");
            case 'T' -> order.setCrust("Thin-crust");
            default -> { System.out.println("Invalid selection: Default is Hand-Tossed");
                order.setCrust("Hand-Tossed"); }
        }

        System.out.println("\nAll of our pizzas come with cheese.");
        System.out.println("Additional toppings are $1.00 each, you may choose from: ");
        System.out.println("| Pepperoni | Sausage | Chicken | Bacon | Jalapeños | Onions | Olives | Green Peppers | Mushrooms |\n");

        System.out.print("Would you like Pepperoni? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }
        System.out.print("Would you like Sausage? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }
        System.out.print("Would you like Chicken? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Chicken ";
        }
        System.out.print("Would you like Bacon? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Bacon ";
        }
        System.out.print("Would you like Jalapeños? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Jalapeños ";
        }
        System.out.print("Would you like Onions? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Onions ";
        }
        System.out.print("Would you like Olives? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Olives ";
        }
        System.out.print("Would you like Green Peppers? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Green Peppers ";
        }
        System.out.print("Would you like Mushrooms? (Y/N): ");
        user = input.next();
        top = Character.toUpperCase(user.charAt(0));
        if (top == 'Y') {
            numberOfToppings += 1;
            toppings = toppings + "Mushrooms ";
        }
        order.setNumToppings(numberOfToppings);
        order.setToppingList(toppings);

        System.out.println("\nWe appreciate your business and will include a beverage of your choice for free!");
        System.out.println("What type of drink would you like?");
        System.out.println("| Water | Juice | Soda | Beer | (enter W, J, S, or B) ");
        user = input.next();
        bev = Character.toUpperCase(user.charAt(0));

        switch (bev) {
            case 'W' -> order.setBeverage("Water");
            case 'J' -> order.setBeverage("Juice");
            case 'S' -> order.setBeverage("Soda");
            case 'B' -> order.setBeverage("Beer");
            default -> { System.out.println("Invalid selection: We will give you water");
                order.setBeverage("Water"); }
        }

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(first + " " + last + ", Your order is as follows: ");
        System.out.println("Zipcode: " + zipcode);
        System.out.println("One " + order.getSize() + " inch " + order.getCrust() + " pizza");
        System.out.println("Toppings: " + order.getToppingList());
        System.out.println("Beverage: " + order.getBeverage());
            cost = order.getCost();
            total = cost + (numberOfToppings * 1.00);
            finalTotal = total * taxRate;
            DecimalFormat df = new DecimalFormat("#.##");
            String formatted = df.format(finalTotal);

        System.out.println("Your total before tax is: $" + total);
        System.out.println("Your total including tax comes out to: $" +formatted);
        System.out.println("If you have any issues with your order contact the store and provide your order ID: " + code);
        System.out.println("-------------------------------------------------------------------------------------------------");

        }
    }
