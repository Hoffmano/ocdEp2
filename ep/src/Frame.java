
import java.io.File;
import javax.swing.JLabel;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//não sei muito o que esta acontecendo aqui todo esse codigo foi gerado
//pelo netbeans automaticamente com o construtor de GUI

public class Frame extends javax.swing.JFrame {

        public Frame() {
                initComponents();
        }

        private void initComponents() {

                jInternalFrame1 = new javax.swing.JInternalFrame();
                jComboBox1 = new javax.swing.JComboBox<>();
                jPanel8 = new javax.swing.JPanel();
                jLabel39 = new javax.swing.JLabel();
                jLabel40 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                textArea = new javax.swing.JTextArea();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                labelAx = new javax.swing.JLabel();
                labelBx = new javax.swing.JLabel();
                labelCx = new javax.swing.JLabel();
                labelDx = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                labelPc = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                jLabel23 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                jLabel31 = new javax.swing.JLabel();
                jLabel33 = new javax.swing.JLabel();
                jLabel26 = new javax.swing.JLabel();
                jLabel28 = new javax.swing.JLabel();
                jLabel32 = new javax.swing.JLabel();
                jLabel30 = new javax.swing.JLabel();
                jLabel27 = new javax.swing.JLabel();
                jLabel29 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                buttonNext = new javax.swing.JButton();
                buttonStart = new javax.swing.JButton();
                jPanel5 = new javax.swing.JPanel();
                jLabel17 = new javax.swing.JLabel();
                jLabel34 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jLabel35 = new javax.swing.JLabel();
                jLabel36 = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jLabel37 = new javax.swing.JLabel();
                jLabel38 = new javax.swing.JLabel();
                jPanel9 = new javax.swing.JPanel();
                jLabel41 = new javax.swing.JLabel();
                jLabel42 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jLabel43 = new javax.swing.JLabel();
                jLabel44 = new javax.swing.JLabel();
                jLabel45 = new javax.swing.JLabel();
                jLabel46 = new javax.swing.JLabel();
                jLabel47 = new javax.swing.JLabel();
                jLabel48 = new javax.swing.JLabel();
                jLabel49 = new javax.swing.JLabel();
                jPanel10 = new javax.swing.JPanel();
                jLabel50 = new javax.swing.JLabel();
                jLabel51 = new javax.swing.JLabel();

                jInternalFrame1.setVisible(true);

                javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(
                                jInternalFrame1.getContentPane());
                jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
                jInternalFrame1Layout.setHorizontalGroup(
                                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                jInternalFrame1Layout.setVerticalGroup(
                                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                jPanel8.setBackground(new java.awt.Color(153, 153, 255));

                jLabel39.setText("OPERAÇÃO");

                jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel40.setText("MOV AX,BX");
                jLabel40.setOpaque(true);

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(jPanel8Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 204,
                                                                Short.MAX_VALUE)
                                                .addContainerGap())
                                .addGroup(jPanel8Layout.createSequentialGroup().addGap(83, 83, 83)
                                                .addComponent(jLabel39)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                jPanel8Layout.setVerticalGroup(jPanel8Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jLabel39)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("EP2 - OCD");
                setBackground(new java.awt.Color(255, 255, 255));
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                setLocation(new java.awt.Point(0, 0));
                setLocationByPlatform(true);
                setResizable(false);
                setSize(new java.awt.Dimension(854, 480));

                textArea.setColumns(20);
                textArea.setRows(5);
                textArea.setMinimumSize(new java.awt.Dimension(0, 0));
                jScrollPane2.setViewportView(textArea);

                jPanel1.setBackground(new java.awt.Color(153, 153, 255));

                jLabel1.setText("REGISTRADORES");

                jPanel2.setOpaque(false);

                jLabel2.setBackground(new java.awt.Color(255, 255, 255));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("AX");
                jLabel2.setAlignmentX(0.5F);
                jLabel2.setOpaque(true);

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("BX");
                jLabel3.setAlignmentX(0.5F);
                jLabel3.setOpaque(true);

                jLabel4.setBackground(new java.awt.Color(255, 255, 255));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("CX");
                jLabel4.setAlignmentX(0.5F);
                jLabel4.setOpaque(true);

                jLabel5.setBackground(new java.awt.Color(255, 255, 255));
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel5.setText("DX");
                jLabel5.setAlignmentX(0.5F);
                jLabel5.setOpaque(true);

                labelAx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labelAx.setText("0123456789ABCDEF");
                labelAx.setOpaque(true);

                labelBx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labelBx.setText("0123456789ABCDEF");
                labelBx.setOpaque(true);

                labelCx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labelCx.setText("0123456789ABCDEF");
                labelCx.setOpaque(true);

                labelDx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labelDx.setText("0123456789ABCDEF");
                labelDx.setOpaque(true);

                jLabel18.setBackground(new java.awt.Color(255, 255, 255));
                jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel18.setText("PC");
                jLabel18.setAlignmentX(0.5F);
                jLabel18.setOpaque(true);

                labelPc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labelPc.setText("0123456789");
                labelPc.setOpaque(true);

                jLabel20.setBackground(new java.awt.Color(255, 255, 255));
                jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel20.setText("MAR");
                jLabel20.setAlignmentX(0.5F);
                jLabel20.setOpaque(true);

                jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel21.setText("0123456789ABCDEF");
                jLabel21.setOpaque(true);

                jLabel22.setBackground(new java.awt.Color(255, 255, 255));
                jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel22.setText("MBR");
                jLabel22.setAlignmentX(0.5F);
                jLabel22.setOpaque(true);

                jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel23.setText("0123456789ABCDEF");
                jLabel23.setOpaque(true);

                jLabel24.setBackground(new java.awt.Color(255, 255, 255));
                jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel24.setText("IR");
                jLabel24.setAlignmentX(0.5F);
                jLabel24.setOpaque(true);

                jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel25.setText("0123456789ABCDEF");
                jLabel25.setOpaque(true);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                37, Short.MAX_VALUE))
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(labelAx,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(labelBx,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel21,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                186, Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel22,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel23,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel24,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel25,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel18,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(labelPc,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(labelDx,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(labelCx,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)))
                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelAx,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                23, Short.MAX_VALUE)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelBx,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                23, Short.MAX_VALUE)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(12, 12, 12)
                                                                                .addComponent(labelCx,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                23,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelDx,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                23, Short.MAX_VALUE)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelPc,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel18,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel21,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel23,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel25,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel24,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

                labelAx.getAccessibleContext().setAccessibleDescription("");

                jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel31.setText("0123456789ABCDEF");
                jLabel31.setOpaque(true);

                jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel33.setText("0123456789ABCDEF");
                jLabel33.setOpaque(true);

                jLabel26.setBackground(new java.awt.Color(255, 255, 255));
                jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel26.setText("CBR");
                jLabel26.setAlignmentX(0.5F);
                jLabel26.setOpaque(true);

                jLabel28.setBackground(new java.awt.Color(255, 255, 255));
                jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel28.setText("CAR");
                jLabel28.setAlignmentX(0.5F);
                jLabel28.setOpaque(true);

                jLabel32.setBackground(new java.awt.Color(255, 255, 255));
                jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel32.setText("AC");
                jLabel32.setAlignmentX(0.5F);
                jLabel32.setOpaque(true);

                jLabel30.setBackground(new java.awt.Color(255, 255, 255));
                jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel30.setText("AUX");
                jLabel30.setAlignmentX(0.5F);
                jLabel30.setOpaque(true);

                jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel27.setText("0123456789ABCDEF");
                jLabel27.setOpaque(true);

                jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel29.setText("0123456789");
                jLabel29.setOpaque(true);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(73, 73, 73)
                                                .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jPanel2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel26,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel27,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel28,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel29,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel31,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel33,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)))
                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel33,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel31,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel29,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel28,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel27,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel26,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap()));

                jPanel3.setBackground(new java.awt.Color(153, 153, 255));

                jLabel10.setText("FLAGS");

                jLabel11.setBackground(new java.awt.Color(255, 255, 255));
                jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel11.setText("OVERFLOW");
                jLabel11.setOpaque(true);

                jLabel12.setBackground(new java.awt.Color(255, 255, 255));
                jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel12.setText("ZERO");
                jLabel12.setOpaque(true);

                jLabel13.setBackground(new java.awt.Color(255, 255, 255));
                jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel13.setText("SIGNAL");
                jLabel13.setOpaque(true);

                jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel14.setText("0");
                jLabel14.setOpaque(true);
                jLabel14.setPreferredSize(new java.awt.Dimension(6, 6));

                jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel15.setText("0");
                jLabel15.setOpaque(true);
                jLabel15.setPreferredSize(new java.awt.Dimension(6, 6));

                jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel16.setText("0");
                jLabel16.setOpaque(true);
                jLabel16.setPreferredSize(new java.awt.Dimension(6, 6));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel11,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel12,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel13,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                83,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel14,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel15,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel16,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(51, 51, 51)
                                                                .addComponent(jLabel10)))
                                                .addGap(0, 10, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(22, 22, 22)
                                                .addComponent(jLabel10).addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel14,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel15,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                buttonNext.setLabel("NEXT");
                buttonNext.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonNextActionPerformed(evt);
                        }
                });

                buttonStart.setLabel("START");
                buttonStart.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonStartActionPerformed(evt);
                        }
                });

                jPanel5.setBackground(new java.awt.Color(153, 153, 255));

                jLabel17.setText("BARRAMENTO INTERNO");

                jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel34.setText("0123456789ABCDEF");
                jLabel34.setOpaque(true);

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(jPanel5Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                .addGroup(jPanel5Layout.createSequentialGroup().addGap(106, 106, 106)
                                                .addComponent(jLabel17)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                jPanel5Layout.setVerticalGroup(jPanel5Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                jPanel6.setBackground(new java.awt.Color(153, 153, 255));

                jLabel35.setText("BARRAMENTO SISTEMA");

                jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel36.setText("0123456789ABCDEF");
                jLabel36.setOpaque(true);

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(jPanel6Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel6Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel35).addGap(93, 93, 93)));
                jPanel6Layout.setVerticalGroup(jPanel6Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                jPanel7.setBackground(new java.awt.Color(153, 153, 255));

                jLabel37.setText("MICRO OPERAÇÃO");

                jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel38.setText("MAR <-  PC");
                jLabel38.setOpaque(true);

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(jPanel7Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel7Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel37).addGap(27, 27, 27)));
                jPanel7Layout.setVerticalGroup(jPanel7Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel37)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                jPanel9.setBackground(new java.awt.Color(153, 153, 255));

                jLabel41.setText("OPERAÇÃO");

                jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel42.setText("MOV AX,BX");
                jLabel42.setOpaque(true);

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(jPanel9Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel9Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel41).addGap(43, 43, 43)));
                jPanel9Layout.setVerticalGroup(jPanel9Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(jLabel41)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                jPanel4.setBackground(new java.awt.Color(153, 153, 255));

                jLabel43.setText("MEMORIA");

                jLabel44.setBackground(new java.awt.Color(255, 255, 255));
                jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel44.setText("READ");
                jLabel44.setOpaque(true);

                jLabel45.setBackground(new java.awt.Color(255, 255, 255));
                jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel45.setText("WRITE");
                jLabel45.setOpaque(true);

                jLabel46.setBackground(new java.awt.Color(255, 255, 255));
                jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel46.setText("ADDRES VALID");
                jLabel46.setOpaque(true);

                jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel47.setText("0");
                jLabel47.setOpaque(true);
                jLabel47.setPreferredSize(new java.awt.Dimension(6, 6));

                jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel48.setText("0");
                jLabel48.setOpaque(true);
                jLabel48.setPreferredSize(new java.awt.Dimension(6, 6));

                jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel49.setText("0");
                jLabel49.setOpaque(true);
                jLabel49.setPreferredSize(new java.awt.Dimension(6, 6));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jLabel43))
                                                                .addComponent(jLabel45,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel44,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel46,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel47,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)));
                jPanel4Layout.setVerticalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(22, 22, 22)
                                                .addComponent(jLabel43).addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel47,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel45,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                jPanel10.setBackground(new java.awt.Color(153, 153, 255));

                jLabel50.setText("ENDEREÇO MICRO OPERAÇÃO");

                jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel51.setText("0123456789");
                jLabel51.setOpaque(true);

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(jPanel10Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout
                                                .createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel10Layout.createSequentialGroup()
                                                                .addContainerGap(86, Short.MAX_VALUE)
                                                                .addComponent(jLabel50).addGap(93, 93, 93)));
                jPanel10Layout.setVerticalGroup(jPanel10Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jLabel50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup().addComponent(buttonStart,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18).addComponent(buttonNext,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                jPanel9,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jPanel7,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                .addComponent(jPanel10,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel5,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel6,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)))
                                                .addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                0, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jPanel9,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel7,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup().addComponent(jScrollPane2)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(buttonNext,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(buttonStart,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(14, Short.MAX_VALUE)));

                getAccessibleContext().setAccessibleName("frame0");

                pack();
                setLocationRelativeTo(null);
        }

        // metodo responsavel pelo clique do botao start
        // pega todo o codigo da textArea e coloca na String code
        private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {
            //preciso de uma classe que fique responsavel por traduzir o codigo, pois isso nao esta relacionado ao frame
            code = textArea.getText();
            tradutor.decodifica(code);
        }

        // metodo responsavel pelo clique do botao next
        private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {

        }

        // metodo set do valor mostrado no registrador AX
        public void setLabelAx(String string) {
                this.labelAx.setText(string);
        }

        public static void main(String args[]) {

            
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Frame().setVisible(true);
                        }
                });
        }

        // string que armazena o codigo escrito na textArea
        public String code;
        Scanner scanner;
        Tradutor tradutor = new Tradutor();

        private javax.swing.JButton buttonNext;
        private javax.swing.JButton buttonStart;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JInternalFrame jInternalFrame1;
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
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel37;
        private javax.swing.JLabel jLabel38;
        private javax.swing.JLabel jLabel39;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel40;
        private javax.swing.JLabel jLabel41;
        private javax.swing.JLabel jLabel42;
        private javax.swing.JLabel jLabel43;
        private javax.swing.JLabel jLabel44;
        private javax.swing.JLabel jLabel45;
        private javax.swing.JLabel jLabel46;
        private javax.swing.JLabel jLabel47;
        private javax.swing.JLabel jLabel48;
        private javax.swing.JLabel jLabel49;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel50;
        private javax.swing.JLabel jLabel51;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel labelAx;
        private javax.swing.JLabel labelBx;
        private javax.swing.JLabel labelCx;
        private javax.swing.JLabel labelDx;
        private javax.swing.JLabel labelPc;
        private javax.swing.JTextArea textArea;
}
