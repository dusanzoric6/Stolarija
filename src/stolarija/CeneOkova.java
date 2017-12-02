/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stolarija;

/**
 *
 * @author dusan
 */
public class CeneOkova {
    
    public static double ceneOkovaJednokrilna(double sirina, double visina){
        double cena = 0;
        
            if (sirina >=0 && sirina <= 60 ) {
                if (visina >=0 && visina <= 60) {
                    cena = 10;
                }else if (visina >60 && visina <= 80) {
                    cena = 11;
                }else if (visina >80 && visina <= 100) {
                    cena = 12;
                }else if (visina >100 && visina <= 120) {
                    cena = 12.5;
                }else if (visina >120 && visina <= 140) {
                    cena = 13;
                }else if (visina >140 && visina <= 160) {
                    cena = 14;
                }else if (visina >160 && visina <= 180) {
                    cena = 15;
                }else if (visina >180 && visina <= 200) {
                    cena = 16;
                }else if (visina >200 && visina <= 220) {
                    cena = 17;
                }
            }    
            if (sirina >60 && sirina <=80) {
                if (visina >=0 && visina <= 60) {
                    cena = 10;
                }else if (visina >60 && visina <= 80) {
                    cena = 11;
                }else if (visina >80 && visina <= 100) {
                    cena = 13;
                }else if (visina >100 && visina <= 120) {
                    cena = 13;
                }else if (visina >120 && visina <= 140) {
                    cena = 13;
                }else if (visina >140 && visina <= 160) {
                    cena = 14;
                }else if (visina >160 && visina <= 180) {
                    cena = 15;
                }else if (visina >180 && visina <= 200) {
                    cena = 16;
                }else if (visina >200 && visina <= 220) {
                    cena = 17;
                }    
            }

            if (sirina >80 && sirina <=100) {
                if (visina >=0 && visina <= 60) {
                    cena = 12;
                }else if (visina >60 && visina <= 80) {
                    cena = 12;
                }else if (visina >80 && visina <= 100) {
                    cena = 14;
                }else if (visina >100 && visina <= 120) {
                    cena = 14;
                }else if (visina >120 && visina <= 140) {
                    cena = 14.5;
                }else if (visina >140 && visina <= 160) {
                    cena = 15;
                }else if (visina >160 && visina <= 180) {
                    cena = 16;
                }else if (visina >180 && visina <= 200) {
                    cena = 17;
                }else if (visina >200 && visina <= 220) {
                    cena = 18;
                }    
            }
            if (sirina >100 && sirina <=120) {
                if (visina >=0 && visina <= 60) {
                    cena = 12.5;
                }else if (visina >60 && visina <= 80) {
                    cena = 13.5;
                }else if (visina >80 && visina <= 100) {
                    cena = 14;
                }else if (visina >100 && visina <= 120) {
                    cena = 15;
                }else if (visina >120 && visina <= 140) {
                    cena = 15;
                }else if (visina >140 && visina <= 160) {
                    cena = 16;
                }else if (visina >160 && visina <= 180) {
                    cena = 16;
                }else if (visina >180 && visina <= 200) {
                    cena = 17;
                }else if (visina >200 && visina <= 220) {
                    cena = 19;
                }    
            }
            if (sirina >120 && sirina <=140) {
                if (visina >=0 && visina <= 60) {
                    cena = 13;
                }else if (visina >60 && visina <= 80) {
                    cena = 15;
                }else if (visina >80 && visina <= 100) {
                    cena = 15;
                }else if (visina >100 && visina <= 120) {
                    cena = 16;
                }else if (visina >120 && visina <= 140) {
                    cena = 16.5;
                }else if (visina >140 && visina <= 160) {
                    cena = 18;
                }else if (visina >160 && visina <= 180) {
                    cena = 19;
                }else if (visina >180 && visina <= 200) {
                    cena = 20;
                }else if (visina >200 && visina <= 220) {
                    cena = 21;
                }    
            }
        
        return cena;
    }
    
    public static double ceneOkovaDvokrilna(double sirina, double visina){
        double cena = 0;
        
            if (sirina >=0 && sirina <= 120 ) {
                if (visina >=0 && visina <= 60) {
                    cena = 17;
                }else if (visina >60 && visina <= 80) {
                    cena = 18;
                }else if (visina >80 && visina <= 100) {
                    cena = 19;
                }else if (visina >100 && visina <= 120) {
                    cena = 20.5;
                }else if (visina >120 && visina <= 140) {
                    cena = 21;
                }else if (visina >140 && visina <= 160) {
                    cena = 22;
                }else if (visina >160 && visina <= 180) {
                    cena = 23;
                }else if (visina >180 && visina <= 200) {
                    cena = 24;
                }else if (visina >200 && visina <= 220) {
                    cena = 26;
                }
            }    
            if (sirina >120 && sirina <=140) {
                if (visina >=0 && visina <= 60) {
                    cena = 17;
                }else if (visina >60 && visina <= 80) {
                    cena = 18;
                }else if (visina >80 && visina <= 100) {
                    cena = 19;
                }else if (visina >100 && visina <= 120) {
                    cena = 20.5;
                }else if (visina >120 && visina <= 140) {
                    cena = 21;
                }else if (visina >140 && visina <= 160) {
                    cena = 22;
                }else if (visina >160 && visina <= 180) {
                    cena = 23;
                }else if (visina >180 && visina <= 200) {
                    cena = 24;
                }else if (visina >200 && visina <= 220) {
                    cena = 26;
                }    
            }

            if (sirina >140 && sirina <=160) {
                if (visina >=0 && visina <= 60) {
                    cena = 17.5;
                }else if (visina >60 && visina <= 80) {
                    cena = 18.5;
                }else if (visina >80 && visina <= 100) {
                    cena = 19.5;
                }else if (visina >100 && visina <= 120) {
                    cena = 21;
                }else if (visina >120 && visina <= 140) {
                    cena = 21.5;
                }else if (visina >140 && visina <= 160) {
                    cena = 22.5;
                }else if (visina >160 && visina <= 180) {
                    cena = 23.5;
                }else if (visina >180 && visina <= 200) {
                    cena = 25;
                }else if (visina >200 && visina <= 220) {
                    cena = 26.5;
                }    
            }
            if (sirina >160 && sirina <=180) {
                if (visina >=0 && visina <= 60) {
                    cena = 18;
                }else if (visina >60 && visina <= 80) {
                    cena = 19;
                }else if (visina >80 && visina <= 100) {
                    cena = 20;
                }else if (visina >100 && visina <= 120) {
                    cena = 21.5;
                }else if (visina >120 && visina <= 140) {
                    cena = 22;
                }else if (visina >140 && visina <= 160) {
                    cena = 23;
                }else if (visina >160 && visina <= 180) {
                    cena = 24;
                }else if (visina >180 && visina <= 200) {
                    cena = 25.5;
                }else if (visina >200 && visina <= 220) {
                    cena = 27;
                }    
            }
            if (sirina >180 && sirina <=200) {
                if (visina >=0 && visina <= 60) {
                    cena = 18.5;
                }else if (visina >60 && visina <= 80) {
                    cena = 19.5;
                }else if (visina >80 && visina <= 100) {
                    cena = 20.5;
                }else if (visina >100 && visina <= 120) {
                    cena = 22;
                }else if (visina >120 && visina <= 140) {
                    cena = 22.5;
                }else if (visina >140 && visina <= 160) {
                    cena = 23.5;
                }else if (visina >160 && visina <= 180) {
                    cena = 24.5;
                }else if (visina >180 && visina <= 200) {
                    cena = 26;
                }else if (visina >200 && visina <= 220) {
                    cena = 27.5;
                }    
            }
            if (sirina >200 && sirina <=220) {
                if (visina >=0 && visina <= 60) {
                    cena = 18.5;
                }else if (visina >60 && visina <= 80) {
                    cena = 19.5;
                }else if (visina >80 && visina <= 100) {
                    cena = 20.5;
                }else if (visina >100 && visina <= 120) {
                    cena = 22;
                }else if (visina >120 && visina <= 140) {
                    cena = 22.5;
                }else if (visina >140 && visina <= 160) {
                    cena = 23.5;
                }else if (visina >160 && visina <= 180) {
                    cena = 24.5;
                }else if (visina >180 && visina <= 200) {
                    cena = 26;
                }else if (visina >200 && visina <= 220) {
                    cena = 27.5;
                }    
            }
            if (sirina >220 && sirina <=240) {
                if (visina >=0 && visina <= 60) {
                    cena = 19;
                }else if (visina >60 && visina <= 80) {
                    cena = 20;
                }else if (visina >80 && visina <= 100) {
                    cena = 21;
                }else if (visina >100 && visina <= 120) {
                    cena = 22;
                }else if (visina >120 && visina <= 140) {
                    cena = 22.5;
                }else if (visina >140 && visina <= 160) {
                    cena = 24;
                }else if (visina >160 && visina <= 180) {
                    cena = 25;
                }else if (visina >180 && visina <= 200) {
                    cena = 26.5;
                }else if (visina >200 && visina <= 220) {
                    cena = 28;
                }    
            }
        
        return cena;
    }
    public static void main(String[] args) {
        System.out.println(ceneOkovaDvokrilna(240,101));
    }
}
