/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
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
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Morpion");
        this.setContentPane(new Menu(this));
        this.setPreferredSize(this.getContentPane().getPreferredSize());
        this.setResizable(false);
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - 500) / 2);
        int y = (int) ((dimension.getHeight() - 400) / 2);
        this.setLocation(x, y);
        
        this.pack();
        
    }
    
}
