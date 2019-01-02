/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.partie;

/**
 *
 * @author p1709400
 */
public class Action {
    int posX, posY, valeur;

    public Action(int posY, int posX, int valeur) {
        this.posX = posX;
        this.posY = posY;
        this.valeur = valeur;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Action{" + "posX=" + posX + ", posY=" + posY + ", valeur=" + valeur + '}';
    }
    
    
    
}
