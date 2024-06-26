/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import model.Calculation;

/**
 *
 * @author bluez
 */
public class MyCalculation extends javax.swing.JFrame {

    /**
     * Creates new form MyCalculation
     */
    String myValue = "";
    String myValue1 = "";
    Calculation myCalculation = new Calculation();
    JPanel panel;

    public MyCalculation() {
        initComponents();
        this.setTitle("My Calculator");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
        jPanelHeaderContainer.setBorder(border);
        jPanelNumberContainer.setBorder(border);
        jPanelNumberContainer.setBackground(Color.LIGHT_GRAY);
        jPanelCalcuContainer.setBorder(border);
        jPanelCalcuContainer.setBackground(Color.lightGray);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void checkCalcu(String value) {
        if (jTextFieldCalcu.getText().equals("") == false) {
            myValue1 += value;
            jTextFieldN2.setText(myValue1);
        }
    }

    public void checkCalcuIsCalcultion(String value) {
        if (jTextFieldCalcu.getText().equals("") == true) {
            myValue += value;
            jTextFieldN1.setText(myValue);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelCalcuContainer = new javax.swing.JPanel();
        jButtonChia = new javax.swing.JButton();
        jButtonNhan = new javax.swing.JButton();
        jButtonCong = new javax.swing.JButton();
        jButtonTru = new javax.swing.JButton();
        jPanelNumberContainer = new javax.swing.JPanel();
        jButtonN8 = new javax.swing.JButton();
        jButtonN7 = new javax.swing.JButton();
        jButtonN9 = new javax.swing.JButton();
        jButtonN5 = new javax.swing.JButton();
        jButtonN4 = new javax.swing.JButton();
        jButtonN1 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonN6 = new javax.swing.JButton();
        jButtonN2 = new javax.swing.JButton();
        jButtonN3 = new javax.swing.JButton();
        jButtonN0 = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jPanelHeaderContainer = new javax.swing.JPanel();
        jTextFieldN1 = new javax.swing.JTextField();
        jTextFieldCalcu = new javax.swing.JTextField();
        jTextFieldN2 = new javax.swing.JTextField();
        jTextFieldResults = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonChia.setText("/");
        jButtonChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiaActionPerformed(evt);
            }
        });

        jButtonNhan.setText("*");
        jButtonNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhanActionPerformed(evt);
            }
        });

        jButtonCong.setText("+");
        jButtonCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCongActionPerformed(evt);
            }
        });

        jButtonTru.setText("-");
        jButtonTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCalcuContainerLayout = new javax.swing.GroupLayout(jPanelCalcuContainer);
        jPanelCalcuContainer.setLayout(jPanelCalcuContainerLayout);
        jPanelCalcuContainerLayout.setHorizontalGroup(
            jPanelCalcuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalcuContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelCalcuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButtonCong, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButtonTru, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCalcuContainerLayout.setVerticalGroup(
            jPanelCalcuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalcuContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonChia)
                .addGap(25, 25, 25)
                .addComponent(jButtonNhan)
                .addGap(25, 25, 25)
                .addComponent(jButtonCong)
                .addGap(25, 25, 25)
                .addComponent(jButtonTru)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButtonN8.setText("8");
        jButtonN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN8ActionPerformed(evt);
            }
        });

        jButtonN7.setText("7");
        jButtonN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN7ActionPerformed(evt);
            }
        });

        jButtonN9.setText("9");
        jButtonN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN9ActionPerformed(evt);
            }
        });

        jButtonN5.setText("5");
        jButtonN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN5ActionPerformed(evt);
            }
        });

        jButtonN4.setText("4");
        jButtonN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN4ActionPerformed(evt);
            }
        });

        jButtonN1.setText("1");
        jButtonN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN1ActionPerformed(evt);
            }
        });

        jButtonReset.setText("C");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonN6.setText("6");
        jButtonN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN6ActionPerformed(evt);
            }
        });

        jButtonN2.setText("2");
        jButtonN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN2ActionPerformed(evt);
            }
        });

        jButtonN3.setText("3");
        jButtonN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN3ActionPerformed(evt);
            }
        });

        jButtonN0.setText("0");
        jButtonN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonN0ActionPerformed(evt);
            }
        });

        jButtonEqual.setText("=");
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNumberContainerLayout = new javax.swing.GroupLayout(jPanelNumberContainer);
        jPanelNumberContainer.setLayout(jPanelNumberContainerLayout);
        jPanelNumberContainerLayout.setHorizontalGroup(
            jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumberContainerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonN7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonN4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonN1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNumberContainerLayout.createSequentialGroup()
                        .addComponent(jButtonN0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNumberContainerLayout.createSequentialGroup()
                        .addComponent(jButtonN2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonN3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNumberContainerLayout.createSequentialGroup()
                        .addComponent(jButtonN5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonN6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNumberContainerLayout.createSequentialGroup()
                        .addComponent(jButtonN8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonN9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelNumberContainerLayout.setVerticalGroup(
            jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumberContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonN7)
                    .addComponent(jButtonN8)
                    .addComponent(jButtonN9))
                .addGap(20, 20, 20)
                .addGroup(jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonN4)
                    .addComponent(jButtonN5)
                    .addComponent(jButtonN6))
                .addGap(20, 20, 20)
                .addGroup(jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonN1)
                    .addComponent(jButtonN2)
                    .addComponent(jButtonN3))
                .addGap(20, 20, 20)
                .addGroup(jPanelNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonN0)
                    .addComponent(jButtonEqual))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTextFieldN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldN1ActionPerformed(evt);
            }
        });

        jTextFieldResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderContainerLayout = new javax.swing.GroupLayout(jPanelHeaderContainer);
        jPanelHeaderContainer.setLayout(jPanelHeaderContainerLayout);
        jPanelHeaderContainerLayout.setHorizontalGroup(
            jPanelHeaderContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCalcu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldResults, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelHeaderContainerLayout.setVerticalGroup(
            jPanelHeaderContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderContainerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelHeaderContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCalcu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldResults, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanelHeaderContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanelNumberContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelCalcuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelHeaderContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNumberContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCalcuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN9ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("9");
        checkCalcu("9");

    }//GEN-LAST:event_jButtonN9ActionPerformed

    private void jButtonN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN5ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("5");

        checkCalcu("5");

    }//GEN-LAST:event_jButtonN5ActionPerformed

    private void jButtonN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN1ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("1");

        checkCalcu("1");

    }//GEN-LAST:event_jButtonN1ActionPerformed

    private void jButtonN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN2ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("2");

        checkCalcu("2");
    }//GEN-LAST:event_jButtonN2ActionPerformed

    private void jTextFieldResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultsActionPerformed

    private void jTextFieldN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldN1ActionPerformed

    private void jButtonN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN8ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("8");

        checkCalcu("8");
    }//GEN-LAST:event_jButtonN8ActionPerformed

    private void jButtonN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN7ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("7");

        checkCalcu("7");

    }//GEN-LAST:event_jButtonN7ActionPerformed

    private void jButtonN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN3ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("3");

        checkCalcu("3");
    }//GEN-LAST:event_jButtonN3ActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        myValue = "";
        myValue1 = "";
        jTextFieldCalcu.setText("");
        jTextFieldN1.setText("");
        jTextFieldN2.setText("");
        jTextFieldResults.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN0ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("0");

        checkCalcu("0");
    }//GEN-LAST:event_jButtonN0ActionPerformed

    private void jButtonN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN6ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("6");

        checkCalcu("6");

    }//GEN-LAST:event_jButtonN6ActionPerformed

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        // TODO add your handling code here:
        if (jTextFieldN1.getText().equals("") || jTextFieldN2.getText().equals("") || jTextFieldCalcu.getText().equals("")) {
            JOptionPane.showMessageDialog(panel, "Table 1 or 2 or calcu values have not been entered");

        } else {
            try {
                myCalculation = new Calculation(Double.parseDouble(jTextFieldN1.getText()), Double.parseDouble(jTextFieldN2.getText()));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(panel, "Incorrect data entered");

            }

            if (jTextFieldCalcu.getText().equals("+")) {
                try {
                    jTextFieldResults.setText(myCalculation.summation() + "");

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panel, "Incorrect data entered");

                }
            } else if (jTextFieldCalcu.getText().equals("-")) {
                try {
                    jTextFieldResults.setText(myCalculation.subtraction() + "");

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panel, "Incorrect data entered");

                }
            } else if (jTextFieldCalcu.getText().equals("*")) {
                try {
                    jTextFieldResults.setText(myCalculation.multiplication() + "");

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panel, "Incorrect data entered");

                }
            } else if (jTextFieldCalcu.getText().equals("/")) {
                if (jTextFieldN2.getText().equals("0")) {
                    JOptionPane.showMessageDialog(panel, "Cannot divide zero");
                } else {
                    try {
                        jTextFieldResults.setText(myCalculation.division() + "");

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(panel, "Incorrect data entered");

                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonEqualActionPerformed

    private void jButtonChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChiaActionPerformed
        // TODO add your handling code here:
        jTextFieldCalcu.setText("/");
    }//GEN-LAST:event_jButtonChiaActionPerformed

    private void jButtonNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhanActionPerformed
        // TODO add your handling code here:
        jTextFieldCalcu.setText("*");
    }//GEN-LAST:event_jButtonNhanActionPerformed

    private void jButtonCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCongActionPerformed
        // TODO add your handling code here:
        jTextFieldCalcu.setText("+");

    }//GEN-LAST:event_jButtonCongActionPerformed

    private void jButtonTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTruActionPerformed
        // TODO add your handling code here:
        jTextFieldCalcu.setText("-");

    }//GEN-LAST:event_jButtonTruActionPerformed

    private void jButtonN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonN4ActionPerformed
        // TODO add your handling code here:
        checkCalcuIsCalcultion("4");

        checkCalcu("4");
    }//GEN-LAST:event_jButtonN4ActionPerformed

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
            java.util.logging.Logger.getLogger(MyCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChia;
    private javax.swing.JButton jButtonCong;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonN0;
    private javax.swing.JButton jButtonN1;
    private javax.swing.JButton jButtonN2;
    private javax.swing.JButton jButtonN3;
    private javax.swing.JButton jButtonN4;
    private javax.swing.JButton jButtonN5;
    private javax.swing.JButton jButtonN6;
    private javax.swing.JButton jButtonN7;
    private javax.swing.JButton jButtonN8;
    private javax.swing.JButton jButtonN9;
    private javax.swing.JButton jButtonNhan;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTru;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCalcuContainer;
    private javax.swing.JPanel jPanelHeaderContainer;
    private javax.swing.JPanel jPanelNumberContainer;
    private javax.swing.JTextField jTextFieldCalcu;
    private javax.swing.JTextField jTextFieldN1;
    private javax.swing.JTextField jTextFieldN2;
    private javax.swing.JTextField jTextFieldResults;
    // End of variables declaration//GEN-END:variables
}
