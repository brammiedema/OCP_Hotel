/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.kyram.ocp_hotel.data;

import java.util.List;
import javax.naming.OperationNotSupportedException;
import nl.kyram.ocp_hotel.booking.Booking;

/**
 *
 * @author a632184
 */
public abstract class DatabaseConnectorFactory {
    /**
     * to implement
     */    
    private static DatabaseConnectorFactory databaseConnectorFactory;
    
    static DatabaseConnectorFactory getInstance(String type){
        
        if(type.equals("mysql")){
            databaseConnectorFactory = new MysqlDataConnector();
        }else{
            throw new UnsupportedOperationException(type + " connector not supported");
        }
       
        
        
        return databaseConnectorFactory;
    }
    
    public abstract void update();
    
    public abstract Booking getBooking(int id);
    
    public abstract List<Booking> getAllBookings();
    
    public abstract Booking createBooking(int id);
}
