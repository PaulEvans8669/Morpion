/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

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
        
        InitFrame IF = new InitFrame();
        IF.setVisible(true);
        Connexion co = new Connexion();
        IF.dispose();
        Window window = new Window();
        window.setVisible(true);
        
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
        } catch (SQLException ex) {
            Logger.getLogger(Morpion.class.getName()).log(Level.SEVERE, null, ex);
        }
            /*
            Connexion connexion = new Connexion();
          
            
            Partie partie2 = new Partie("Quentin", "Imaddex");
            
            connexion.sauvegarderPartie(partie2);
            
            
            System.out.println(connexion.sauvegarderPartie(partie2));
            */
            
    }
    
}
