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
import Style.Sound.CustomSound;
import Style.Sound.SoundPlayer;
import javax.swing.JOptionPane;

/**
 *
 * @author p1709400
 */
public class ControllerNewGame implements ActionListener{

    private NewGame game;
    private SoundPlayer soundPlayer;
    
    public ControllerNewGame(NewGame game) {
        soundPlayer = new SoundPlayer();
        this.game = game;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.game.verifNoms()){
            soundPlayer.playSound(CustomSound.PAGE);
            Partie partie = new Partie(this.game.getjTextField1(), this.game.getjTextField2());
            Thread t = new Thread(new Runnable(){
                public void run(){
                    Connexion co = new Connexion();
                    co.sauvegarderPartie(partie);
                }
            });
            t.start();
            Window win = this.game.getWin();
            win.setContentPane(new Game(win,partie));
            win.pack();
        }else{
            JOptionPane.showMessageDialog(null, "Veuillez rentrer un nom par joueur");
        }
    }
    
}
