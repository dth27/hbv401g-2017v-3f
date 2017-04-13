/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.*;
import storage.*;
/**
 *
 * @author Dottedsocksjkljn
 */
public class BookingService {
    Booking booking;
    DatabaseManager GretaTheDBManager = new DatabaseManager();

   //Fyrst bua til bokun svo passenger
    
    public void Flightbooking(int flightId, String[] PassName, int[] ssno, int numbofPass){
        booking = new Booking();
        
        
        if (GretaTheDBManager.availableSeats(flightId)>=0){ //TODO ekki null heldur fjoldi farthega
            //TODO  setning kallar a fall i databasemanager sem byr til bokun
            
            //for(;;) //TODO forlykkja til ad ytra igegnum td passname
            //TODO na i bookingno
            int bookingNo = 1; //TODO laga
             addPassenger(numbofPass, PassName, ssno, bookingNo);
            
            //createPassenger();
        }else {
            System.out.println("EKKERT LAUST");
        }
        
    }
 
     public void addPassenger(int passenger, String[] Passname, int[] SSno, int bookingNo){
        for (int i=0; i<passenger; i++){
            GretaTheDBManager.updatePassenger(i, Passname[i], SSno[i], bookingNo);
        }
        
    }
     //TODO kallar a Databasemanager og naer i upls ur gagnagrunni
     public ArrayList getFlight(int bookingNo){
         return null;
     }
     public ArrayList getPassenger(){
         return null;
     }
     //sleppa nema timi gefst
    public void removePassenger(int passenger){
        
    }
     //sleppa nema timi gefst   
     public boolean updatePayment(){
        return true;
    }
     //TODO SQL skipun i databasemanager sem naer i MAX bookingno 
     //plusa vid einn her.
    public int getBookingNo(){
        int i = GretaTheDBManager.getMaxBookingNo();
        return i+1;
    }
    
    public DefaultTableModel bookingPassTable(){
        //TODO na i upplysingar um passenger og setja i Tablemodel og skila
        //getPassenger
        return null;
    }
    public DefaultTableModel bookingFlightTable(){
        //TODO na i upplysingar um flug og setja i tablemodel og skila
        //getFlight
        return null;
    }
}
