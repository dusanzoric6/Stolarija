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


public class FiksniKrojna extends javax.swing.JFrame {
    
    public void sacekaj() throws InterruptedException{
        Thread.sleep(2000);
    }
    
    public void popuniPrikaz() throws SQLException{
        
        double visinaBr = Double.parseDouble(visinaText.getText());
        double sirinaBr = Double.parseDouble(sirinaText.getText());
        String pozicija = pozicijaText.getText();
        
        int ss = GabaritiProfila.sirinaStoka((String) pvcProfilDropBox.getSelectedItem());
        int sk = GabaritiProfila.sirinaKrila((String) pvcProfilDropBox.getSelectedItem());
        int preklop = GabaritiProfila.preklop((String) pvcProfilDropBox.getSelectedItem());;

//        ***********************STOK*****************************************
        double sh1 = sirinaBr + 6;
        double sh2 = sirinaBr + 6;
        double sv1 = visinaBr + 6;
        double sv2 = visinaBr + 6;
        
        String stokArr[] = {sh1+"",sh2+"" ,sv1+"" ,sv2+"" };
        ArrayList listaStoka = new ArrayList<String>(Arrays.asList(stokArr));
        
        stokPrikaz.setListData(stokArr);
        Util.snimiStok(pozicija, "fiksni", listaStoka);
        
//        ***********************LAJSNA*****************************************
        double lh1 = sirinaBr-2*ss;
        double lh2 = sirinaBr-2*ss;
        double lv1 = visinaBr-2*ss;
        double lv2 = visinaBr-2*ss;
        
        String lajsnakArr[] = {lh1+"",lh2+"" ,lv1+"" ,lv2+"" };
        ArrayList listaLajsna = new ArrayList<String>(Arrays.asList(lajsnakArr));
        lajsnaPrikaz.setListData(lajsnakArr);
        Util.snimiLajsna(pozicija, "fiksni", listaLajsna);

//        ***********************OJACANJE*****************************************
        double Oh1 = sirinaBr-2*ss-15;
        double Oh2 = sirinaBr-2*ss-15;
        double Ov1 = visinaBr-2*ss-15;
        double Ov2 = visinaBr-2*ss-15;
        
        String ojacanjeArr[] = {Oh1+"",Oh2+"" ,Ov1+"" ,Ov2+"" };
        ArrayList listaOjacanje = new ArrayList<String>(Arrays.asList(ojacanjeArr));
        ojacanjePrikaz.setListData(ojacanjeArr);
        Util.snimiOjacanje(pozicija, "fiksni", listaOjacanje);
        
//        ***********************STAKLO*****************************************
        String staklo = ((sirinaBr-2*ss-12) +" x "
                         +(visinaBr-2*ss-12));
        
        String stakloArr[] = {staklo+"" };
        stakloPrikaz.setListData(stakloArr);    
        ArrayList listaStaklo = new ArrayList();
        listaStaklo.add(staklo);
        
        Util.snimiStaklo(pozicija, "fiksni", listaStaklo);
        
    }
    
    
   
    public FiksniKrojna() {
        initComponents();
//        double visinaBr = Double.parseDouble(visinaText.getText());
//        double sirinaBr = Double.parseDouble(sirinaText.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        visinaText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sirinaText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kriloPrikaz = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        stakloPrikaz = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ojacanjePrikaz = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lajsnaPrikaz = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        stokPrikaz = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        pvcProfilDropBox = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        postaviListu = new javax.swing.JButton();
        pozicijaText = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));

        visinaText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("pozicija :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("visina :");

        jLabel10.setText("staklo");

        sirinaText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sirinaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sirinaTextActionPerformed(evt);
            }
        });

        jLabel9.setText("ojacanje");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("sirina :");

        jLabel8.setText("lajsna");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("  fiksirano");

        jLabel6.setText("krilo");

        jLabel11.setText("mm");

        jLabel5.setText("stok");

        kriloPrikaz.setFocusable(false);
        jScrollPane5.setViewportView(kriloPrikaz);

        stakloPrikaz.setFocusable(false);
        jScrollPane4.setViewportView(stakloPrikaz);

        jLabel13.setText("mm");

        ojacanjePrikaz.setFocusable(false);
        jScrollPane3.setViewportView(ojacanjePrikaz);

        lajsnaPrikaz.setFocusable(false);
        jScrollPane2.setViewportView(lajsnaPrikaz);

        stokPrikaz.setFocusable(false);
        jScrollPane1.setViewportView(stokPrikaz);

        jLabel7.setText("mm");

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

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("pvc profil :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stolarija/slike/slikeZaKrojnu/Fiksni320.png"))); // NOI18N

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

        pozicijaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pozicijaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pozicijaTextActionPerformed(evt);
            }
        });

        jButton6.setText("Nazad");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(166, 166, 166)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(visinaText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(sirinaText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(74, 74, 74)
                                    .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sirinaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visinaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(1, 1, 1)))
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sirinaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sirinaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sirinaTextActionPerformed

    private void pvcProfilDropBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxItemStateChanged

    private void pvcProfilDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxActionPerformed

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
            //            postaviListu.setEnabled(true);

        } catch (SQLException ex) {
            Logger.getLogger(FiksniKrojna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_postaviListuActionPerformed

    private void pozicijaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozicijaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozicijaTextActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        ProzoriKrojnaLista pKrojna = new ProzoriKrojnaLista();
        pKrojna.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FiksniKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiksniKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiksniKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiksniKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiksniKrojna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> kriloPrikaz;
    private javax.swing.JList<String> lajsnaPrikaz;
    private javax.swing.JList<String> ojacanjePrikaz;
    private javax.swing.JButton postaviListu;
    private javax.swing.JTextField pozicijaText;
    private javax.swing.JComboBox<String> pvcProfilDropBox;
    private javax.swing.JTextField sirinaText;
    private javax.swing.JList<String> stakloPrikaz;
    private javax.swing.JList<String> stokPrikaz;
    private javax.swing.JTextField visinaText;
    // End of variables declaration//GEN-END:variables
}
