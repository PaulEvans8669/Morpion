/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import Style.Sound.CustomSound;
import Style.Sound.SoundPlayer;
import View.InitFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import database.Connexion;
import java.sql.DriverManager;
import View.Window;

/**
 *
 * @author p1706110
 */
public class Morpion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
        } catch (SQLException ex) {
            Logger.getLogger(Morpion.class.getName()).log(Level.SEVERE, null, ex);
        }
        InitFrame IF = new InitFrame();
        IF.setVisible(true);
        Connexion co = new Connexion();
        IF.dispose();
        Window window = new Window();
        window.setVisible(true);
        SoundPlayer sp = new SoundPlayer();
        sp.playSoundLoop(CustomSound.BACKGROUND_MUSIC);
            
    }
    
}
