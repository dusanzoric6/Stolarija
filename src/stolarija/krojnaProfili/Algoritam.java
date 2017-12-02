
package stolarija.krojnaProfili;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.optimization.CuttingStock;

public class Algoritam {
    
    static int[] toIntArray(List <Integer> lista){
        int[] ret = new int[lista.size()];
        for(int i=0; i<ret.length; i++){
            ret[i] = lista.get(i);
        }
        return ret;
    }
    
    static List listaZaIspis(int duzina, int broj){
        List ret = new ArrayList();
        for(int i=0; i<broj; i++){
            ret.add(duzina);
        }
        return ret;
    }
    
   //    Vraca String iz buildera za text     ***************************************************** 
    public static String getListaSipki (String NAZIV_TBL) throws SQLException{
        List<DuzinaICount> listaReturn = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Algoritam.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
            try{
              String sql = "SELECT duzina, COUNT(duzina) AS 'count'  FROM "+NAZIV_TBL+" GROUP BY duzina";
              PreparedStatement pst = conn.prepareStatement(sql);
              ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    double duzina = rs.getDouble("duzina");
                    int count = rs.getInt("count");
                    
                DuzinaICount o = new DuzinaICount(duzina, count);
                listaReturn.add(o);
                }
            }
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, e);
             } 
       

        List <DuzinaICount> listaObj = listaReturn;
        List <Double>listaDuzinaDouble = new ArrayList<Double>();
        List <Integer>listaDuzinaInt = new ArrayList();
        List <Integer>listaCountInt = new ArrayList();
        StringBuilder builder = new StringBuilder();
        
        for(DuzinaICount d : listaObj){
            listaDuzinaDouble.add(d.getDuzina());
            listaCountInt.add(d.getCount());
        }
        for(Double d : listaDuzinaDouble){
            listaDuzinaInt.add(d.intValue());
        }

        int duzine[]= toIntArray(listaDuzinaInt);
	int count[]=toIntArray(listaCountInt);
                
        int i=0;
        int duzinaSipke=6000;
        try {
        Map<Integer, Integer> map = null;
	    CuttingStock cuttingStock= new CuttingStock(duzinaSipke,duzine,count);
            
		while(cuttingStock.hasMoreCombinations())
		{
                        
                        builder.append("\nProfil "+(++i)+": ");
                        builder.append(" ");
			
                        map=cuttingStock.nextCombination();
                                    
			for (Entry<Integer, Integer> entry : map.entrySet()) 
			{
				  Integer duzina = entry.getKey();
				  Integer brojSipki = entry.getValue();
                                  List<Integer> l = listaZaIspis(duzina, brojSipki);
                            for(int m : l){
                                builder.append(m+", ");
                            }    
			}
                             
                        builder.append(System.getProperty("line.separator"));
                }
                               
          } catch (Exception e) {
                    }
         String res = builder.toString();
         return res;                  
    }
    public static void main(String args[]) {
        List<DuzinaICount> listaReturn = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Algoritam.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null; 
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db");
        } catch (SQLException ex) {
            Logger.getLogger(Algoritam.class.getName()).log(Level.SEVERE, null, ex);
        }
            try{
              String sql = "SELECT duzina, COUNT(duzina) AS 'count'  FROM lajsna_tbl GROUP BY duzina";
              PreparedStatement pst = conn.prepareStatement(sql);
              ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    double duzina = rs.getDouble("duzina");
                    int count = rs.getInt("count");
                    
                DuzinaICount o = new DuzinaICount(duzina, count);
                listaReturn.add(o);
                }
            }
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, e);
             } 
       

        List <DuzinaICount> listaObj = listaReturn;
        List <Double>listaDuzinaDouble = new ArrayList<Double>();
        List <Integer>listaDuzinaInt = new ArrayList();
        List <Integer>listaCountInt = new ArrayList();
        
        for(DuzinaICount d : listaObj){
            listaDuzinaDouble.add(d.getDuzina());
            listaCountInt.add(d.getCount());
        }
        for(Double d : listaDuzinaDouble){
            listaDuzinaInt.add(d.intValue());
        }

        int duzine[]= toIntArray(listaDuzinaInt);
	int count[]=toIntArray(listaCountInt);
                
        int i=0;
        int duzinaSipke=600;
        try {
       
Map<Integer, Integer> map;
	    CuttingStock cuttingStock= new CuttingStock(duzinaSipke,duzine,count);
		while(cuttingStock.hasMoreCombinations())
		{
			map=cuttingStock.nextCombination();
			for (Entry<Integer, Integer> entry : map.entrySet()) 
			{
				  Integer key = entry.getKey();
				  Integer value = entry.getValue();
			}
		}
                     
        } catch (Exception e) {
        }
}
    

}

