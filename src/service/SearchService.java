/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import storage.*;
import model.Flight;


/**
 *
 * @author Dottedsocks
 */
public class SearchService { 
    DatabaseManager LovisaDBmanager;
    private ArrayList<Flight> flightInfo;
    public SearchService(){
       LovisaDBmanager = new DatabaseManager();
       flightInfo = new ArrayList<>();
       
    }
    //Býr til leit, sendum á userSearch
    public DefaultTableModel getFlights(String toWhere, int date, int numbofPpl, String fromWhere){
        //Hofum hér samband við SqlDaemi?
        DefaultTableModel flightmodel = new DefaultTableModel();
        try{
        flightInfo = LovisaDBmanager.fakeLeit();
        //flightInfo = LovisaDBmanager.leitleit(toWhere, date, numbofPpl, fromWhere);
        sortFlights(flightInfo);
        flightmodel = flugIToflu();

        }catch (Exception e){
           System.out.println(e);
        }
        return flightmodel;    
    }
    public void sortFlights(ArrayList<Flight> a){
        try{
        Collections.sort(a);
        } catch (Exception e){
            System.out.println("Villa i sort: "+ e );
        }
    }

    /**
     * @return DefaultTablemodel
     * the search results in a table model
     */
    
    public DefaultTableModel flugIToflu(){
        
        String col[] = {"arrivingTime","airline","departingTime", "date", "price", "destination", "departingfrom", "flight number"};
        DefaultTableModel Tablemodel = new DefaultTableModel(col, 0);
        
        for (int i = 0; i< flightInfo.size(); i++){
            int arrTime = flightInfo.get(i).getArrival_time();
            String airline = flightInfo.get(i).getAirline();
            int depTime = flightInfo.get(i).getDeparture_time();
            int FlDate = flightInfo.get(i).getFlight_date();
            int ticketPrice = flightInfo.get(i).getTicket_price();
            String destination = flightInfo.get(i).getArrival_to();
            String departingFrom = flightInfo.get(i).getDeparture_from();
            String flightNO = flightInfo.get(i).getFlight_no();
            Object[] data = {arrTime, airline, depTime, FlDate, ticketPrice, destination, 
                               departingFrom, flightNO};
             Tablemodel.addRow(data);
        }
        return Tablemodel;
    }
    
}
