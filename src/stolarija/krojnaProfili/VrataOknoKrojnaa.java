/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stolarija.krojnaProfili;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import stolarija.KrojnaListaIzborna;
import stolarija.Prozori;
import stolarija.ProzoriKrojnaLista;
import stolarija.Util;
import stolarija.Vrata;
import stolarija.VrataKrojnaLista;
/**
 *
 * @author dusan_zoric
 */
public class VrataOknoKrojnaa extends javax.swing.JFrame {

public void popuniPrikaz() throws SQLException{
    
        double visinaBr = Double.parseDouble(visinaText.getText());
        double sirinaOknaBr = Double.parseDouble(sirinaLevogText.getText());
        double sirinaVrataBr = Double.parseDouble(sirinaDesnogText.getText());
        String pozicija = pozicijaText.getText();
        String tip = "vrata + okno";
        
        int ss = GabaritiProfila.sirinaStoka((String) pvcProfilDropBox.getSelectedItem());
        int sk = GabaritiProfila.sirinaKrila((String) pvcProfilDropBox.getSelectedItem());
        int preklop = GabaritiProfila.preklop((String) pvcProfilDropBox.getSelectedItem());;

//        ***********************STOK*****************************************
        double sh1 = sirinaOknaBr + sirinaVrataBr + 6;
        double sv1 = visinaBr + 3;
        double sv2 = visinaBr + 3;
        double sv3 = visinaBr -ss;
        
        String stokArr[] = {sh1+"",sv1+"" ,sv2+"",sv3+"" };
        ArrayList listaStoka = new ArrayList<String>(Arrays.asList(stokArr));
        stokPrikaz.setListData(stokArr);
        Util.snimiStok(pozicija, tip, listaStoka);
        
        //        ***********************KRILO*****************************************
        double kh1 = sirinaOknaBr - 1.5*ss + preklop + 6;
        double kh2 = sirinaOknaBr - 1.5*ss + preklop + 6;
        double kv1 = visinaBr - ss + 6 + 0.5*preklop;
        double kv2 = visinaBr - ss + 6 + 0.5*preklop;

        double kh3 = sirinaVrataBr- 1.5*ss + preklop + 6;
        double kh4 = sirinaVrataBr- 1.5*ss + preklop + 6;
        double kv3 = visinaBr - ss + 6 + 0.5*preklop;
        double kv4 = visinaBr - ss + 6 + 0.5*preklop;
        
        String kriloArr[] = {kh1+"",kh2+"" ,kh3+"" ,kh4+"",kv1+"",kv2+"" ,kv3+"" ,kv4+"" };
        ArrayList listaKrila = new ArrayList<String>(Arrays.asList(kriloArr));
        
        kriloPrikaz.setListData(kriloArr);
        Util.snimiKrilo(pozicija, tip, listaKrila);
        
//        ***********************LAJSNA*****************************************
        double lh1 = sirinaOknaBr- 1.5*ss - 2*sk + preklop;
        double lh2 = sirinaOknaBr- 1.5*ss - 2*sk + preklop;
        double lh3 = sirinaVrataBr- 1.5*ss - 2*sk + preklop;
        double lh4 = sirinaVrataBr- 1.5*ss - 2*sk + preklop;
        
        double lv1 = visinaBr - ss - 2*sk + 0.5*preklop;
        double lv2 = visinaBr - ss - 2*sk + 0.5*preklop;
        double lv3 = visinaBr - ss - 2*sk + 0.5*preklop;
        double lv4 = visinaBr - ss - 2*sk + 0.5*preklop;
        
        String lajsnakArr[] = {lh1+"",lh2+"" ,lh3+"" ,lh4+"",lv1+"",lv2+"" ,lv3+"" ,lv4+"" };
        ArrayList listaLajsna = new ArrayList<String>(Arrays.asList(lajsnakArr));
        lajsnaPrikaz.setListData(lajsnakArr);
        Util.snimiLajsna(pozicija, tip, listaLajsna);

//        ***********************OJACANJE*****************************************
        double OSh1 = sirinaOknaBr + sirinaVrataBr - 2*ss -20;
        double OSv1 = visinaBr - ss - 20;
        double OSv2 = visinaBr - ss - 20;
        double OSv3 = visinaBr - ss - 20;

        double OKh1 = sirinaOknaBr- 1.5*ss - 2*sk + preklop-20;
        double OKh2 = sirinaOknaBr- 1.5*ss - 2*sk + preklop-20;
        double OKv1 = visinaBr - ss - 2*sk + 0.5*preklop-20;
        double OKv2 = visinaBr - ss - 2*sk + 0.5*preklop-20;
        
        double OKh3 = sirinaVrataBr- 1.5*ss - 2*sk + preklop-20;
        double OKh4 = sirinaVrataBr- 1.5*ss - 2*sk + preklop-20;
        double OKv3 = visinaBr - ss - 2*sk + 0.5*preklop-20;
        double OKv4 = visinaBr - ss - 2*sk + 0.5*preklop-20;
        
        String ojacanjeArr[] = {OSh1+"",OKh1+"",OKh2+"" ,OKh3+"",OKh4+""
                                ,OSv1+"" ,OSv2+"",OSv3+"",OKv1+"" ,OKv2+"",OKv3+"" ,OKv4+"" };
        ArrayList listaOjacanje = new ArrayList<String>(Arrays.asList(ojacanjeArr));
        ojacanjePrikaz.setListData(ojacanjeArr);
        Util.snimiOjacanje(pozicija, tip , listaOjacanje);
        
//        ***********************STAKLO*****************************************
        String staklo1 = ((sirinaOknaBr-1.5*ss-2*sk - 10 + preklop)+" x "
                        + (visinaBr- ss -2*sk - 10 + 0.5*preklop));
        String staklo2 = ((sirinaVrataBr-1.5*ss-2*sk - 10 + preklop)+" x "
                        + (visinaBr- ss -2*sk - 10 + 0.5*preklop));
        
        String stakloArr[] = {staklo1+"",staklo2+"" };
        stakloPrikaz.setListData(stakloArr);    
        ArrayList listaStaklo = new ArrayList<String>(Arrays.asList(stakloArr));
        
        Util.snimiStaklo(pozicija, tip ,listaStaklo);
         
}

    public VrataOknoKrojnaa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sirinaLevogText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sirinaDesnogText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        postaviListu = new javax.swing.JButton();
        visinaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pozicijaText = new javax.swing.JTextField();
        pvcProfilDropBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stokPrikaz = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tPreckaPrikaz = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        kriloPrikaz = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lajsnaPrikaz = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ojacanjePrikaz = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        stakloPrikaz = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        sirinaLevogText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sirinaLevogText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sirinaLevogTextActionPerformed(evt);
            }
        });

        jLabel15.setText("mm");

        sirinaDesnogText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("sirina vrata :");

        postaviListu.setText("postavi listu");
        postaviListu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postaviListuMouseClicked(evt);
            }
        });
        postaviListu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postaviListuActionPerformed(evt);
            }
        });

        visinaText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("sirina okna:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("vrata jednokrilna");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stolarija/slike/vrata+okno550.png"))); // NOI18N

        pozicijaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pozicijaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pozicijaTextActionPerformed(evt);
            }
        });

        pvcProfilDropBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pvcProfilDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "roplasto 7001", "winhouse garnet 70" }));
        pvcProfilDropBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pvcProfilDropBoxItemStateChanged(evt);
            }
        });
        pvcProfilDropBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvcProfilDropBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("visina prozora :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("pvc profil :");

        jLabel7.setText("mm");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("pozicija :");

        jLabel11.setText("mm");

        jButton7.setText("Nazad");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setText("stok");

        stokPrikaz.setFocusable(false);
        jScrollPane1.setViewportView(stokPrikaz);

        jLabel18.setText("T-precka");

        tPreckaPrikaz.setFocusable(false);
        jScrollPane6.setViewportView(tPreckaPrikaz);

        kriloPrikaz.setFocusable(false);
        jScrollPane5.setViewportView(kriloPrikaz);

        jLabel6.setText("krilo");

        jLabel8.setText("lajsna");

        lajsnaPrikaz.setFocusable(false);
        jScrollPane2.setViewportView(lajsnaPrikaz);

        ojacanjePrikaz.setFocusable(false);
        jScrollPane3.setViewportView(ojacanjePrikaz);

        jLabel9.setText("ojacanje");

        jLabel10.setText("staklo");

        stakloPrikaz.setFocusable(false);
        jScrollPane4.setViewportView(stakloPrikaz);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(175, 175, 175))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(140, 140, 140)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(sirinaLevogText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(visinaText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(sirinaDesnogText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(274, 274, 274))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(sirinaLevogText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sirinaDesnogText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(visinaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(234, 234, 234)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        jMenu1.setText("Cene");

        jMenuItem1.setText("Prozori");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Vrata");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Krojna Lista");

        jMenuItem3.setText("Prozori");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Vrata");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Optimizacija");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sirinaLevogTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sirinaLevogTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sirinaLevogTextActionPerformed

    private void postaviListuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postaviListuMouseClicked
        //        try {
            //            Util.snimiStok("pozicija fiksnoooog", "tip fiksnog",);
            //        } catch (SQLException ex) {
            //            Logger.getLogger(Fiksno.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_postaviListuMouseClicked

    private void postaviListuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postaviListuActionPerformed

        try {
            popuniPrikaz();
        } catch (SQLException ex) {
            Logger.getLogger(VrataJednokrilnaKrojna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_postaviListuActionPerformed

    private void pozicijaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozicijaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozicijaTextActionPerformed

    private void pvcProfilDropBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxItemStateChanged

    private void pvcProfilDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        VrataKrojnaLista vrataK = new VrataKrojnaLista();
        vrataK.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Prozori prozori = new Prozori();
        prozori.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked

    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Vrata vrata = new Vrata();
        vrata.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        ProzoriKrojnaLista prozori = new ProzoriKrojnaLista();
        prozori.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ProzoriKrojnaLista prozori = new ProzoriKrojnaLista();
        prozori.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked

    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VrataKrojnaLista vrata = new VrataKrojnaLista();
        vrata.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        try {
            SumaKrojna suma = new SumaKrojna();
            suma.setVisible(true);
            super.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(KrojnaListaIzborna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        try {
            SumaKrojna suma = new SumaKrojna();
            suma.setVisible(true);
            super.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(KrojnaListaIzborna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VrataOknoKrojnaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VrataOknoKrojnaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VrataOknoKrojnaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VrataOknoKrojnaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VrataOknoKrojnaa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> kriloPrikaz;
    private javax.swing.JList<String> lajsnaPrikaz;
    private javax.swing.JList<String> ojacanjePrikaz;
    private javax.swing.JButton postaviListu;
    private javax.swing.JTextField pozicijaText;
    private javax.swing.JComboBox<String> pvcProfilDropBox;
    private javax.swing.JTextField sirinaDesnogText;
    private javax.swing.JTextField sirinaLevogText;
    private javax.swing.JList<String> stakloPrikaz;
    private javax.swing.JList<String> stokPrikaz;
    private javax.swing.JList<String> tPreckaPrikaz;
    private javax.swing.JTextField visinaText;
    // End of variables declaration//GEN-END:variables
}
