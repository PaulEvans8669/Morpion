/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Style.Font;

/**
 *
 * @author Paul
 */
public enum CustomFont {

    ORIGAMI("/Style/Font/Fonts/origami.ttf"),
    PAPER("/Style/Font/Fonts/paper.ttf"),
    PENCIL("/Style/Font/Fonts/pencil.ttf");
    
    private String fontFile = "";
    
    CustomFont(String fontFileName){
        this.fontFile = fontFileName;
    }
    
    public String toString(){
        return fontFile;
    }
}
