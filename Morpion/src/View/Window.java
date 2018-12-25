/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author p1706110
 */
public final class Window extends JFrame
{
    
    public Window()
    {
        
        init();
        
    }
    
    public void init()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Morpion");
        this.setContentPane(new Menu(this));
        this.setPreferredSize(this.getContentPane().getPreferredSize());
        this.pack();
        
    }
    
}
