/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import service.*;
import javax.swing.JPanel;
//import view.mainWindow.AdgerdTag;
/**
 *
 * @author Dottedsocks
 */

public class taskManager {
    SearchService JonaSearchService;
    public taskManager (){
        JonaSearchService = new SearchService();
    }
    public JPanel synumNyjaSidu(){
        JPanel jResultPanel = new JPanel();
       
        return jResultPanel;
        
    }
    public void buumTilLeit(String toWhere, String date, int numberOfPas, String fromWhere){

        JonaSearchService.getFlights(toWhere, date, numberOfPas, fromWhere);
        System.out.println("Jona sendir a Lovisu: " + toWhere + " " + date +" " + numberOfPas +" " + fromWhere);
        
    }
    
    
}
