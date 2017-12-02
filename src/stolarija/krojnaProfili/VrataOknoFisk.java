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
public class VrataOknoFisk extends javax.swing.JFrame {

  public void popuniPrikaz() throws SQLException{
        
        double sirinaOknaBr = Double.parseDouble(sirinaOknaText.getText());
        double sirinaVrataBr = Double.parseDouble(sirinaVrataText.getText());
        double visinaVrataBr = Double.parseDouble(visinaVrataText.getText());
        double visinaProzoraBr = Double.parseDouble(visinaProzoraText.getText());
        String pozicija = pozicijaText.getText();
        
        int ss = GabaritiProfila.sirinaStoka((String) pvcProfilDropBox.getSelectedItem());
        int sk = GabaritiProfila.sirinaKrila((String) pvcProfilDropBox.getSelectedItem());
        int preklop = GabaritiProfila.preklop((String) pvcProfilDropBox.getSelectedItem());;

//        ***********************STOK*****************************************
        double sh1 = sirinaOknaBr + sirinaVrataBr + 6;
        double sh2 = sirinaOknaBr + sirinaVrataBr -2*ss;
        
        double sv1 = visinaVrataBr + visinaProzoraBr + 3;
        double sv2 = visinaVrataBr + visinaProzoraBr + 3;
        double sv3 = visinaVrataBr -0.5*ss;
        double sv4 = visinaProzoraBr -1.5*ss;
        
        String stokArr[] = {sh1+"",sh2+"",sv1+"" ,sv2+"",sv3+"",sv4+""};
        ArrayList listaStoka = new ArrayList<String>(Arrays.asList(stokArr));
        stokPrikaz.setListData(stokArr);
        Util.snimiStok(pozicija, "vrata + okno + fiksni", listaStoka);
        
        //        ***********************KRILO*****************************************
        double kh1 = sirinaOknaBr - 1.5*ss + 6 + preklop;
        double kh2 = sirinaOknaBr - 1.5*ss + 6 + preklop;
        double kh3 = sirinaVrataBr - 1.5*ss + 6 + preklop;
        double kh4 = sirinaVrataBr - 1.5*ss + 6 + preklop;
        
        double kv1 = visinaVrataBr - 0.5*ss + 6 + 0.5*preklop;
        double kv2 = visinaVrataBr - 0.5*ss + 6 + 0.5*preklop;
        double kv3 = visinaVrataBr - 0.5*ss + 6 + 0.5*preklop;
        double kv4 = visinaVrataBr - 0.5*ss + 6 + 0.5*preklop;
        
        String kriloArr[] = {kh1+"",kh2+"" ,kh3+"" ,kh4+"",kv1+"",kv2+"" ,kv3+"" ,kv4+"" };
        ArrayList listaKrila = new ArrayList<String>(Arrays.asList(kriloArr));
        
        kriloPrikaz.setListData(kriloArr);
        Util.snimiKrilo(pozicija, "vrata + okno + fiksni", listaKrila);
        
//        ***********************LAJSNA*****************************************
        double lh1 = sirinaOknaBr- 1.5*ss - 2*sk + preklop;
        double lh2 = sirinaOknaBr- 1.5*ss - 2*sk + preklop;
        double lh3 = sirinaVrataBr- 1.5*ss - 2*sk + preklop;
        double lh4 = sirinaVrataBr- 1.5*ss - 2*sk + preklop;

        double lh5 = sirinaOknaBr- 1.5*ss;
        double lh6 = sirinaOknaBr- 1.5*ss;
        double lh7 = sirinaVrataBr- 1.5*ss;
        double lh8 = sirinaVrataBr- 1.5*ss;
        
        double lv1 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop;
        double lv2 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop;
        double lv3 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop;
        double lv4 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop;
        
        double lv5 = visinaProzoraBr - 1.5*ss;
        double lv6 = visinaProzoraBr - 1.5*ss;
        double lv7 = visinaProzoraBr - 1.5*ss;
        double lv8 = visinaProzoraBr - 1.5*ss;
        
        String lajsnakArr[] = {lh1+"",lh2+"" ,lh3+"" ,lh4+"",lh5+"",lh6+"" ,lh7+"" ,lh8+""
                                ,lv1+"",lv2+"" ,lv3+"" ,lv4+"",lv5+"",lv6+"" ,lv7+"" ,lv8+"" };
        ArrayList listaLajsna = new ArrayList<String>(Arrays.asList(lajsnakArr));
        lajsnaPrikaz.setListData(lajsnakArr);
        Util.snimiLajsna(pozicija, "vrata + okno + fiksni", listaLajsna);

//        ***********************OJACANJE*****************************************
        double OSh1 = sirinaOknaBr + sirinaVrataBr-2*ss-20;
        double OSh2 = sirinaOknaBr + sirinaVrataBr-2*ss-20;
        double OSv1 = visinaVrataBr + visinaProzoraBr - ss - 20;
        double OSv2 = visinaVrataBr + visinaProzoraBr - ss - 20;
        double OSv3 = visinaVrataBr - 0.5*ss - 20;
        double OSv4 = visinaProzoraBr - 1.5*ss - 20;
        
        double OKh1 = sirinaOknaBr-1.5*ss- 2*sk + preklop - 20;
        double OKh2 = sirinaOknaBr-1.5*ss- 2*sk + preklop - 20;
        double OKh3 = sirinaVrataBr-1.5*ss- 2*sk + preklop - 20;
        double OKh4 = sirinaVrataBr-1.5*ss- 2*sk + preklop - 20;
        
        double OKv1 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop -20;
        double OKv2 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop -20;
        double OKv3 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop -20;
        double OKv4 = visinaVrataBr - 0.5*ss - 2*sk + 0.5*preklop -20;
        
        String ojacanjeArr[] = {OSh1+"",OSh2+"",OKh1+"",OKh2+"",OKh3+"" ,OKh4+""
                                ,OSv1+"",OSv2+"",OSv3+"" ,OSv4+"",OKv1+"",OKv2+"",OKv3+"",OKv4+"" };
        ArrayList listaOjacanje = new ArrayList<String>(Arrays.asList(ojacanjeArr));
        ojacanjePrikaz.setListData(ojacanjeArr);
        Util.snimiOjacanje(pozicija, "vrata + okno + fiksni", listaOjacanje);
        
//        ***********************STAKLO*****************************************
        String staklo1 = ((sirinaOknaBr - 1.5*ss - 2*sk - 10 + preklop)+" x "
                        + (visinaVrataBr- 0.5*ss -2*sk - 10 + 0.5*preklop));
        String staklo2 = ((sirinaVrataBr - 1.5*ss - 2*sk - 10 + preklop)+" x "
                        + (visinaVrataBr- 0.5*ss -2*sk - 10 + 0.5*preklop));
        String staklo3 = ((sirinaOknaBr-1.5*ss - 10)+" x "
                        + (visinaProzoraBr- 1.5*ss - 10));
        String staklo4 = ((sirinaVrataBr-1.5*ss - 10)+" x "
                        + (visinaProzoraBr- 1.5*ss - 10));
        
        String stakloArr[] = {staklo1+"",staklo2+"",staklo3+"",staklo4+"" };
        stakloPrikaz.setListData(stakloArr);    
        ArrayList listaStaklo = new ArrayList<String>(Arrays.asList(stakloArr));
        
        Util.snimiStaklo(pozicija, "vrata + okno + fiksni", listaStaklo);
         
    }
    public VrataOknoFisk() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pozicijaText = new javax.swing.JTextField();
        pvcProfilDropBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sirinaOknaText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sirinaVrataText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        postaviListu = new javax.swing.JButton();
        visinaVrataText = new javax.swing.JTextField();
        visinaProzoraText = new javax.swing.JTextField();
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

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("pozicija :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("sirina pomocnog :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("visina prozora :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("vrata jednokrilna");

        jLabel16.setText("cm");

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
        jLabel4.setText("visina vrata :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("pvc profil :");

        jLabel13.setText("cm");

        jLabel7.setText("cm");

        jLabel11.setText("cm");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stolarija/slike/dupla+fiks 550.png"))); // NOI18N

        sirinaOknaText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sirinaOknaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sirinaOknaTextActionPerformed(evt);
            }
        });

        jLabel15.setText("cm");

        sirinaVrataText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        visinaVrataText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        visinaProzoraText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(107, 107, 107)
                                .addComponent(visinaProzoraText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12)
                                .addGap(65, 65, 65)
                                .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel4))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(sirinaOknaText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(visinaVrataText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(sirinaVrataText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(sirinaOknaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sirinaVrataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visinaVrataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(visinaProzoraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(pvcProfilDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pozicijaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(postaviListu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pozicijaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozicijaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozicijaTextActionPerformed

    private void pvcProfilDropBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxItemStateChanged

    private void pvcProfilDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvcProfilDropBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvcProfilDropBoxActionPerformed

    private void sirinaOknaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sirinaOknaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sirinaOknaTextActionPerformed

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
            java.util.logging.Logger.getLogger(VrataOknoFisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VrataOknoFisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VrataOknoFisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VrataOknoFisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VrataOknoFisk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JTextField sirinaOknaText;
    private javax.swing.JTextField sirinaVrataText;
    private javax.swing.JList<String> stakloPrikaz;
    private javax.swing.JList<String> stokPrikaz;
    private javax.swing.JList<String> tPreckaPrikaz;
    private javax.swing.JTextField visinaProzoraText;
    private javax.swing.JTextField visinaVrataText;
    // End of variables declaration//GEN-END:variables
}
