/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Style.Sound;

/**
 *
 * @author Paul
 */
public enum CustomSound {
    
    BACKGROUND_MUSIC("/Style/Sound/Sounds/background.wav"),
    HOVER("/Style/Sound/Sounds/hover.wav"),
    CERCLE("/Style/Sound/Sounds/cercle.wav"),
    CROIX("/Style/Sound/Sounds/croix.wav"),
    PAGE("/Style/Sound/Sounds/page.wav");
    
    private String soundFile = "";
    
    CustomSound(String soundFile){
        this.soundFile = soundFile;
    }
    
    public String toString(){
        return soundFile;
    }
}
