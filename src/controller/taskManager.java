
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
    
    public taskManager (){
        JonaSearchService = new SearchService();
    }
    
    //ShowResults gets the results from search service and creates a site
    public TableModel manageSearch(String toWhere, int date, int numbofPpl, String fromWhere){
        
        return JonaSearchService.getFlights(toWhere, date, numbofPpl, fromWhere);
         
    }
    //fall sem byr til bokun og sendir a bookingservice
    

    
    
    
    
}
