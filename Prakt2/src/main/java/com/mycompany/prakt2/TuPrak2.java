/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prakt2;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TuPrak2 extends javax.swing.JFrame {
    String pilih;
    int harga;
    int jumlah;
    int total;
    public TuPrak2() {
        initComponents();
        setTitle("Toko Makan");
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btambah = new javax.swing.JButton();
        bkurang = new javax.swing.JButton();
        txtmasukan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bbeli = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bhapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnamapesanan = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        fnasikuning = new javax.swing.JRadioButton();
        fnasirames = new javax.swing.JRadioButton();
        fnasigoreng = new javax.swing.JRadioButton();
        fnasimawut = new javax.swing.JRadioButton();
        fnasipecel = new javax.swing.JRadioButton();
        fnasipadang = new javax.swing.JRadioButton();
        fsate = new javax.swing.JRadioButton();
        fnasinila = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        fnasisoto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        fbakar = new javax.swing.JRadioButton();
        fbakso = new javax.swing.JRadioButton();
        fcampur = new javax.swing.JRadioButton();
        frames = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(250, 219, 219));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(234, 154, 154));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jumlah Beli");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 119, -1));

        btambah.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btambah.setText("+");
        btambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btambahMouseClicked(evt);
            }
        });
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });
        jPanel7.add(btambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 36, 65, 39));

        bkurang.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bkurang.setText("-");
        bkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkurangActionPerformed(evt);
            }
        });
        jPanel7.add(bkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 36, 65, 39));

        txtmasukan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtmasukan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasukanActionPerformed(evt);
            }
        });
        jPanel7.add(txtmasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 87, 87, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informasi Pesanan");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 144, 133, -1));

        bbeli.setText("Beli");
        bbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbeliActionPerformed(evt);
            }
        });
        jPanel7.add(bbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 132, 186, 6));

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel7.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Pesanan Anda");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 202, 84, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel7.setText("Harga Makanan");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setText("Jumlah Pesanan");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 258, 84, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Total Bayar");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 286, 84, -1));

        txtnamapesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamapesananActionPerformed(evt);
            }
        });
        jPanel7.add(txtnamapesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 199, 96, -1));
        jPanel7.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 227, 96, -1));
        jPanel7.add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 255, 96, -1));
        jPanel7.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 283, 96, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\BIMA\\OneDrive\\Gambar\\Saved Pictures\\toko5.jpg")); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 330));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 0, 230, -1));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Warung Makan Modern");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\BIMA\\OneDrive\\Gambar\\Saved Pictures\\97.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\BIMA\\OneDrive\\Gambar\\Saved Pictures\\98.png")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\BIMA\\OneDrive\\Gambar\\Saved Pictures\\warung3.jpg")); // NOI18N

        buttonGroup1.add(fnasikuning);
        fnasikuning.setText("Nasi Kuning");
        fnasikuning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnasikuningActionPerformed(evt);
            }
        });

        buttonGroup1.add(fnasirames);
        fnasirames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fnasirames.setText("Nasi Rames");

        buttonGroup1.add(fnasigoreng);
        fnasigoreng.setText("Nasi Goreng");

        buttonGroup1.add(fnasimawut);
        fnasimawut.setText("Nasi Mawut");

        buttonGroup1.add(fnasipecel);
        fnasipecel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fnasipecel.setText("Nasi Pecel");

        buttonGroup1.add(fnasipadang);
        fnasipadang.setText("Nasi Padang");

        buttonGroup1.add(fsate);
        fsate.setText("Sate");

        buttonGroup1.add(fnasinila);
        fnasinila.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fnasinila.setForeground(new java.awt.Color(255, 255, 255));
        fnasinila.setText("Nasi Nila Bakar");
        fnasinila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnasinilaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton9.setText("Bakso");

        buttonGroup1.add(fnasisoto);
        fnasisoto.setText("Nasi Soto");
        fnasisoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnasisotoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Silahkan Pilih Menu :");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(fbakar);
        fbakar.setText("Nasi Bakar");

        buttonGroup1.add(fbakso);
        fbakso.setText("Bakso");

        buttonGroup1.add(fcampur);
        fcampur.setText("Nasi  Campur");
        fcampur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcampurActionPerformed(evt);
            }
        });

        buttonGroup1.add(frames);
        frames.setText("Nasi Rames");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(fnasikuning)
                                                .addGap(18, 18, 18)
                                                .addComponent(fnasisoto))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(fnasigoreng)
                                                .addGap(18, 18, 18)
                                                .addComponent(fsate)))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fbakso)
                                            .addComponent(fbakar)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fnasimawut)
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(frames)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(fnasipadang)
                                                .addGap(18, 18, 18)
                                                .addComponent(fcampur)))))
                                .addGap(394, 394, 394)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnasipecel)
                                    .addComponent(fnasirames)
                                    .addComponent(jRadioButton9)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(545, 545, 545)
                                .addComponent(fnasinila, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(968, 968, 968)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnasikuning)
                            .addComponent(fnasisoto)
                            .addComponent(fnasirames)
                            .addComponent(fbakar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnasigoreng)
                            .addComponent(fnasipecel)
                            .addComponent(fsate)
                            .addComponent(fbakso))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnasimawut)
                            .addComponent(fnasipadang)
                            .addComponent(jRadioButton9)
                            .addComponent(fcampur))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnasinila)
                            .addComponent(frames))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 320, 190));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\BIMA\\OneDrive\\Gambar\\Saved Pictures\\warung3.jpg")); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 290));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        pilih = "Tidak Ada";
       if (fnasikuning.isSelected()){
            pilih ="Nasi Kuning";
            harga = 11000;
        }
      else if (fnasisoto.isSelected()){
            pilih ="Nasi Soto";
            harga = 12000;
        }
       if (fbakar.isSelected()){
            pilih ="Nasi Bakar";
            harga = 10000;
        }
       if (fbakso.isSelected()){
            pilih ="Bakso";
            harga = 9500;
        }
       if (fsate.isSelected()){
            pilih ="Sate";
            harga = 12500;
        }
       if (fnasigoreng.isSelected()){
            pilih ="Nasi Goreng";
            harga = 13000;
        }
       if (fnasimawut.isSelected()){
            pilih ="Nasi Mawut";
            harga = 8000;
        }
       if (fcampur.isSelected()){
            pilih ="Nasi Campur";
            harga = 10500;
        }
       if (frames.isSelected()){
            pilih ="Nasi Rames";
            harga = 11500;
        }
       if (fnasipadang.isSelected()){
            pilih ="Nasi Padang";
            harga = 15000;
        }
       
       txtnamapesanan.setText(pilih);
       txtharga.setText("Rp." +harga);
       txtmasukan.setEditable(false);
       txtnamapesanan.setEditable(false);
       txtharga.setEditable(false);
       txttotal.setEditable(false);
       txtjumlah.setEditable(false);
       
       if (pilih == "Tidak Ada"){
       txtmasukan.setText(Integer.toString(jumlah));
       }
       else{
       jumlah++;
       txtmasukan.setText(Integer.toString(jumlah));
       }
       
       txtjumlah.setText(jumlah + " Porsi ");
       total = jumlah*harga;
       txttotal.setText("Rp." +total);
    }//GEN-LAST:event_btambahActionPerformed

    private void bkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkurangActionPerformed
       if (pilih == "Tidak Ada"){
       txtmasukan.setText(Integer.toString(jumlah));
       }
       else{
       jumlah--;
       txtmasukan.setText(Integer.toString(jumlah));
         if (jumlah<0){
         txtmasukan.setText("0");
         jumlah=0;
       }}
       
       txtjumlah.setText(jumlah + " Porsi ");
       total = jumlah*harga;
       txttotal.setText("Rp." +total);  
    }//GEN-LAST:event_bkurangActionPerformed

    private void txtmasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasukanActionPerformed

    private void fnasikuningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnasikuningActionPerformed


    }//GEN-LAST:event_fnasikuningActionPerformed

    private void fnasinilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnasinilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnasinilaActionPerformed

    private void fcampurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcampurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcampurActionPerformed

    private void bbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbeliActionPerformed
       if (jumlah <=0){
        JOptionPane.showMessageDialog(this,"Perhatian!!!, Harap memasukan Pesanan dan Jumlah Pesanan");
       }
       else {
           JOptionPane.showMessageDialog(this, "Pesanan Anda : " +pilih + "\nHarga 1 Porsi : " + "Rp." +harga + "\nJumlah Porsi Pesanan : " +jumlah + " Porsi" + "\nTotal Bayar : " + "Rp." +total );
       }
    }//GEN-LAST:event_bbeliActionPerformed

    private void txtnamapesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamapesananActionPerformed

    }//GEN-LAST:event_txtnamapesananActionPerformed

    private void fnasisotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnasisotoActionPerformed
     
    }//GEN-LAST:event_fnasisotoActionPerformed

    private void btambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btambahMouseClicked

    }//GEN-LAST:event_btambahMouseClicked

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        jumlah =0;
        harga=0;
        total=0;
        
        txtnamapesanan.setText(" ");
        txtharga.setText(""+harga);
        txtjumlah.setText(""+jumlah);
        txttotal.setText(""+total);
        txtmasukan.setText(""+jumlah);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_bhapusActionPerformed

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
            java.util.logging.Logger.getLogger(TuPrak2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TuPrak2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TuPrak2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TuPrak2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuPrak2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbeli;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkurang;
    private javax.swing.JButton btambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fbakar;
    private javax.swing.JRadioButton fbakso;
    private javax.swing.JRadioButton fcampur;
    private javax.swing.JRadioButton fnasigoreng;
    private javax.swing.JRadioButton fnasikuning;
    private javax.swing.JRadioButton fnasimawut;
    private javax.swing.JRadioButton fnasinila;
    private javax.swing.JRadioButton fnasipadang;
    private javax.swing.JRadioButton fnasipecel;
    private javax.swing.JRadioButton fnasirames;
    private javax.swing.JRadioButton fnasisoto;
    private javax.swing.JRadioButton frames;
    private javax.swing.JRadioButton fsate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtmasukan;
    private javax.swing.JTextField txtnamapesanan;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
