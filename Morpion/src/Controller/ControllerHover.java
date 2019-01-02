/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Style.Font.CustomFont;
import Style.Font.FontLoader;
import Style.Sound.CustomSound;
import Style.Sound.SoundPlayer;
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
    private SoundPlayer soundPlayer;

    public ControllerHover(Font baseFont, Font hoverFont) {
        soundPlayer = new SoundPlayer();
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
            soundPlayer.playSound(CustomSound.HOVER);
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
