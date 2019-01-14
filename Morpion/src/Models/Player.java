/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author P1704450
 */
public class Player {
    private String name;
    private int nbParties;
    private int nbManchesTot;
    private int nbManchesGag;

    public Player(String name) {
        this.name = name;
        nbParties = 0;
        nbManchesTot = 0;
        nbManchesGag = 0;
    }

    public String getName() {
        return name;
    }

    public int getNbParties() {
        return nbParties;
    }

    public int getNbManchesTot() {
        return nbManchesTot;
    }

    public int getNbManchesGag() {
        return nbManchesGag;
    }

    public void setNbParties(int nbParties) {
        this.nbParties = nbParties;
    }

    public void setNbManchesTot(int nbPartiesTot) {
        this.nbManchesTot = nbPartiesTot;
    }

    public void setNbManchesGag(int nbPartiesGag) {
        this.nbManchesGag = nbPartiesGag;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", nbParties=" + nbParties + ", nbManchesTot=" + nbManchesTot + ", nbManchesGag=" + nbManchesGag + '}';
    }
    
    
    
    
}
