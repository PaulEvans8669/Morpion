/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.partie.Action;
import View.Replay;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Paul
 */
public class ControllerReplay implements ActionListener {

    private Replay replay;
    
    public ControllerReplay(Replay replay){
        this.replay = replay;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(replay.getPrevButton())){
            ArrayList<Action> listeActions = replay.getPartie().getGrille().getListeAction();
            if(replay.getIndexAction()>=1){
                replay.setIndexAction(replay.getIndexAction()-1);
                Action action = listeActions.get(replay.getIndexAction());
                int indexCase = action.getPosY()*3 + action.getPosX();
                replay.getGameButtons().get(indexCase).setIcon(null);
            }
        }else if(e.getSource().equals(replay.getNextButton())){
            ArrayList<Action> listeActions = replay.getPartie().getGrille().getListeAction();
            if(replay.getIndexAction()<9 && replay.getIndexAction()<listeActions.size()){
                Action action = listeActions.get(replay.getIndexAction());
                int indexCase = action.getPosY()*3 + action.getPosX();
                int val = action.getValeur();
                if(val == 1){
                    replay.getGameButtons().get(indexCase).setIcon( new ImageIcon(getClass().getResource("/Style/img/cercle.png")));
                }else if (val == 2){
                    replay.getGameButtons().get(indexCase).setIcon( new ImageIcon(getClass().getResource("/Style/img/croix.png")));
                }
                replay.setIndexAction(replay.getIndexAction()+1);
            }
        }
    }
    
}
