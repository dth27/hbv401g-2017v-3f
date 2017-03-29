/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dottedsocks
 */
public class Booking {
    private int Ticket_price;
    private int Passenger_info;
    private int Booking_info;
    private boolean paid;

    /**
     * @return the Ticket_price
     */
    public int getTicket_price() {
        return Ticket_price;
    }

    /**
     * @param Ticket_price the Ticket_price to set
     */
    public void setTicket_price(int Ticket_price) {
        this.Ticket_price = Ticket_price;
    }

    /**
     * @return the Passenger_info
     */
    public int getPassenger_info() {
        return Passenger_info;
    }

    /**
     * @param Passenger_info the Passenger_info to set
     */
    public void setPassenger_info(int Passenger_info) {
        this.Passenger_info = Passenger_info;
    }

    /**
     * @return the Booking_info
     */
    public int getBooking_info() {
        return Booking_info;
    }

    /**
     * @param Booking_info the Booking_info to set
     */
    public void setBooking_info(int Booking_info) {
        this.Booking_info = Booking_info;
    }

    /**
     * @return the paid
     */
    public Boolean getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
    
    public void addPassenger(int passenger){
        
    }
    public void removePassenger(int passenger){
        
    }
    public boolean updatePayment(){
        return true;
    }
}
