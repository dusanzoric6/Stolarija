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
 * @author Dusan
 */
public class FiksniDryKipKrojna extends javax.swing.JFrame {

    public void popuniPrikaz() throws SQLException{
        
        double visinaBr = Double.parseDouble(visinaText.getText());
        double sirinaFiksnogBr = Double.parseDouble(sirinaFiksnogText.getText());
        double sirinaDryKipBr = Double.parseDouble(sirinaDryKipText.getText());
        String pozicija = pozicijaText.getText();
        
        int ss = GabaritiProfila.sirinaStoka((String) pvcProfilDropBox.getSelectedItem());
        int sk = GabaritiProfila.sirinaKrila((String) pvcProfilDropBox.getSelectedItem());
        int st = GabaritiProfila.sirinaTPrecke((String) pvcProfilDropBox.getSelectedItem());
        int preklop = GabaritiProfila.preklop((String) pvcProfilDropBox.getSelectedItem());;


//        ***********************STOK*****************************************
        double sh1 = sirinaDryKipBr + sirinaFiksnogBr + 6;
        double sh2 = sirinaDryKipBr + sirinaFiksnogBr + 6;
        double sv1 = visinaBr + 6;
        double sv2 = visinaBr + 6;
        
        String stokArr[] = {sh1+"",sh2+"" ,sv1+"" ,sv2+""};
        ArrayList listaStoka = new ArrayList(Arrays.asList(stokArr));
        stokPrikaz.setListData(stokArr);
        Util.snimiStok(pozicija, "fiksno + dry-kip", listaStoka);
        
//        ***********************T PRECKA*****************************************
        double T1 = visinaBr - 2*ss;
        
        String tPreckaArr[] = {T1+""};
        ArrayList listatPrecke = new ArrayList(Arrays.asList(tPreckaArr));
        tPreckaPrikaz.setListData(tPreckaArr);
        Util.snimiTPrecku(pozicija, "fiksno + dry-kip", listatPrecke);
        
        
        //        ***********************KRILO*****************************************
        double kh1 = sirinaDryKipBr - ss - 0.5*st + preklop + 6;
        double kh2 = sirinaDryKipBr - ss - 0.5*st + preklop + 6;
        double kv1 = visinaBr - 2*ss + preklop + 6;
        double kv2 = visinaBr - 2*ss + preklop + 6;
        
        String kriloArr[] = {kh1+"",kh2+"",kv1+"",kv2+""};
        ArrayList listaKrila = new ArrayList(Arrays.asList(kriloArr));
        kriloPrikaz.setListData(kriloArr);
        Util.snimiKrilo(pozicija, "fiksno + dry-kip", listaKrila);
        
//        ***********************LAJSNA*****************************************
        double lh1 = sirinaDryKipBr - ss - 0.5*st + preklop - 2*sk;
        double lh2 = sirinaDryKipBr - ss - 0.5*st + preklop - 2*sk;
        double lh3 = sirinaFiksnogBr - ss - 0.5*st ;
        double lh4 = sirinaFiksnogBr - ss - 0.5*st ;
        double lv1 = visinaBr - 2*ss + preklop -2*sk;
        double lv2 = visinaBr - 2*ss + preklop -2*sk;
        double lv3 = visinaBr - 2*ss ;
        double lv4 = visinaBr - 2*ss ;
        
        String lajsnakArr[] = {lh1+"",lh2+"" ,lh3+"" ,lh4+"",lv1+"",lv2+"" ,lv3+"" ,lv4+"" };
        ArrayList listaLajsna = new ArrayList<String>(Arrays.asList(lajsnakArr));
        lajsnaPrikaz.setListData(lajsnakArr);
        Util.snimiLajsna(pozicija, "fiksno + dry-kip", listaLajsna);

//        ***********************OJACANJE*****************************************
        double osh1 = sirinaDryKipBr + sirinaFiksnogBr - 2*ss -15;
        double osh2 = sirinaDryKipBr + sirinaFiksnogBr - 2*ss -15;
        double osv1 = visinaBr - 2*ss -15;
        double osv2 = visinaBr - 2*ss -15;
        double osv3 = visinaBr - 2*ss -5;
        
        double okh1 = sirinaDryKipBr - ss - 0.5*st + preklop - 2*sk -15 ;
        double okh2 = sirinaDryKipBr - ss - 0.5*st + preklop - 2*sk -15 ;
        double okv1 = visinaBr - 2*ss + preklop - 2*sk -15 ;
        double okv2 = visinaBr - 2*ss + preklop - 2*sk -15 ;
        
        String ojacanjeArr[] = {osh1+"",osh2+"",osv1+"",osv2+"",osv3+"",okh1+"",okh2+"",okv1+"",okv2+""};
        ArrayList listaOjacanje = new ArrayList<String>(Arrays.asList(ojacanjeArr));
        ojacanjePrikaz.setListData(ojacanjeArr);
        Util.snimiOjacanje(pozicija, "nagibni", listaOjacanje);        
//        ***********************STAKLO*****************************************
        String stakloFiksnog = ((sirinaFiksnogBr - ss - 0.5*st -12)+" x "+(visinaBr - 2*ss - 12));
        String stakloDryKipa = ((sirinaDryKipBr - ss - 0.5*st + preklop - 2*sk -12)+" x "+(visinaBr - 2*ss + preklop - 2*sk -12));
        
        String stakloArr[] = {stakloFiksnog,stakloDryKipa};
        stakloPrikaz.setListData(stakloArr);    
        ArrayList listaStaklo = new ArrayList(Arrays.asList(stakloArr));
        Util.snimiStaklo(pozicija, "fiksno + dry-kip", listaStaklo);
        
    }
    public FiksniDryKipKrojna() {
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

        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        postaviListu = new javax.swing.JButton();
        sirinaDryKipText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sirinaFiksnogText = new javax.swing.JTextField();
        pozicijaText = new javax.swing.JTextField();
        pvcProfilDropBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        visinaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stokPrikaz = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
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

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));

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

        sirinaDryKipText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sirinaDryKipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sirinaDryKipTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("visina :");

        sirinaFiksnogText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sirinaFiksnogText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sirinaFiksnogTextActionPerformed(evt);
            }
        });

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("pozicija :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stolarija/slike/slikeZaKrojnu/fiksni + kip novo380.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("fiksni + dry-kip");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("sirina dry-kip :");

        jLabel14.setText("mm");

        visinaText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("sirina fiksnog :");

        jLabel11.setText("mm");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("pvc profil :");

        jLabel7.setText("mm");

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

        jLabel5.setText("stok");

        stokPrikaz.setFocusable(false);
        jScrollPane1.setViewportView(stokPrikaz);

        jLabel16.setText("T-precka");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel12))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sirinaFiksnogText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(sirinaDryKipText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(189, 189, 189)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(169, 169, 169)
                            .addComponent(visinaText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(568, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(sirinaFiksnogText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(sirinaDryKipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(3, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(11, 11, 11)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel11))
                    .addGap(24, 24, 24)
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visinaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(421, 421, 421)))
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
                .addGap(337, 337, 337)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            Logger.getLogger(FiksniDryKipKrojna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_postaviListuActionPerformed

    private void sirinaDryKipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sirinaDryKipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sirinaDryKipTextActionPerformed

    private void sirinaFiksnogTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sirinaFiksnogTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sirinaFiksnogTextActionPerformed

    private void pozicijaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozicijaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozicijaTextActionPerformed

    private void pvcProfilDropBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxItemStateChanged

    private void pvcProfilDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxActionPerformed

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
            java.util.logging.Logger.getLogger(FiksniDryKipKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiksniDryKipKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiksniDryKipKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiksniDryKipKrojna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiksniDryKipKrojna().setVisible(true);
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JTextField sirinaDryKipText;
    private javax.swing.JTextField sirinaFiksnogText;
    private javax.swing.JList<String> stakloPrikaz;
    private javax.swing.JList<String> stokPrikaz;
    private javax.swing.JList<String> tPreckaPrikaz;
    private javax.swing.JTextField visinaText;
    // End of variables declaration//GEN-END:variables
}
