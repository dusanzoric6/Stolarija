package stolarija.krojnaProfili;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static stolarija.krojnaProfili.Algoritam.getListaSipki;

public class Obj {
    
    
    private String pozicija;
    private String tip;
    private Double duzina;

    public Obj(String pozicija, String tip, Double duzina) {
        this.pozicija = pozicija;
        this.tip = tip;
        this.duzina = duzina;
    }
    

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Double getDuzina() {
        return duzina;
    }

    public void setDuzina(Double duzina) {
        this.duzina = duzina;
    }
//     getListaSipki("STOK_TBL");
//        
//          System.out.println("start XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//        List<Obj> lista = new ArrayList<Obj>();
//        List<Obj> sipka = new ArrayList<Obj>();
//        List<List> listaSipki = new ArrayList<>();
//        try {
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Algoritam.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       Connection conn = DriverManager.getConnection("jdbc:sqlite:SQLiteStolarija.db"); 
//            try{
//              String sql = "SELECT * FROM STOK_TBL ORDER BY DUZINA DESC";
//              PreparedStatement pst = conn.prepareStatement(sql);
//              ResultSet rs = pst.executeQuery();
//                while(rs.next()){
//                    String pozicija = rs.getString("pozicija");
//                    String tip = rs.getString("tip");
//                    double duzina = rs.getDouble("duzina");
//                Obj o = new Obj(pozicija, tip, duzina);
//                lista.add(o);
//                }
//            }
//             catch(SQLException e){
//                 JOptionPane.showMessageDialog(null, e);
//             } 
//        System.out.println("Duzine za secenje su" + lista.toString());
//        double r = 600;
//        System.out.println("Duzina inicijalne " + r);
//        
//            
//            Iterator<Obj> it = lista.iterator();
//            while (it.hasNext() && !lista.isEmpty()) {
//                Obj d = it.next();
//                Double poslednji = lista.get(lista.size() -1 ).getDuzina();
//                
//                if (r > d.getDuzina()) {
//                    r= r -d.getDuzina();
//                    it.remove();
//                    sipka.add(d);
//                    System.out.println("r = "+r +" & d = "+ d.getDuzina());
//                if(d.getDuzina()==poslednji){
//                    it = lista.iterator();
//                }
//                    
//                }else if(r < poslednji){
//                    r=600;
//                    System.out.println("\ndodao sam novu sipku\n ");
//                    it = lista.iterator();
//                    listaSipki.add(sipka);
//                    sipka = new ArrayList<>();
//                }
//            }
//            listaSipki.add(sipka);
////        } 
//        System.out.println("");
//        System.out.println("Kraj racuna");
//        System.out.println("");
//        System.out.println("lista je "+lista.toString());
//        System.out.println("sipke su :");
//        for(int i = 0; i < listaSipki.size(); i++) {
//            List<Obj> listaZaIspis = listaSipki.get(i);
//            int brojSipke = i+1;
//            System.out.print("sipka "+ brojSipke +" :");
//            for (int j = 0; j < listaZaIspis.size(); j++) {
//              System.out.print(" "+listaZaIspis.get(j).getDuzina());   
//            }
//            System.out.println("");
//        }
//        
//        System.out.println("gotovo XXXXXXXXXXXXXXXXXXXXXXXXX");
//    }
//    
}
