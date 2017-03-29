/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import storage.*;

/**
 *
 * @author Dottedsocks
 */
public class SearchService { 
    DatabaseManager Lovisa;
    public SearchService(){
       Lovisa = new DatabaseManager();
        
    }
    //Býr til leit, sendum á userSearch
    public void createSearch(String hvar, String hvenaer, int fjoldi, String hvadan){
        //Hofum hér samband við SqlDaemi?
        try{
        Lovisa.leitleit();
        //System.out.println("Lovisa stóð sig!");
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
