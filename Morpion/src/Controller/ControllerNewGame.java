/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Game;
import View.NewGame;
import View.Window;
import database.Connexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Models.partie.Partie;

/**
 *
 * @author p1709400
 */
public class ControllerNewGame implements ActionListener{

    private NewGame game;
    
    public ControllerNewGame(NewGame game) {
        this.game = game;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.game.verifNoms()){
            Partie partie = new Partie(this.game.getjTextField1(), this.game.getjTextField2());
            Connexion co = new Connexion();
            co.sauvegarderPartie(partie);
            Window win = this.game.getWin();
            win.setContentPane(new Game(win,partie));
            win.pack();
        }
    }
    
}
