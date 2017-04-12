/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import model.*;
import storage.*;
/**
 *
 * @author Dottedsocksjkljn
 */
public class BookingService {
    Booking booking;
    DatabaseManager GretaTheDBManager;
    //ticket price
    //passenger info
    //booking no
    // payment
    // id
    // addPass
    
    //remove Pass
    //getTicketPrice
    //UpadetPayment
    
    //Fall þar sem byr til bókun
    public void Flightbooking(int flightId, String[] PassName, int[] ssno, int numbofPass){
        booking = new Booking();
        if (GretaTheDBManager.availableSeats(flightId)>=0){
            addPassenger(numbofPass);
            //createPassenger();
        }else {
            System.out.println("EKKERT LAUST");
        }
        
    }
     public void addPassenger(int passenger){
        GretaTheDBManager = new DatabaseManager();
        for (int i=0; i<passenger; i++){
            GretaTheDBManager.updatePassenger(i, "nafn");
            
        }
        
    }
     //tjekka hvort booking se til
     public void createPassenger(String[] PassName, int[] ssno){
         
         Passenger pass = new Passenger();
         pass.setBookingId(0);
         pass.setName("name");
         pass.setSSno(0);
         
     }
    public void removePassenger(int passenger){
        
    }
        
     public boolean updatePayment(){
        return true;
    }
    
}
