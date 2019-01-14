/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Style.Sound.CustomSound;
import Style.Sound.SoundPlayer;
import View.LoadGame;
import View.Menu;
import View.NewGame;
import View.Stats;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author P1704450
 */
public class ControllerMenu implements ActionListener{
    
    private Menu menuWindow;
    private SoundPlayer soundPlayer;
    
    public ControllerMenu(Menu menuWindow){
        this.menuWindow = menuWindow;
        soundPlayer = new SoundPlayer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(menuWindow.getBoutonJouer())){
            soundPlayer.playSound(CustomSound.PAGE);
            menuWindow.getParentWindow().setContentPane(new NewGame(menuWindow.getParentWindow()));
            menuWindow.getParentWindow().pack();
        }else if(e.getSource().equals(menuWindow.getBoutonCharger())){        
            soundPlayer.playSound(CustomSound.PAGE);
            menuWindow.getParentWindow().setContentPane(new LoadGame(menuWindow.getParentWindow()));
            menuWindow.getParentWindow().pack();
        }else if(e.getSource().equals(menuWindow.getBoutonStats())){    
            soundPlayer.playSound(CustomSound.PAGE);
            menuWindow.getParentWindow().setContentPane(new Stats(menuWindow.getParentWindow()));
            menuWindow.getParentWindow().pack();
        }else if(e.getSource().equals(menuWindow.getBoutonQuitter())){
            System.exit(0);
        }
    }
    
    
    
}
