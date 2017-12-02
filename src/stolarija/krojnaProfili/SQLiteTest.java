package stolarija.krojnaProfili;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLiteTest {
    
    private static Connection con;
    private static boolean hasData = false;
    
    public ResultSet displayUsers() throws ClassNotFoundException, SQLException{
        if(con == null){
            getConnection();
        }
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("SELECT * FROM user");
        return res;
    }

    private void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:SQLiteTest1.db");
        initilaze();
    }

    private void initilaze() throws SQLException {
        if (!hasData) {
            hasData = true;
            
            Statement state = con.createStatement();
            ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='user'");
            if (!res.next()) {
                System.out.println("Building the user able wih prepopulated values");
                // need to build the table
                Statement state2 = con.createStatement();
                state2.execute("CREATE TABLE user (id integer, fname varchar(60), lname varchar(60), primary key(id));");
                
                
                // inserting data
                PreparedStatement prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
                prep.setString(2, "Dusan");
                prep.setString(3, "Zoric");
                prep.execute();
                
                prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
                prep.setString(2, "Nikola");
                prep.setString(3, "Medic");
                prep.execute();
                
            }
        }
    }
    public void addUser (String fname, String lname) throws ClassNotFoundException, SQLException{
        if (con == null) {
            getConnection();
        }
        PreparedStatement prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
        prep.setString(2, fname);
        prep.setString(3, lname);
        prep.execute();
    }
    
    
}
