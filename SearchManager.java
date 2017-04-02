/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package styring;
import vidmot.Aðalgluggi;
import vinnsla.UserSearch;
/**
 *
 * @author Dottedsocks
 */
public class SearchManager {
    Aðalgluggi Gluggi;
    
    public SearchManager(Aðalgluggi gluggi){
        Gluggi = gluggi;
        
    }
    //Býr til leit, sendum á userSearch
    public void createSearch(){
        //Hofum hér samband við SqlDaemi?
        UserSearch leit = new UserSearch();
        leit.createFlights(Gluggi.);
    }
    
}
