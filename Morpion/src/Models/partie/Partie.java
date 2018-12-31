/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.partie;

import database.Connexion;

/**
 *
 * @author p1704450
 */
public class Partie {
    private int idPartie;
    private String joueur1;
    private String joueur2;
    private int scoreJoueur1;
    private int scoreJoueur2;
    private Grille grille;
    

    public Partie(String joueur1, String joueur2) { //Cas d'une nouvelle nouvelle partie
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        scoreJoueur1 = 0;
        scoreJoueur2 = 0;
        grille = new Grille();
    }

    public Partie(int idPartie, String joueur1, String joueur2, int scoreJoueur1, int scoreJoueur2) {
        this.idPartie = idPartie;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.scoreJoueur1 = scoreJoueur1;
        this.scoreJoueur2 = scoreJoueur2;
        this.grille = new Grille();
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public int getIdPartie() {
        return idPartie;
    }

    public String getJoueur1() {
        return joueur1;
    }

    public String getJoueur2() {
        return joueur2;
    }

    public int getScoreJoueur1() {
        return scoreJoueur1;
    }

    public int getScoreJoueur2() {
        return scoreJoueur2;
    }

    
    public Grille getGrille() {
        return grille;
    }
    
    public int getGagnant(){
        int valVerif;
        valVerif = grille.verifDiagonaleDescendanteDroite();
        if(valVerif != 0){ return valVerif;}
        valVerif = grille.verifDiagonaleMontanteDroite();
        if(valVerif != 0){ return valVerif;}
        for(int i = 0; i<3 ; i++){
            valVerif = grille.verifLigne(i);
            if(valVerif != 0){ return valVerif;}
            valVerif = grille.verifColonne(i);
            if(valVerif != 0){ return valVerif;}
        }
        return 0;
    }
    
    public void nouvelleManche(String gagnantManchePrec){
        if(gagnantManchePrec.equals(joueur1)){
            scoreJoueur1++;
        }else{
            scoreJoueur2++;
        }
        
        grille = new Grille();
        Connexion co = new Connexion();
        co.nouvelleManche(this);
        
    }
    
    public void nouvelleManche(){
        grille = new Grille();
        Connexion co = new Connexion();
        co.nouvelleManche(this);
    }

    @Override
    public String toString() {
        return "Partie{" + "idPartie=" + idPartie + ", joueur1=" + joueur1 + ", joueur2=" + joueur2 + ", scoreJoueur1=" + scoreJoueur1 + ", scoreJoueur2=" + scoreJoueur2 + ", grille=" + grille + '}';
    }    
    
}
