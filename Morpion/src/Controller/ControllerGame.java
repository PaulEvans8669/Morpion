/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.partie.Partie;
import View.Game;
import View.Menu;
import View.Window;
import database.Connexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author p1709400
 */
public class ControllerGame implements ActionListener{

    private Game gameView;
    private int cellId;
    
    public ControllerGame(Game gameView){
        this.gameView = gameView;
    }
    
    public ControllerGame(Game gameView, int cellId){
        this.gameView = gameView;
        this.cellId = cellId;
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
        }else{
            //Bouton de case de jeu
            if(gameView.getListeBoutonsJeu().get(cellId).getText().equals("")){
                int ligne = cellId/3;
                int col = cellId%3;
                Partie partie = gameView.getPartie();
                int numJoueur = partie.getGrille().getNbCasesRemplies()%2+1;
                String nomJoueur = numJoueur == 1 ? partie.getJoueur1() : partie.getJoueur2();
                partie.getGrille().setCase(ligne, col, numJoueur);
                gameView.getListeBoutonsJeu().get(cellId).setText(nomJoueur);
                String nomProchainJoueur = numJoueur == 2 ? partie.getJoueur1() : partie.getJoueur2();
                gameView.setLabelNomJoueurTour(nomProchainJoueur);

                if(partie.getGagnant() != 0){
                    String nomGagnant = partie.getGagnant() == 1 ? partie.getJoueur1() : partie.getJoueur2();
                    JOptionPane.showMessageDialog(null, nomGagnant + " remporte cette manche !");
                    partie.nouvelleManche(nomGagnant);
                    gameView.nouvelleManche(partie);
                }else if(partie.getGrille().grillePleine()){
                    JOptionPane.showMessageDialog(null, "Match nul !");
                    partie.nouvelleManche();
                    gameView.nouvelleManche(partie);
                }
            }
        }
                
    }
    
}
