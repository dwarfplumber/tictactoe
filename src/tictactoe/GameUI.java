/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author davidryley
 */
public class GameUI extends javax.swing.JFrame {

    /**
     * Creates new form GameUI
     */
    
    private Game game;
    private final String [] symbols = { "", "X", "O" };
    private ArrayList<JToggleButton> activeButtons;
    
    public GameUI() {
        initComponents();
        activeButtons = new ArrayList<JToggleButton>();
    }
    
    public void setGame(Game game)
    {
        this.game = game;
        activeButtons.add(row1Column1Toggle);
        activeButtons.add(row1Column2Toggle);
        activeButtons.add(row1Column3Toggle);
        activeButtons.add(row2Column1Toggle);
        activeButtons.add(row2Column2Toggle);
        activeButtons.add(row2Column3Toggle);
        activeButtons.add(row3Column1Toggle);
        activeButtons.add(row3Column2Toggle);
        activeButtons.add(row3Column3Toggle);
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
        row1Column1Toggle = new javax.swing.JToggleButton();
        row1Column2Toggle = new javax.swing.JToggleButton();
        row1Column3Toggle = new javax.swing.JToggleButton();
        row2Column1Toggle = new javax.swing.JToggleButton();
        row2Column2Toggle = new javax.swing.JToggleButton();
        row2Column3Toggle = new javax.swing.JToggleButton();
        row3Column1Toggle = new javax.swing.JToggleButton();
        row3Column2Toggle = new javax.swing.JToggleButton();
        row3Column3Toggle = new javax.swing.JToggleButton();
        notification = new javax.swing.JLabel();
        resignButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        row1Column1Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row1Column1ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row1Column1Toggle);

        row1Column2Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row1Column2ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row1Column2Toggle);

        row1Column3Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row1Column3ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row1Column3Toggle);

        row2Column1Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row2Column1ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row2Column1Toggle);

        row2Column2Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row2Column2ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row2Column2Toggle);

        row2Column3Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row2Column3ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row2Column3Toggle);

        row3Column1Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row3Column1ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row3Column1Toggle);

        row3Column2Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row3Column2ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row3Column2Toggle);

        row3Column3Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                row3Column3ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(row3Column3Toggle);

        notification.setText("Waiting for Player 2");

        resignButton.setText("Resign");
        resignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resignButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(notification)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resignButton)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(notification)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(resignButton)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void row1Column1ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row1Column1ToggleActionPerformed
        // TODO add your handling code here:
        row1Column1Toggle.setText(symbols[game.makeMove(0)]);
        row1Column1Toggle.setEnabled(false);
        activeButtons.remove(row1Column1Toggle);
    }//GEN-LAST:event_row1Column1ToggleActionPerformed

    private void resignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resignButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resignButtonActionPerformed

    private void row1Column3ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row1Column3ToggleActionPerformed
        // TODO add your handling code here:
        row1Column3Toggle.setText(symbols[game.makeMove(2)]);
        row1Column3Toggle.setEnabled(false);
        activeButtons.remove(row1Column3Toggle);
    }//GEN-LAST:event_row1Column3ToggleActionPerformed

    private void row1Column2ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row1Column2ToggleActionPerformed
        // TODO add your handling code here:
        row1Column2Toggle.setText(symbols[game.makeMove(1)]);
        row1Column2Toggle.setEnabled(false);
        activeButtons.remove(row1Column2Toggle);
    }//GEN-LAST:event_row1Column2ToggleActionPerformed

    private void row2Column1ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row2Column1ToggleActionPerformed
        // TODO add your handling code here:
        row2Column1Toggle.setText(symbols[game.makeMove(3)]);
        row2Column1Toggle.setEnabled(false);
        activeButtons.remove(row2Column1Toggle);
    }//GEN-LAST:event_row2Column1ToggleActionPerformed

    private void row2Column2ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row2Column2ToggleActionPerformed
        // TODO add your handling code here:
        row2Column2Toggle.setText(symbols[game.makeMove(4)]);
        row2Column2Toggle.setEnabled(false);
        activeButtons.remove(row2Column2Toggle);
    }//GEN-LAST:event_row2Column2ToggleActionPerformed

    private void row2Column3ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row2Column3ToggleActionPerformed
        // TODO add your handling code here:
        row2Column3Toggle.setText(symbols[game.makeMove(5)]);
        row2Column3Toggle.setEnabled(false);
        activeButtons.remove(row2Column3Toggle);
    }//GEN-LAST:event_row2Column3ToggleActionPerformed

    private void row3Column1ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row3Column1ToggleActionPerformed
        // TODO add your handling code here:
        row3Column1Toggle.setText(symbols[game.makeMove(6)]);
        row3Column1Toggle.setEnabled(false);
        activeButtons.remove(row3Column1Toggle);
    }//GEN-LAST:event_row3Column1ToggleActionPerformed

    private void row3Column2ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row3Column2ToggleActionPerformed
        // TODO add your handling code here:
        row3Column2Toggle.setText(symbols[game.makeMove(7)]);
        row3Column2Toggle.setEnabled(false);
        activeButtons.remove(row3Column2Toggle);
    }//GEN-LAST:event_row3Column2ToggleActionPerformed

    private void row3Column3ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_row3Column3ToggleActionPerformed
        // TODO add your handling code here:
        row3Column3Toggle.setText(symbols[game.makeMove(8)]);
        row3Column3Toggle.setEnabled(false);
        activeButtons.remove(row3Column3Toggle);
    }//GEN-LAST:event_row3Column3ToggleActionPerformed

    public void setBoardEnabled(boolean value)
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notification;
    private javax.swing.JButton resignButton;
    private javax.swing.JToggleButton row1Column1Toggle;
    private javax.swing.JToggleButton row1Column2Toggle;
    private javax.swing.JToggleButton row1Column3Toggle;
    private javax.swing.JToggleButton row2Column1Toggle;
    private javax.swing.JToggleButton row2Column2Toggle;
    private javax.swing.JToggleButton row2Column3Toggle;
    private javax.swing.JToggleButton row3Column1Toggle;
    private javax.swing.JToggleButton row3Column2Toggle;
    private javax.swing.JToggleButton row3Column3Toggle;
    // End of variables declaration//GEN-END:variables
}
