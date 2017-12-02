/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stolarija.krojnaProfili;

import java.util.HashMap;

/**
 *
 * @author dusan
 */
public class GabaritiProfila {
    
    static HashMap<String, Integer> mapaStokSirina;
    static HashMap<String, Integer> mapaKriloSirina;
    static HashMap<String, Integer> mapaPreklop;
    static HashMap<String, Integer> mapaTPrecka;
    
    
    //           SIRINA STOKA MAPA
    public static int sirinaStoka (String naziv){
        mapaStokSirina = new HashMap<>();
        mapaStokSirina.put("roplasto 7001", 50);
        mapaStokSirina.put("winhouse garnet 70", 78);
        
        return mapaStokSirina.get(naziv);
    }
    
//          SIRINA KRILA MAPA
    public static int sirinaKrila (String naziv){
        mapaKriloSirina = new HashMap<>();
        mapaKriloSirina.put("roplasto 7001", 64);
        mapaKriloSirina.put("winhouse garnet 70", 78);
        
        return mapaKriloSirina.get(naziv);
    }
    
//          PREKLOP
    public static int preklop (String naziv){
        mapaPreklop = new HashMap<>();
        mapaPreklop.put("roplasto 7001", 18);
        mapaPreklop.put("winhouse garnet 70", 90);
        
        return mapaPreklop.get(naziv);
    }
    
//          T Precka
    public static int sirinaTPrecke (String naziv){
        mapaPreklop = new HashMap<>();
        mapaPreklop.put("roplasto 7001", 41);
        mapaPreklop.put("winhouse garnet 70", 90);
        
        return mapaPreklop.get(naziv);
    }    

//          Lajsna
    public static int sirinaLajsne (String naziv){
        mapaPreklop = new HashMap<>();
        mapaPreklop.put("roplasto 7001", 21);
        mapaPreklop.put("winhouse garnet 70", 90);
        
        return mapaPreklop.get(naziv);
    }        
    
  
    
}
