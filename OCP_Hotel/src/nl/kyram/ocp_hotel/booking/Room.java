/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.kyram.ocp_hotel.booking;

/**
 *
 * @author a632184
 */
public class Room {
    private int maxOccupants;
    private double price;
    
    public Room(int maxOccupants, double price){
        setMaxOccupants(maxOccupants);
        setPrice(price);
    }

    /**
     * @return the maxOccupants
     */
    public int getMaxOccupants() {
        return maxOccupants;
    }

    /**
     * @param maxOccupants the maxOccupants to set
     */
    public final void setMaxOccupants(int maxOccupants) {
        if(maxOccupants < 1){
            throw new IllegalArgumentException("maxOccupants must be greater than 1");
        }
        this.maxOccupants = maxOccupants;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        
        return price;
    }

    /**
     * @param price the price to set
     */
    public final void setPrice(double price) {
        if(price < 1){
            throw new IllegalArgumentException("price must be greater than 1");
        }
        this.price = price;
    }
}
