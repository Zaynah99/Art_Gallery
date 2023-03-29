package org.example;
import java.util.ArrayList;

public class Gallery {

    // PROPERTIES
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0; //assume no money in till
        this.stock = new ArrayList<>();
    }


    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }


    public double getTill(){
        return this.till;
    }
    public void setTill(double newTill){
        this.till = newTill;
    }


    public ArrayList<Artwork> getStock(){
        return this.stock;
    }
    public void setStock(ArrayList<Artwork> newStock){
        this.stock = newStock;
    }

    // METHODS
    public void addMoneyToTill(Artwork artwork){
        this.till += artwork.getPrice();
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public void removeArtwork(Artwork artwork){
        this.stock.remove(artwork);
    }

    public int getStockSize(){
        return this.stock.size();
    }


}
