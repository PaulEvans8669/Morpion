/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.partie.Action;
import Models.partie.Partie;
import Style.Sound.CustomSound;
import Style.Sound.SoundPlayer;
import View.Game;
import View.Menu;
import View.Replay;
import View.Window;
import database.Connexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.IconUIResource;

/**
 *
 * @author p1709400
 */
public class ControllerGame implements ActionListener{

    private Game gameView;
    private int cellId;
    private SoundPlayer soundPlayer;
    
    public ControllerGame(Game gameView){
        soundPlayer = new SoundPlayer();
        this.gameView = gameView;
    }
    
    public ControllerGame(Game gameView, int cellId){
        soundPlayer = new SoundPlayer();
        this.gameView = gameView;
        this.cellId = cellId;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(gameView.getjButton4())){
            //Bouton Save
            Thread t = new Thread(new Runnable(){
                public void run(){
                    Connexion co = new Connexion();
                    boolean success = co.sauvegarderPartie(gameView.getPartie());
                    if(success){
                        JOptionPane.showMessageDialog(null, "Partie sauvegardée avec succès!");
                    }
                }
            });
            t.start();
        }else if(e.getSource().equals(gameView.getjButton3())){
            //Bouton Quitter
            soundPlayer.playSound(CustomSound.PAGE);
            Window win = gameView.getWin();
            win.setContentPane(new Menu(win));
            win.pack();
            Window replayWindow = gameView.getWindowReplay();
            if(replayWindow != null){
                replayWindow.dispose();
                gameView.setWindowReplay(null);
            }
        }else if(e.getSource().equals(gameView.getjButton2())){
            //Bouton replay
            if(gameView.getWindowReplay() == null){
                soundPlayer.playSound(CustomSound.PAGE);
                Window replayWindow = new Window();
                replayWindow = new Window();
                replayWindow.setContentPane(new Replay(gameView.getPartie()));
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((dimension.getWidth() + replayWindow.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - replayWindow.getHeight()) / 2);
                replayWindow.setLocation(x, y);
                replayWindow.setSize(328,400);
                replayWindow.setVisible(true);
                gameView.setWindowReplay(replayWindow);
            }
        }else{
            //Bouton de case de jeu
            int ligne = cellId/3;
            int col = cellId%3;
            if(gameView.getPartie().getGrille().getCase(col, ligne).getContenu()==0){
                Partie partie = gameView.getPartie();
                int numJoueur = partie.getGrille().getNbCasesRemplies()%2+1;
                partie.getGrille().setCase(ligne, col, numJoueur);
                partie.getGrille().ajouterAction(new Action(ligne, col, numJoueur));
                if(numJoueur == 1){
                    gameView.getListeBoutonsJeu().get(cellId).setIcon( new ImageIcon(getClass().getResource("/Style/img/cercle.png")));
                    soundPlayer.playSound(CustomSound.CERCLE);
                }else{
                    gameView.getListeBoutonsJeu().get(cellId).setIcon( new ImageIcon(getClass().getResource("/Style/img/croix.png")));
                    soundPlayer.playSound(CustomSound.CROIX);
                }
                String nomProchainJoueur = numJoueur == 2 ? partie.getJoueur1() : partie.getJoueur2();
                gameView.setLabelNomJoueurTour(nomProchainJoueur);

                if(partie.getGagnant() != 0){
                    String nomGagnant = partie.getGagnant() == 1 ? partie.getJoueur1() : partie.getJoueur2();
                    JOptionPane.showMessageDialog(null, nomGagnant + " remporte cette manche !");
                    partie.nouvelleManche(nomGagnant);
                    gameView.nouvelleManche(partie);
                    Window replayWindow = gameView.getWindowReplay();
                    if(replayWindow != null){
                        replayWindow.dispose();
                        gameView.setWindowReplay(null);
                    }
                    Thread t = new Thread(new Runnable(){
                        public void run(){
                            Connexion co = new Connexion();
                            co.sauvegarderPartie(gameView.getPartie());
                        }
                    });
                    t.start();
                }else if(partie.getGrille().grillePleine()){
                    JOptionPane.showMessageDialog(null, "Match nul !");
                    partie.nouvelleManche();
                    gameView.nouvelleManche(partie);
                    Window replayWindow = gameView.getWindowReplay();
                    if(replayWindow != null){
                        replayWindow.dispose();
                        gameView.setWindowReplay(null);
                    }
                    Thread t = new Thread(new Runnable(){
                        public void run(){
                            Connexion co = new Connexion();
                            co.sauvegarderPartie(gameView.getPartie());
                        }
                    });
                    t.start();
                }
            }
        }
                
    }    
}
