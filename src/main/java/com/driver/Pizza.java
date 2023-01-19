package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean cheeseAdded = false;
    boolean toppingsAdded = false;

    private boolean takeawayAdded = false;

    private int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            this.price = 300;

        }
        else {
            this.price = 400;

        }
        basePrice = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(!cheeseAdded) {

            cheeseAdded = true;
            this.price += 80;

        }
    }

    public void addExtraToppings(){
       if(!toppingsAdded) {
            toppingsAdded = true;
            if (isVeg == true) {
                price += 70;
            } else {
                price += 120;
            }

        }

    }

    public void addTakeaway(){
        if(!takeawayAdded){
            takeawayAdded = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        int toppings;
        if(isVeg){
            toppings = 70;
        }
        else{
            toppings = 120;
        }
        StringBuilder str = new StringBuilder("");
        str.append("Base Price for the Pizza is: "+ basePrice +'\n');
        if(cheeseAdded){
            str.append("Extra Cheese is Added: "+80+'\n');
        }
        if(toppingsAdded){
            str.append("Extra Topping is Added: "+toppings+'\n');
        }
        if(takeawayAdded){
            str.append("Paper bag is Added: "+20+'\n');
        }
        str.append("Total Price is: "+price+'\n');
        bill = str.toString();
        return this.bill;
    }
}