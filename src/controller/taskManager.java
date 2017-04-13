
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import service.*;
import javax.swing.table.TableModel;
//import view.mainWindow.AdgerdTag;
/**
 *
 * @author Dottedsocks
 */
//TaskManager: takes requests from MainWindow and sends it to the appropriate service
//             Also takes the result from the services and sends it to MainWindow to update view
public class taskManager {
    SearchService JonaSearchService;
    BookingService BuiBookingService;
    
    
    public taskManager (){
        JonaSearchService = new SearchService();
        BuiBookingService = new BookingService();
    }
    
    //ShowResults gets the results from search service and creates a site
    public TableModel manageSearch(String toWhere, int date, int numbofPass, String fromWhere){
        
        return JonaSearchService.getFlights(toWhere, date, numbofPass, fromWhere);
         
    }
    //TODOD fall sem faer uppl fra bookingInfo og sendir a bookingService
    
    //TODO fall sem tekur vid uppl um bokunina 
    public void manageBooking(int meiriupll){
     // BuiBookingService.Flightbooking(meiriupll, PassName, ssno, meiriupll);
       
    }
    //TODO fall sem naer i upplysingar og sendir a booking ticket panel (a eftir ad gera)
    public TableModel getBookingInfo(){
        return BuiBookingService.bookingPassTable();
    }
    public TableModel getPassengerInfo(){
         return BuiBookingService.bookingFlightTable();
    }
    
    

}
