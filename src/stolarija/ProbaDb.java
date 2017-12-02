/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stolarija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dusan
 */
public class ProbaDb {
    
    
     public static void main(String args[]) {
       
         String pozicija = "pozicija iz appa 15 12";
         String tip = "tip iz appa";
         
         try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/stolarijaDB", "dusan", "dudimir6");
            Statement stm = conn.createStatement();
             stm.executeUpdate("insert into STOK_TBL (POZICIJA,TIP,DUZINA) values ('"+pozicija+"','"+tip+"',2.8555558)");
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StartGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
   }
}
