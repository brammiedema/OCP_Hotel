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
public class BookingParty {
    private String reserverName;
    private int partySize;
    
    public BookingParty(String reserverName, int partySize){
        setPartySize(partySize);
        setReserverName(reserverName);
    }

    /**
     * @return the ReserverName
     */
    public String getReserverName() {
        return reserverName;
    }

    /**
     * @param ReserverName the ReserverName to set
     */
    public final void setReserverName(String reserverName) {
        if(reserverName.length() < 1){
            throw new IllegalArgumentException("length of name must be greater then 1");
        }
        this.reserverName = reserverName;
    }

    /**
     * @return the partySize
     */
    public int getPartySize() {
        return partySize;
    }

    /**
     * @param partySize the partySize to set
     */
    public final void setPartySize(int partySize) {
        if(reserverName.length() < 1){
            throw new IllegalArgumentException("size of party must be greater then 1");
        }
        this.partySize = partySize;
    }
}
