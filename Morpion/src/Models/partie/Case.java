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
public class Case {
    
    
    private int contenu; // 0=vide ; 1=croix ; 2=rond

    public Case() {
        this.contenu = 0;
    }
    
    public Case(int contenu) {
        this.contenu = contenu;
    }

    public int getContenu() {
        return contenu;
    }

    public void setContenu(int contenu) {
        this.contenu = contenu;
    }
    
}
