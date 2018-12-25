/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Game;
import View.Menu;
import View.Window;
import database.Connexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author p1709400
 */
public class ControllerGame implements ActionListener{

    private Game gameView;
    
    public ControllerGame(Game gameView){
        this.gameView = gameView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(gameView.getjButton2())){
            //Bouton Save
            Connexion co = new Connexion();
            co.sauvegarderPartie(gameView.getPartie());
        }else if(e.getSource().equals(gameView.getjButton3())){
            //Bouton Quitter
            Window win = gameView.getWin();
            win.setContentPane(new Menu(win));
            win.pack();
        }
                
    }
    
}
