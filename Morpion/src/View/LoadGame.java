/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerHover;
import Controller.ControllerLoadGame;
import Style.Font.CustomFont;
import Style.Font.FontLoader;
import database.Connexion;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

/**
 *
 * @author p1706110
 */
public class LoadGame extends javax.swing.JPanel
{

    private HashMap<Integer,String> listeParties;
    private Window win;
    private Font origami24;
    private Font pencil32;
    private Font pencil42;
    
    /**
     * Creates new form loadGame
     * @param win
     */
    public LoadGame(Window win)
    {
        origami24 = new FontLoader().loadFont(CustomFont.ORIGAMI, 22);
        pencil32 = new FontLoader().loadFont(CustomFont.PENCIL, 22);
        pencil42 = new FontLoader().loadFont(CustomFont.PENCIL, 28);
        this.win = win;
        initComponents();
        this.loadGames();
        this.jButton3.addActionListener(new ControllerLoadGame(this, listeParties));
        this.jButton2.addActionListener(new ControllerLoadGame(this, listeParties));
        this.jButton3.addMouseListener(new ControllerHover(pencil32,pencil42));
        this.jButton2.addMouseListener(new ControllerHover(pencil32,pencil42));
    }

    public Window getWin() {
        return win;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }
    
    
    
    public void loadGames(){
        Connexion co = new Connexion();
        listeParties = new HashMap();
        listeParties = co.getListeParties();
        DefaultListModel model = new DefaultListModel();
        for(String nom : listeParties.values()){
            model.addElement(nom);
        }
        this.jList1.setModel(model);
    }

    public JList<String> getjList1() {
        return jList1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(origami24);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Charger une partie");
        add(jLabel1);
        jLabel1.setBounds(110, 60, 290, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Style/img/retour.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 60, 71, 38);

        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 120, 365, 160);

        jButton2.setFont(pencil32);
        jButton2.setText("Effacer X");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        add(jButton2);
        jButton2.setBounds(30, 310, 210, 22);

        jButton3.setFont(pencil32);
        jButton3.setText("Jouer la partie");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        add(jButton3);
        jButton3.setBounds(260, 310, 210, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Style/img/papier.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        win.setContentPane(new Menu(win));
        win.pack();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}