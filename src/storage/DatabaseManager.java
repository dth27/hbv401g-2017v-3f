/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author Dottedsocks
 */
public class DatabaseManager {
     /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:flug.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    //TODO Bua til SQL skipun
    public ArrayList<Flight> leitleit(String toWhere, int date, int numbofPpl, String fromWhere){
        Connection conCon = null;
        String jon = "person";
        ArrayList<Flight>  theFlights = new ArrayList<>();
        try
        {//nota id sem nafn med rs.eitthva
            conCon = DriverManager.getConnection("jdbc:sqlite:flug.db");
            Statement statement = conCon.createStatement();
            statement.setQueryTimeout(30);
            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person (id integer, name string)");
            statement.executeUpdate("insert into person values(1, 'leo')");
            statement.executeUpdate("insert into person values(2, 'yui')");
            
            ResultSet rs2 = statement.executeQuery("select * from schedule");
            
            ResultSet rs = statement.executeQuery("select * from flight where flight_id = (select schedule where departure_from = " + fromWhere + " and arrival_to ="+toWhere +" and flight_date=" +date + ")");
            
            int i = 0;
            while(rs.next())
             {
             // read the result set
 
                Flight flug = new Flight();
                flug.setAirline(rs.getString("airline"));
                flug.setArrival_time(rs.getInt("arrival_time"));
                flug.setArrival_to(rs.getString(""));
                flug.setDeparture_from(jon);
                theFlights.add(flug);
                //Flugin[i].setAirline(rs.getString("airline"));
                //Flugin[i].setArrival_time(rs.getInt("arrival_time"));
                i++;
             }
        
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
          
         
        }
        return theFlights;
    }
    
    public ArrayList fakeLeit(){
        ArrayList<Flight> flListi = new ArrayList<>();
        Flight flug, flug2, flug3;
        flug = new Flight();
        flug3 = new Flight();
        flug2 = new Flight();
        
        flug.setAirline("Rvk");
        flug.setArrival_time(1000);
        flug.setArrival_to("Akureyri");
        flug.setDeparture_from("Reykjavik");
        flug.setFlight_date(1001);
        flug.setDeparture_time(0);
        flug.setFlight_no("23");
        flug.setSeats(20);
        flug.setTicket_price(2300);
        
        flug2.setAirline("Ernir");
        flug2.setArrival_time(1020);
        flug2.setArrival_to("Akureyri");
        flug2.setDeparture_from("Reykjavik");
        flug2.setFlight_date(1001);
        flug2.setDeparture_time(0);
        flug2.setFlight_no("24");
        flug2.setSeats(20);
        flug2.setTicket_price(2200);
        
        flug3.setAirline("Flugfelag");
        flug3.setArrival_time(1020);
        flug3.setArrival_to("Isafjordur");
        flug3.setDeparture_from("Reykjavik");
        flug3.setFlight_date(1001);
        flug3.setDeparture_time(0);
        flug3.setFlight_no("21");
        flug3.setSeats(22);
        flug3.setTicket_price(100);
        
        flListi.add(flug);
        flListi.add(flug2);
        flListi.add(flug3);
        
        return flListi;
    }
    //TODO bua til SQL statement til thess ad baeta vid passeneger
    //TODO bua til SQL statament sem laekkar saetisfjolda
    //TODO laga inntak 
    //Ath. skilar engu
    public void updatePassenger(int no, String name){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlite:flug.db");
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30); 
            
            //Update farthegafjolda i schedule
            statement.executeQuery("select* from passenger");
            
        }catch(Exception e){
            System.out.println("Villa i updatePassenger: " + e);
        }
    }
    //TODO bua til SQL skipun sem tjekkar a saetisfjolda
    //availableSeats faer id a flugi og skilar saetisfjoldathess
    public int availableSeats(int flightId){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlite:flug.db");
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30); 
            
            //Update farthegafjolda i schedule
            statement.executeQuery("select* from passenger");
            
        }catch(Exception e){
            System.out.println("Villa i updatePassenger: " + e);
        }
       
        return 0;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:flug.db");
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.

          statement.executeUpdate("drop table if exists person");
          statement.executeUpdate("create table person (id integer, name string)");
          statement.executeUpdate("insert into person values(1, 'leo')");
          statement.executeUpdate("insert into person values(2, 'yui')");
          ResultSet rs = statement.executeQuery("select * from person");
          while(rs.next())
          {
            // read the result set
            System.out.println("name = " + rs.getString("name"));
            System.out.println("id = " + rs.getInt("id"));
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e);
          }
        }
      }
}