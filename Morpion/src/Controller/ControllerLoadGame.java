/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Game;
import View.LoadGame;
import View.Window;
import database.Connexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import Models.partie.Partie;

/**
 *
 * @author p1709400
 */
public class ControllerLoadGame implements ActionListener{

    private HashMap<Integer,String> listeParties;
    private LoadGame loadGameView;
    
    public ControllerLoadGame(LoadGame loadGame, HashMap<Integer,String> listeParties) {
        this.loadGameView = loadGame;
        this.listeParties = listeParties;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(loadGameView.getjButton3())){
            //Jouer partie
            String nomPartie = loadGameView.getjList1().getSelectedValue();
            int key = getKeyFromValue(nomPartie);
            if(key != -1){
                Connexion co = new Connexion();
                Partie partie = co.chargerPartie(key);
                Window win = loadGameView.getWin();
                win.setContentPane(new Game(win,partie));
                win.pack();
            }
        }else 
        if(e.getSource().equals(loadGameView.getjButton2())){
            //Supprimer enregistrement
            String nomPartie = loadGameView.getjList1().getSelectedValue();
            int key = getKeyFromValue(nomPartie);
            if(key != -1){
                Connexion co = new Connexion();
                co.supprimerPartie(key);
                loadGameView.loadGames();
            }
        }
        
    }
    
    private int getKeyFromValue(String value){
        for(int key : listeParties.keySet()){
            if(listeParties.get(key).equals(value)){
                return key;
            }
        }
        return -1;
    }
    
}
