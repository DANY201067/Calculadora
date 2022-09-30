/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class CalculadoraBasica extends javax.swing.JFrame {
    //declaracion de variables 
    public float primerNumero;
    public float segundoNumero;
    public String operador;
   // boolean porcentaje=false;

  
    
    public CalculadoraBasica() {
        setTitle("CALCULADORA");//establecemos el titulo de la ventana
        initComponents();
           setResizable(false);
        this.setLocationRelativeTo(null);
         //setSize(315, 550); //modificar tamaño de la ventana de la calculadora
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jpanel_Ventana = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Button0 = new javax.swing.JButton();
        ButtonPUNTO = new javax.swing.JButton();
        ButtonIGUAL = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonSUMAR = new javax.swing.JButton();
        ButtonRESTAR = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        ButtonMULTIPLICAR = new javax.swing.JButton();
        ButtonDIVISION = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonDEL = new javax.swing.JButton();
        ButtonBORRAR = new javax.swing.JButton();
        ButtonPorcentaje = new javax.swing.JButton();
        ButtonCUADRADO = new javax.swing.JButton();
        ButtonRAIZ = new javax.swing.JButton();
        Buttonmasmenos = new javax.swing.JButton();
        jButtonINVERSA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        Jpanel_Ventana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jpanel_Ventana.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Jpanel_Ventana.setToolTipText("");
        Jpanel_Ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jpanel_VentanaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        Button0.setBackground(new java.awt.Color(204, 204, 204));
        Button0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button0.setForeground(new java.awt.Color(51, 51, 51));
        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        ButtonPUNTO.setBackground(new java.awt.Color(204, 204, 204));
        ButtonPUNTO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ButtonPUNTO.setForeground(new java.awt.Color(51, 51, 51));
        ButtonPUNTO.setText(".");
        ButtonPUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPUNTOActionPerformed(evt);
            }
        });

        ButtonIGUAL.setBackground(new java.awt.Color(204, 204, 204));
        ButtonIGUAL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ButtonIGUAL.setForeground(new java.awt.Color(51, 51, 51));
        ButtonIGUAL.setText("=");
        ButtonIGUAL.setFocusable(false);
        ButtonIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIGUALActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(102, 102, 102));
        Button1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(102, 102, 102));
        Button2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(102, 102, 102));
        Button3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        ButtonSUMAR.setBackground(new java.awt.Color(0, 153, 153));
        ButtonSUMAR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonSUMAR.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSUMAR.setText("+");
        ButtonSUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSUMARActionPerformed(evt);
            }
        });

        ButtonRESTAR.setBackground(new java.awt.Color(0, 153, 153));
        ButtonRESTAR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonRESTAR.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRESTAR.setText("-");
        ButtonRESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRESTARActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(102, 102, 102));
        Button4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(102, 102, 102));
        Button5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(102, 102, 102));
        Button6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        ButtonMULTIPLICAR.setBackground(new java.awt.Color(0, 153, 153));
        ButtonMULTIPLICAR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonMULTIPLICAR.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMULTIPLICAR.setText("x");
        ButtonMULTIPLICAR.setFocusable(false);
        ButtonMULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMULTIPLICARActionPerformed(evt);
            }
        });

        ButtonDIVISION.setBackground(new java.awt.Color(0, 153, 153));
        ButtonDIVISION.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonDIVISION.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDIVISION.setText("/");
        ButtonDIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDIVISIONActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(102, 102, 102));
        Button7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(102, 102, 102));
        Button8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(102, 102, 102));
        Button9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        ButtonDEL.setBackground(new java.awt.Color(255, 51, 51));
        ButtonDEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonDEL.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDEL.setText("DEL");
        ButtonDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDELActionPerformed(evt);
            }
        });

        ButtonBORRAR.setBackground(new java.awt.Color(255, 51, 51));
        ButtonBORRAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonBORRAR.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBORRAR.setText("AC");
        ButtonBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBORRARActionPerformed(evt);
            }
        });

        ButtonPorcentaje.setBackground(new java.awt.Color(204, 204, 204));
        ButtonPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPorcentaje.setForeground(new java.awt.Color(51, 51, 51));
        ButtonPorcentaje.setText("%");
        ButtonPorcentaje.setFocusable(false);
        ButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPorcentajeActionPerformed(evt);
            }
        });

        ButtonCUADRADO.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCUADRADO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonCUADRADO.setForeground(new java.awt.Color(51, 51, 51));
        ButtonCUADRADO.setText("^2");
        ButtonCUADRADO.setFocusable(false);
        ButtonCUADRADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCUADRADOActionPerformed(evt);
            }
        });

        ButtonRAIZ.setBackground(new java.awt.Color(204, 204, 204));
        ButtonRAIZ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonRAIZ.setForeground(new java.awt.Color(51, 51, 51));
        ButtonRAIZ.setText("√");
        ButtonRAIZ.setFocusable(false);
        ButtonRAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRAIZActionPerformed(evt);
            }
        });

        Buttonmasmenos.setBackground(new java.awt.Color(204, 204, 204));
        Buttonmasmenos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Buttonmasmenos.setForeground(new java.awt.Color(51, 51, 51));
        Buttonmasmenos.setText("-/+");
        Buttonmasmenos.setFocusable(false);
        Buttonmasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonmasmenosActionPerformed(evt);
            }
        });

        jButtonINVERSA.setBackground(new java.awt.Color(204, 204, 204));
        jButtonINVERSA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonINVERSA.setForeground(new java.awt.Color(51, 51, 51));
        jButtonINVERSA.setText("1/x");
        jButtonINVERSA.setFocusable(false);
        jButtonINVERSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINVERSAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(ButtonPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonINVERSA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCUADRADO, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonDEL, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(ButtonRAIZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Buttonmasmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonPUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonIGUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(2, 2, 2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonSUMAR, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(ButtonMULTIPLICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonRESTAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonDIVISION, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buttonmasmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonRAIZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCUADRADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonINVERSA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonDIVISION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonMULTIPLICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonSUMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonRESTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPUNTO, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(Button0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonIGUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setText("CASIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpanel_Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Jpanel_Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jpanel_VentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jpanel_VentanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jpanel_VentanaActionPerformed

    private void ButtonCUADRADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCUADRADOActionPerformed
       primerNumero = (float) Double.parseDouble(Jpanel_Ventana.getText());
       primerNumero *= primerNumero;
       this.Jpanel_Ventana.setText(String.valueOf(primerNumero));
        
    }//GEN-LAST:event_ButtonCUADRADOActionPerformed

    private void ButtonBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBORRARActionPerformed
       this.Jpanel_Ventana.setText(" ");
      // ButtonBORRAR.setForeground(Color.WHITE);//establecemos el color de la letra del boton
       //ButtonBORRAR.setBackground(Color.red);
    }//GEN-LAST:event_ButtonBORRARActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
      this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"0");
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
       this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
         this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
         this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
       this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
       this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"7");
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+"9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSUMARActionPerformed
        this.primerNumero=Float.parseFloat(this.Jpanel_Ventana.getText());
        this.operador="+";
        this.Jpanel_Ventana.setText(" ");
    }//GEN-LAST:event_ButtonSUMARActionPerformed

    private void ButtonIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIGUALActionPerformed
      this.segundoNumero=Float.parseFloat(this.Jpanel_Ventana.getText());
      
      switch(this.operador){
          case "+":this.Jpanel_Ventana.setText(sincero(this.primerNumero+this.segundoNumero));break;
            case "-":this.Jpanel_Ventana.setText(sincero(this.primerNumero-this.segundoNumero));break;
              case "*":this.Jpanel_Ventana.setText(sincero(this.primerNumero*this.segundoNumero));break;
                  case "/":if(this.segundoNumero==0){ this.Jpanel_Ventana.setText("No se puede dividir entre cero");}
                  else{
                      this.Jpanel_Ventana.setText(sincero(this.primerNumero/this.segundoNumero));}break;
                  case "%":this.Jpanel_Ventana.setText(sincero(this.primerNumero*(this.segundoNumero/100)));break;
                  
    }
    }//GEN-LAST:event_ButtonIGUALActionPerformed

    private void ButtonRESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRESTARActionPerformed
      this.primerNumero=Float.parseFloat(this.Jpanel_Ventana.getText());
        this.operador="-";
        this.Jpanel_Ventana.setText(" ");
    }//GEN-LAST:event_ButtonRESTARActionPerformed

    private void ButtonMULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMULTIPLICARActionPerformed
         this.primerNumero=Float.parseFloat(this.Jpanel_Ventana.getText());
        this.operador="*";
        this.Jpanel_Ventana.setText(" ");
    }//GEN-LAST:event_ButtonMULTIPLICARActionPerformed

    private void ButtonDIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDIVISIONActionPerformed
        this.primerNumero=Float.parseFloat(this.Jpanel_Ventana.getText());
        this.operador="/";
        this.Jpanel_Ventana.setText(" ");
    }//GEN-LAST:event_ButtonDIVISIONActionPerformed

    private void ButtonPUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPUNTOActionPerformed
        if(!(this.Jpanel_Ventana.getText().contains("."))){
         this.Jpanel_Ventana.setText(this.Jpanel_Ventana.getText()+".");
    }
    }//GEN-LAST:event_ButtonPUNTOActionPerformed

    private void ButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPorcentajeActionPerformed
      this.primerNumero=Float.parseFloat(this.Jpanel_Ventana.getText());
        this.operador="%";
        this.Jpanel_Ventana.setText(" ");
    
     
    }//GEN-LAST:event_ButtonPorcentajeActionPerformed

    private void ButtonDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDELActionPerformed
        String cadena;
        cadena=this.Jpanel_Ventana.getText();
        if (cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            this.Jpanel_Ventana.setText(cadena);
       // ButtonDEL.setForeground(Color.WHITE);//establecemos el color de la letra del boton
        //ButtonDEL.setBackground(Color.red);
        }
        
    }//GEN-LAST:event_ButtonDELActionPerformed

    private void ButtonmasmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonmasmenosActionPerformed
       double cambio;
       cambio = Double.parseDouble(Jpanel_Ventana.getText());
       cambio = cambio* -1;
       this.Jpanel_Ventana.setText(Double.toString(cambio));
    }//GEN-LAST:event_ButtonmasmenosActionPerformed

    private void ButtonRAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRAIZActionPerformed
       primerNumero =  (float) Double.parseDouble(Jpanel_Ventana.getText());
       primerNumero =  (float) Math.sqrt(primerNumero);
       this.Jpanel_Ventana.setText(String.valueOf(primerNumero));
    }//GEN-LAST:event_ButtonRAIZActionPerformed

    private void jButtonINVERSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINVERSAActionPerformed
        String cadena;
        Double num;
        cadena=this.Jpanel_Ventana.getText();
        if(cadena.length()>0){
            num=1/Double.parseDouble(cadena);
            this.Jpanel_Ventana.setText(num.toString());
        }
      
    }//GEN-LAST:event_jButtonINVERSAActionPerformed

    public String sincero(float resultado){//numero entero 
        String retorno=" ";
        retorno=Float.toString(resultado);
        if(resultado%1==0){
            retorno=retorno.substring(0, retorno.length()-2); 
        }
        return retorno;
    }
   
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
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraBasica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonBORRAR;
    private javax.swing.JButton ButtonCUADRADO;
    private javax.swing.JButton ButtonDEL;
    private javax.swing.JButton ButtonDIVISION;
    private javax.swing.JButton ButtonIGUAL;
    private javax.swing.JButton ButtonMULTIPLICAR;
    private javax.swing.JButton ButtonPUNTO;
    private javax.swing.JButton ButtonPorcentaje;
    private javax.swing.JButton ButtonRAIZ;
    private javax.swing.JButton ButtonRESTAR;
    private javax.swing.JButton ButtonSUMAR;
    private javax.swing.JButton Buttonmasmenos;
    private javax.swing.JTextField Jpanel_Ventana;
    private javax.swing.JButton jButtonINVERSA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
