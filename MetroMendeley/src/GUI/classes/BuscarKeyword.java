/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Classes;

import AppClasses.App;
import java.awt.Point;

/**
 *
 * @author andre & Angel Granado
 */
public class BuscarKeyword extends javax.swing.JFrame {

    private Helpers helpers = new Helpers();
    private App app = App.getInstance();
    boolean keyWordSelected = false;
    boolean selectedPaper = false;

    /**
     * Creates new form Inicio
     */
    public BuscarKeyword() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.selectPaper.setEnabled(false);
        this.AnalizarBoton.setEnabled(false);
        this.showInfo.setEditable(false);
        this.getHelpers().fillInfoKeyWord(this.showInfo, this.selectKeywordOptions);
        this.showInfo.setCaretPosition(0);
        
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        AnalizarBoton = new javax.swing.JButton();
        selectPaper = new javax.swing.JComboBox<>();
        selectKeywordOptions = new javax.swing.JComboBox<>();
        BuscarBoton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(76, 8, 13));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(153, 17, 28));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/MetroMendeleyLogo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
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
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/agregar-Icon.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_AgregarResumenLayout = new javax.swing.GroupLayout(btn_AgregarResumen);
        btn_AgregarResumen.setLayout(btn_AgregarResumenLayout);
        btn_AgregarResumenLayout.setHorizontalGroup(
            btn_AgregarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AgregarResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
        btn_AgregarResumenLayout.setVerticalGroup(
            btn_AgregarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AgregarResumenLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btn_AgregarResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        SidePanel.add(btn_AgregarResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 330, 60));

        btn_AnalizarResumen.setBackground(new java.awt.Color(195, 123, 128));
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

        btn_BuscarKeyword.setBackground(new java.awt.Color(8, 36, 75));
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
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

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
        jLabel17.setText("Seccion Buscar por Keyword");

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

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("A continuación tiene una lista de las Keywords disponibles");
        BG.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 510, 60));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Palabras Claves");
        BG.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        AnalizarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnalizarBoton.setText("Analizar");
        AnalizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarBotonActionPerformed(evt);
            }
        });
        BG.add(AnalizarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 100, 50));

        selectPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPaperActionPerformed(evt);
            }
        });
        BG.add(selectPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 400, 50));

        selectKeywordOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectKeywordOptionsActionPerformed(evt);
            }
        });
        BG.add(selectKeywordOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 400, 50));

        BuscarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BuscarBoton.setText("Buscar");
        BuscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBotonActionPerformed(evt);
            }
        });
        BG.add(BuscarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 100, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Papers Relacionados");
        BG.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, -1));

        showInfo.setColumns(20);
        showInfo.setRows(5);
        jScrollPane1.setViewportView(showInfo);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 510, 240));

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
        this.getHelpers().exitApp();
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
        BuscarKeyword v2 = new BuscarKeyword();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btn_BuscarKeywordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarKeywordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarKeywordMouseClicked

    private void btn_BuscarAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarAutorMouseClicked
        // TODO add your handling code here:
        BuscarAutor v3 = new BuscarAutor();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BuscarAutorMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        BuscarAutor v3 = new BuscarAutor();
        v3.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        AnalizarResumen v2 = new AnalizarResumen();
        v2.setVisible(true);
        this.dispose();

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
        this.getHelpers().exitApp();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btn_SalirGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirGuardarMouseClicked
        // TODO add your handling code here:
        this.getHelpers().exitApp();
    }//GEN-LAST:event_btn_SalirGuardarMouseClicked

    private void AnalizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarBotonActionPerformed
         // TODO add your handling code here:
        /** FUNCIONALIDAD BOTON ANALIZAR Y QUITAR RESUMEN 
        *  Permite obtener la información del artículo seleccionado y volver atrás en caso de que desee buscar otro artículo por keyword. 
        */
        if (!this.selectedPaper) {
            this.selectedPaper = true;
            // Se pasa el JComboBox con la opción seleccionada & el TextArea a la función auxiliar para mostrar la información del artículo seleccionado.
            this.getHelpers().searchPaperByKeyword(this.selectPaper, this.showInfo);
            this.showInfo.setCaretPosition(0);
            // Se modifica el botón para que el usuario sea capaz de volver atrás y seleccionar otro resumen.
            this.AnalizarBoton.setText("Quitar");
            // Se bloquea el JComboBox 
            this.selectPaper.setEnabled(false);
            // Se modifica los labels para que el usuario identifique que ha cambiado de estado la pestaña.
            this.jLabel18.setText("Informacion del articulo seleccionado");
        } else {
            // Se modifica los labels para que el usuario identifique que ha cambiado de estado la pestaña.
            this.jLabel18.setText("A continuación tiene una lista de las Keywords disponibles");
            this.selectedPaper = false;
            // Se habilita el JComboBox para que el usuario seleccione el artículo.
            this.selectPaper.setEnabled(true);
            // Se pasa el JComboBox de palabras claves  y el TextArea a la función auxiliar para mostrar la información de palabras claves disponibles.
            this.getHelpers().fillInfoKeyWord(this.showInfo, this.selectKeywordOptions);
            // Se vacían JComBox para que no colisionen keywords que pudieran estar previamente de una busqueda anterior.
            this.selectKeywordOptions.removeAllItems();
            // Se pasa el JComboBox de palabras claves  y el TextArea a la función auxiliar para mostrar la información de palabras claves disponibles.
            this.getHelpers().fillInfoKeyWord(showInfo, selectKeywordOptions);
            this.showInfo.setCaretPosition(0);
            // Se modifica el nombre del botón para que el usuario sea capaz analizar el artīculo.
            this.AnalizarBoton.setText("Analizar");

        }
    }//GEN-LAST:event_AnalizarBotonActionPerformed

    private void selectPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPaperActionPerformed

    private void btn_AgregarResumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarResumenMouseClicked
        // TODO add your handling code here:
        AgregarResumen v2 = new AgregarResumen();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AgregarResumenMouseClicked

    private void BuscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBotonActionPerformed
           // TODO add your handling code here:
        /** FUNCIONALIDAD BOTON BUSCAR RESUMENES POR KEYWORD 
        *  Permite obtener la información del artículo seleccionado y volver atrás en caso de que desee buscar otro artículo por keyword. 
        */
        if (!this.keyWordSelected) {
            this.keyWordSelected = true;
            // Se inhabilita JComBox de mostrar keywords.
            this.selectKeywordOptions.setEnabled(false);
            // Se habilita JComboBox para seleccionar titulo de articulo.
            this.selectPaper.setEnabled(true);
            // Se habilita botón analizar resumen.
            this.AnalizarBoton.setEnabled(true);
            // Se cambia botón de Analizar artículo.
            this.AnalizarBoton.setText("Analizar");
            // Se modifica el botón para que el usuario sea capaz de volver atrás y seleccionar otro keyword.
            this.BuscarBoton.setText("Quitar");
            // Se pasa el JComboBox de palabras claves con la opción seleccionada y el JComboBox de titulos de artículos para mostrar titulos relacionados.
            getHelpers().fillSelectPaper(this.selectKeywordOptions, selectPaper);
            this.showInfo.setCaretPosition(0);
            this.selectedPaper = false;
        } else {
            this.selectedPaper = false;
            // Se modifica nombre de boton buscar keyword.
            this.BuscarBoton.setText("Buscar");
            this.AnalizarBoton.setText("Analizar");
            // Se inhabilita JComboBox de seleccionar titulo de articulo hasta que se tenga el keyword.
            this.selectPaper.setEnabled(false);
            // Se inhabilita botón seleccionar titulo de artículo.
            this.AnalizarBoton.setEnabled(false);
            // Se habilita JComboBox de mostrar keywords. 
            this.selectKeywordOptions.setEnabled(true);
            this.keyWordSelected = false;
            // Se remueven todos los titulos que pudieron haber estado cargadas en el JComboBox de un busqueda previa.
            this.selectPaper.removeAllItems();
            // Se remueven todos los Keywords que pudieron haber estado cargadas en el JComboBox de un busqueda previa.
            this.selectKeywordOptions.removeAllItems();
            // Se pasa el JComboBox de palabras claves  y el TextArea a la función auxiliar para mostrar la información de palabras claves disponibles.
            this.getHelpers().fillInfoKeyWord(showInfo, selectKeywordOptions);
            this.showInfo.setCaretPosition(0);
            // Se modifica los labels para que el usuario identifique que lo que se muestra en el TextArea son las palabras claves.
            this.jLabel18.setText("A continuación tiene una lista de las Keywords disponibles");
        }
    }//GEN-LAST:event_BuscarBotonActionPerformed


    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Inicio v2 = new Inicio();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        AgregarResumen v2 = new AgregarResumen();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        AgregarResumen v2 = new AgregarResumen();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.getHelpers().exitApp();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void selectKeywordOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectKeywordOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectKeywordOptionsActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarKeyword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarKeyword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarKeyword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarKeyword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new BuscarKeyword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizarBoton;
    private javax.swing.JPanel BG;
    private javax.swing.JButton BuscarBoton;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel btn_AgregarResumen;
    private javax.swing.JPanel btn_AnalizarResumen;
    private javax.swing.JPanel btn_BuscarAutor;
    private javax.swing.JPanel btn_BuscarKeyword;
    private javax.swing.JPanel btn_SalirGuardar;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JComboBox<String> selectKeywordOptions;
    private javax.swing.JComboBox<String> selectPaper;
    private javax.swing.JTextArea showInfo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the app
     */
    public App getApp() {
        return app;
    }

    /**
     * @param app the app to set
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * @return the keyWordSelected
     */
    public boolean isKeyWordSelected() {
        return keyWordSelected;
    }

    /**
     * @param keyWordSelected the keyWordSelected to set
     */
    public void setKeyWordSelected(boolean keyWordSelected) {
        this.keyWordSelected = keyWordSelected;
    }

    /**
     * @return the helpers
     */
    public Helpers getHelpers() {
        return this.helpers;
    }

    /**
     * @param helpers the helpers to set
     */
    public void setHelpers(Helpers helpers) {
        this.helpers = helpers;
    }
}
