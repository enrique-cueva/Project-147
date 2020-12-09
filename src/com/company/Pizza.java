package com.company;

public class Pizza {
    private String beverage;
    private double cost;
    private String crust;
    private int size;
    private int numToppings;
    private String toppingList;

    public Pizza() {
        cost = 0.0;
        crust = "Hand-tossed";
        size = 0;
        numToppings = 0;
        toppingList = null;
        beverage = "None";
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public void setCost (double cost) {
        this.cost += cost;
    }

    public void setCrust (String crust) {
        this.crust = crust;
    }

    public void setSize (int size) {
        this.size = size;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public void setToppingList (String toppingList) {
        this.toppingList = toppingList;
    }
    public String getBeverage() {
        return beverage;
    }
    public double getCost() {
        return cost;
    }

    public String getCrust() {
        return crust;
    }

    public int getSize() {
        return size;
    }

    public String getToppingList() {
        return toppingList;
    }

}
