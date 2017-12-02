package stolarija.krojnaProfili;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLiteStolarija {
    
    private static Connection conn;
    private static boolean hasData = false;
    
    static public void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db");
        initilaze();
        conn.close();
    }

    static public void initilaze() throws SQLException {
            
            DatabaseMetaData md = conn.getMetaData();
            ResultSet rs = md.getTables(null, null, "%", null);

        if (!rs.next()) {
            
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='stok'");
            
                // need to build the table
                Statement state2 = conn.createStatement();
                state2.execute("CREATE TABLE STOK_TBL (pozicija varchar(60), tip varchar(60), duzina double); ");
                        
                state2.execute("CREATE TABLE KRILO_TBL (pozicija varchar(60), tip varchar(60), duzina double); ");
                        
                state2.execute("CREATE TABLE LAJSNA_TBL (pozicija varchar(60), tip varchar(60), duzina double); ");
                        
                state2.execute("CREATE TABLE OJACANJE_TBL (pozicija varchar(60), tip varchar(60), duzina double); ");
                        
                state2.execute("CREATE TABLE STAKLO_TBL (pozicija varchar(60), tip varchar(60), povrsina varchar(60)); ");
                
                state2.execute("CREATE TABLE TPRECKA_TBL (pozicija varchar(60), tip varchar(60), duzina double); ");

                System.out.println("kreirane su nove tabele");
                state2.close();
                conn.close();
                
            }
            else{
                System.out.println("tabele vec postoje");
                conn.close();
            }
        }
    }
