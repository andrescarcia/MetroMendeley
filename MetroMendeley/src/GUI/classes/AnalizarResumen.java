/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.classes;

import java.awt.Point;



/**
 *
 * @author andre
 */
public class AnalizarResumen extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public AnalizarResumen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_AgregarResumen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_AnalizarResumen = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_BuscarKeyword = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_BuscarAutor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_SalirGuardar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showSumarys = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selectSumaryDisplay = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(76, 8, 13));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(153, 17, 28));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/MetroMendeleyLogo.png"))); // NOI18N
        SidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 80));

        btn_AgregarResumen.setBackground(new java.awt.Color(195, 123, 128));
        btn_AgregarResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarResumenMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agregar Resumen");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/agregar-Icon.png"))); // NOI18N

        javax.swing.GroupLayout btn_AgregarResumenLayout = new javax.swing.GroupLayout(btn_AgregarResumen);
        btn_AgregarResumen.setLayout(btn_AgregarResumenLayout);
        btn_AgregarResumenLayout.setHorizontalGroup(
            btn_AgregarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AgregarResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        btn_AgregarResumenLayout.setVerticalGroup(
            btn_AgregarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AgregarResumenLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btn_AgregarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        SidePanel.add(btn_AgregarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 330, 60));

        btn_AnalizarResumen.setBackground(new java.awt.Color(8, 36, 75));
        btn_AnalizarResumen.setToolTipText("");
        btn_AnalizarResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AnalizarResumenMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Analizar Resumen");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Analyze-Icon.png"))); // NOI18N

        javax.swing.GroupLayout btn_AnalizarResumenLayout = new javax.swing.GroupLayout(btn_AnalizarResumen);
        btn_AnalizarResumen.setLayout(btn_AnalizarResumenLayout);
        btn_AnalizarResumenLayout.setHorizontalGroup(
            btn_AnalizarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AnalizarResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        btn_AnalizarResumenLayout.setVerticalGroup(
            btn_AnalizarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_AnalizarResumenLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(btn_AnalizarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        SidePanel.add(btn_AnalizarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 330, 60));

        btn_BuscarKeyword.setBackground(new java.awt.Color(195, 123, 128));
        btn_BuscarKeyword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarKeywordMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar por Keyword");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/keywordIcon.png"))); // NOI18N

        javax.swing.GroupLayout btn_BuscarKeywordLayout = new javax.swing.GroupLayout(btn_BuscarKeyword);
        btn_BuscarKeyword.setLayout(btn_BuscarKeywordLayout);
        btn_BuscarKeywordLayout.setHorizontalGroup(
            btn_BuscarKeywordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BuscarKeywordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        btn_BuscarKeywordLayout.setVerticalGroup(
            btn_BuscarKeywordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BuscarKeywordLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btn_BuscarKeywordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        SidePanel.add(btn_BuscarKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 330, 60));

        btn_BuscarAutor.setBackground(new java.awt.Color(195, 123, 128));
        btn_BuscarAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarAutorMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar por autor");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/autor-Icon.png"))); // NOI18N

        javax.swing.GroupLayout btn_BuscarAutorLayout = new javax.swing.GroupLayout(btn_BuscarAutor);
        btn_BuscarAutor.setLayout(btn_BuscarAutorLayout);
        btn_BuscarAutorLayout.setHorizontalGroup(
            btn_BuscarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BuscarAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        btn_BuscarAutorLayout.setVerticalGroup(
            btn_BuscarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BuscarAutorLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btn_BuscarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        SidePanel.add(btn_BuscarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 330, 60));

        btn_SalirGuardar.setBackground(new java.awt.Color(195, 123, 128));
        btn_SalirGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirGuardarMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salir y guardar");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/saliryguardar-Icon.png"))); // NOI18N

        javax.swing.GroupLayout btn_SalirGuardarLayout = new javax.swing.GroupLayout(btn_SalirGuardar);
        btn_SalirGuardar.setLayout(btn_SalirGuardarLayout);
        btn_SalirGuardarLayout.setHorizontalGroup(
            btn_SalirGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_SalirGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        btn_SalirGuardarLayout.setVerticalGroup(
            btn_SalirGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_SalirGuardarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btn_SalirGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        SidePanel.add(btn_SalirGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 330, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unimet 2023 ®");
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 260, 26));

        BG.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 710));

        jPanel1.setBackground(new java.awt.Color(153, 17, 28));

        jPanel4.setBackground(new java.awt.Color(8, 36, 75));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/exit-icon.png"))); // NOI18N
        exit.setText("Exit");
        exit.setToolTipText("");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(13, 13, 13))
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Seccion Analizar Resumen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 650, 190));

        showSumarys.setColumns(20);
        showSumarys.setLineWrap(true);
        showSumarys.setRows(5);
        showSumarys.setEnabled(false);
        jScrollPane1.setViewportView(showSumarys);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 520, 330));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("A continuación tiene una lista ordenada alfabeticamente ");
        BG.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Resumen:");
        BG.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        BG.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, -1, 50));

        selectSumaryDisplay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectSumaryDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSumaryDisplayActionPerformed(evt);
            }
        });
        BG.add(selectSumaryDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 400, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("de artículos científicos disponibles:");
        BG.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_exitMousePressed
    private Point initialClick;

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        initialClick = evt.getPoint();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        int x = getLocation().x - initialClick.x + evt.getX();
        int y = getLocation().y - initialClick.y + evt.getY();
        setLocation(x, y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel10MouseClicked

    private void btn_BuscarKeywordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarKeywordMouseClicked
        // TODO add your handling code here:
        BuscarKeyword v2 = new BuscarKeyword();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BuscarKeywordMouseClicked

    private void btn_BuscarAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarAutorMouseClicked
        // TODO add your handling code here:
        BuscarAutor v3 = new BuscarAutor();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BuscarAutorMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_AnalizarResumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AnalizarResumenMouseClicked
        // TODO add your handling code here:
        AnalizarResumen v2 = new AnalizarResumen();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AnalizarResumenMouseClicked

    private void iconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iconoMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btn_SalirGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SalirGuardarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectSumaryDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSumaryDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSumaryDisplayActionPerformed

    private void btn_AgregarResumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarResumenMouseClicked
        // TODO add your handling code here:
        AgregarResumen v2 = new AgregarResumen();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AgregarResumenMouseClicked

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
            java.util.logging.Logger.getLogger(AnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalizarResumen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel btn_AgregarResumen;
    private javax.swing.JPanel btn_AnalizarResumen;
    private javax.swing.JPanel btn_BuscarAutor;
    private javax.swing.JPanel btn_BuscarKeyword;
    private javax.swing.JPanel btn_SalirGuardar;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> selectSumaryDisplay;
    private javax.swing.JTextArea showSumarys;
    // End of variables declaration//GEN-END:variables
}
