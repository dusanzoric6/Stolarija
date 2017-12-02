/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stolarija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Util {
    static HashMap<String, Double> stakloMap;
    static HashMap<String, Double> sarkeMap;
    static HashMap<String, Double> pvcSistemskiProzorMap;
    static HashMap<String, Double> pvcStokMap;
    static HashMap<String, Double> pvcSistemskiVrataMap;
    
    
    
    public static double stakloIzMape (String naziv){
    //        STAKLO MAPA
        stakloMap = new HashMap<>();
        stakloMap.put("obicno", 18.0);
        stakloMap.put("argon", 20.0);
        stakloMap.put("panel (ispuna)", 20.0);
        stakloMap.put("arsol-argon", 28.0);
        stakloMap.put("stopsol-argon", 40.0);
        
        return stakloMap.get(naziv);
    }
    public static double sarkeIzMape (String naziv){
//        SARKE MAPA
        sarkeMap = new HashMap<>();
        sarkeMap.put("male", 2.0);
        sarkeMap.put("velike", 9.0);
        
        return sarkeMap.get(naziv);
        }
    public static double sistemskiProzorIzMape (String naziv){   
//        PVC MAPA - SISTEMSKI METAR PROZOR
        pvcSistemskiProzorMap = new HashMap<>();
        pvcSistemskiProzorMap.put("roplasto 7001",11.0);
        pvcSistemskiProzorMap.put("winhouse garnet 70",6.5);
        
        return pvcSistemskiProzorMap.get(naziv);
    }
    public static double stokIzMape (String naziv){
//        PVC MAPA - STOK, T-PRECKA
        pvcStokMap = new HashMap<>();
        pvcStokMap.put("roplasto 7001",8.0);
        pvcStokMap.put("winhouse garnet 70",5.5);
        
        return pvcStokMap.get(naziv);
    }
    public static double sistemskiVrataIzMape (String naziv){
//        PVC MAPA - SISTEMSKI METAR VRATA
        pvcSistemskiVrataMap = new HashMap<>();
        pvcSistemskiVrataMap.put("roplasto 7001",14.0);
        pvcSistemskiVrataMap.put("winhouse garnet 70",10.0);
        
        return pvcSistemskiVrataMap.get(naziv);
    }

    
    public static void snimiStok (String pozicija , String tip, List lista) throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
       Statement stm = conn.createStatement();
        for ( Object d : lista) {
                stm.executeUpdate("insert into STOK_TBL (POZICIJA,TIP,DUZINA) values ('"+pozicija+"','"+tip+"' ,"+d+")");
        }
         stm.close();
         conn.close();
  
   };
    
    public static void snimiTPrecku (String pozicija , String tip, List lista) throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
       Statement stm = conn.createStatement();
        for ( Object d : lista) {
                stm.executeUpdate("insert into TPRECKA_TBL (POZICIJA,TIP,DUZINA) values ('"+pozicija+"','"+tip+"' ,"+d+")");
        }
         stm.close();
         conn.close();
  
   };
    
    public static void snimiKrilo (String pozicija , String tip, List lista) throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
        Statement stm = conn.createStatement();
        for ( Object d : lista) {
                stm.executeUpdate("insert into KRILO_TBL (POZICIJA,TIP,DUZINA) values ('"+pozicija+"','"+tip+"' ,"+d+")");
        }
        stm.close();
        conn.close();
  
   }
    public static void snimiLajsna (String pozicija , String tip, List lista) throws SQLException{
        try {
           Class.forName("org.sqlite.JDBC");
      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
        Statement stm = conn.createStatement();
        for ( Object d : lista) {
                stm.executeUpdate("insert into LAJSNA_TBL (POZICIJA,TIP,DUZINA) values ('"+pozicija+"','"+tip+"' ,"+d+")");
        }
      stm.close();
         conn.close();
   }
    public static void snimiOjacanje (String pozicija , String tip, List lista) throws SQLException{
        try { 
           Class.forName("org.sqlite.JDBC");
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
       Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
        Statement stm = conn.createStatement();
        for ( Object d : lista) {
                stm.executeUpdate("insert into OJACANJE_TBL (POZICIJA,TIP,DUZINA) values ('"+pozicija+"','"+tip+"' ,"+d+")");
        }
        stm.close();
      conn.close();
  
   }
    public static void snimiStaklo (String pozicija , String tip, List lista) throws SQLException{
        try { 
           Class.forName("org.sqlite.JDBC");
      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
         Statement stm = conn.createStatement();
        for ( Object d : lista) {
                stm.executeUpdate("insert into STAKLO_TBL (POZICIJA,TIP,POVRSINA) values ('"+pozicija+"','"+tip+"' ,'"+d+"')");
        }
        stm.close();
        conn.close();
    }
      public static void updateTable (String tabela) throws SQLException{
        
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
       
        
                String sql = "SELECT * FROM "+tabela+";";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                conn.close();
   }
}
