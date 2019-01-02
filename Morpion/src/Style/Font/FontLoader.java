/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Style.Font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class FontLoader {
    
    public Font loadFont(CustomFont customFont, float fontSize){
        try {
            InputStream is = FontLoader.class.getResourceAsStream(customFont.toString());
            Font font = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(fontSize);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(FontLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
