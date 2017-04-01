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
    SearchService Jona;
    public taskManager (){
        Jona = new SearchService();
    }
    public JPanel synumNyjaSidu(){
        JPanel jResultPanel = new JPanel();
       
        return jResultPanel;
        
    }
    public void buumTilLeit(String hvar, String hvenaer, int fjoldi, String hvadan){

        Jona.getFlights(hvar, hvenaer, fjoldi, hvadan);
        System.out.println("Jona sendir a Lovisu: " + hvar + " " + hvenaer +" " + fjoldi +" " + hvadan);
        
    }
    
    
}
