/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.partie;

import java.util.ArrayList;

/**
 *
 * @author p1709400
 */
public class Grille {
    
    Case[][] grille;
    ArrayList<Action> listeActions;

    public Grille(){ 
        this.listeActions = new ArrayList();
        this.grille = new Case[3][3]; //[ligne][colonne], [y][x]
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                this.grille[i][j]=new Case();
            }
        }
        
    }

    public Case[][] getGrille() {
        return grille;
    }
    
    public void ajouterAction(Action action){
        listeActions.add(action);
    }

    public void setCase(int ligne, int col, int val) {
        if (col >=0 && col <= 2 && ligne >=0 && ligne <= 2 && val >=0 && val <= 2 ) {
            this.grille[ligne][col].setContenu(val);
        }
    }
    
    public ArrayList<Action> getListeAction(){
        return this.listeActions;
    }
    
    public boolean grillePleine(){
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(this.grille[i][j].getContenu()==0){
                    return false;
                }
            }
        }
        return true;
    }

    public int verifLigne(int ligne){
        int val = this.grille[ligne][0].getContenu();
        for(int j = 0 ; j < 3 ; j++){
            if (this.grille[ligne][j].getContenu()==0 || this.grille[ligne][j].getContenu()!=val) {
                return 0;
            }
        }
        return val;
    }    
    
    public int verifColonne(int col){
        int val = this.grille[0][col].getContenu();
        for(int i = 0 ; i < 3 ; i++){
            if (this.grille[i][col].getContenu()==0 || this.grille[i][col].getContenu()!=val) {
                return 0;
            }
        }
        return val;
    }

    public int verifDiagonaleMontanteDroite(){
        int val = this.grille[2][0].getContenu();
        for(int i = 0 ; i<3;i++){
            if(this.grille[2-i][i].getContenu() == 0 || this.grille[2-i][i].getContenu() != val){
                return 0;
            }
        }
        return val;
    }
    
    public int verifDiagonaleDescendanteDroite(){

        int val = this.grille[0][0].getContenu();
        for(int i = 0 ; i<3;i++){
            if(this.grille[i][i].getContenu() == 0 || this.grille[i][i].getContenu() != val){
                return 0;
            }
        }
        return val;
    }

    @Override
    public String toString() {
        String retour = new String();
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ;j++){
                retour+=this.grille[i][j].getContenu()+" | ";
            }
            retour+="\n";
        }
        return retour;
    }
    
    public Case getCase(int col, int lig){
        return grille[lig][col];
    }  
    
    /*
    Permet de savoir qui doit jouer
    Si le nombre de cases est pair, le joueur 1 joue
    Sinon, le joueur 2 joue.
    */
    public int getNbCasesRemplies(){
        int nb = 0;
        for(int y = 0; y<3 ; y++){
            for(int x = 0; x<3; x++){
                if(grille[y][x].getContenu() != 0){
                    nb++;
                }
            }
        }
        return nb;
    }
    
}
