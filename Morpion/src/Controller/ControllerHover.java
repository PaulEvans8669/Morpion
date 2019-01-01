/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Style.Font.CustomFont;
import Style.Font.FontLoader;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Paul
 */
public class ControllerHover implements MouseListener {

    private Font baseFont;
    private Font hoverFont;

    public ControllerHover(Font baseFont, Font hoverFont) {
        this.baseFont = baseFont;
        this.hoverFont = hoverFont;
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton){
            JButton source = (JButton)e.getSource();
            source.setFont(hoverFont);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() instanceof JButton){
            JButton source = (JButton)e.getSource();
            source.setFont(baseFont);
        }
    }
    
}
