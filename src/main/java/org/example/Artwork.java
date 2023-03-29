package org.example;

public class Artwork {

    // PROPERTIES
    private String title;
    private double price;
    private int NFT;


    // CONSTRUCTOR
    public Artwork( String title, double price, int NFT){
        this.title = title;
        this.price = price;
        this.NFT = NFT;
    }

    // GETTERS
     public String getTitle(){
        return this.title;
     }
     public double getPrice(){
        return this.price;
     }
     public int getNFT(){
        return this.NFT;
     }

     // SETTERS

    public void setPrice(double newPrice){ this.price = newPrice;}


}
