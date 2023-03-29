package org.example;

public class Customer {

    // PROPERTIES

    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void setName(String newName){ this.name = newName;}

    public void setWallet(double newWallet){this.wallet = newWallet;}

    // METHODS
    public void removeMoney(Artwork artwork){
        this.wallet -= artwork.getPrice();
    }



}


