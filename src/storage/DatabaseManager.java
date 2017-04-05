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
    
    public ArrayList<Flight> leitleit(){
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
            ResultSet rs = statement.executeQuery("select *  from "+jon);
           
            int i = 0;
            while(rs.next())
             {
             // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
                Flight flug = new Flight();
                //flug.setAirline("airline");
                //flug.setArrival_time("arrival_time");
               // flug.setArrival_to(jon);
                //flug.setDeparture_from(jon);
               // theFlights.add(flug);
                //Flugin[i].setAirline(rs.getString("airline"));
               // Flugin[i].setArrival_time(rs.getInt("arrival_time"));
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