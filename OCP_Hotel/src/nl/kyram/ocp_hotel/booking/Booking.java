
package nl.kyram.ocp_hotel.booking;

import java.util.List;

/**
 *
 * @author A.T Miedema
 */
public class Booking {
    private List<Room> rooms;
    private BookingParty bookingParty;
    
    /**
     *
     * @param bookingParty
     * @param rooms
     */
    public Booking(BookingParty bookingParty, List<Room> rooms){
        setBookingParty(bookingParty);
        setRooms(rooms);
    }

    /**
     * @return the rooms
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public final void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * @return the bookingParty
     */
    public BookingParty getBookingParty() {
        return bookingParty;
    }

    /**
     * @param bookingParty the bookingParty to set
     */
    public final void setBookingParty(BookingParty bookingParty) {
        this.bookingParty = bookingParty;
    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
