/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.ArrayList;
import java.util.Collections;
import storage.*;
import model.Flight;


/**
 *
 * @author Dottedsocks
 */
public class SearchService { 
    DatabaseManager LovisaDBmanager;
    ArrayList<Flight> flightInfo;
    public SearchService(){
       LovisaDBmanager = new DatabaseManager();
       flightInfo = new ArrayList<>();
       
    }
    //Býr til leit, sendum á userSearch
    public void getFlights(String hvar, String hvenaer, int fjoldi, String hvadan){
        //Hofum hér samband við SqlDaemi?
        try{
        flightInfo = LovisaDBmanager.leitleit();
        
        //System.out.println("LovisaDBmanager stóð sig!");
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
        
    }
    public void sortFlights(){
        Collections.sort(flightInfo);
    }
    
}
