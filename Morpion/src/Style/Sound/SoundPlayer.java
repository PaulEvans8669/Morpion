/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Style.Sound;

import Style.Font.FontLoader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Paul
 */
public class SoundPlayer {
    
    
    public void playSound (CustomSound customSound){
        try {
            InputStream is = SoundPlayer.class.getResourceAsStream(customSound.toString());
            InputStream bufferedIn = new BufferedInputStream(is);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void playSoundLoop(CustomSound customSound){
        try {
            InputStream is = SoundPlayer.class.getResourceAsStream(customSound.toString());
            InputStream bufferedIn = new BufferedInputStream(is);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
