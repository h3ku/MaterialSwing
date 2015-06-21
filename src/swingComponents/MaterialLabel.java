package swingComponents;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by H3kuFC on 19/06/2015.
 */
public class MaterialLabel extends JLabel {
    public MaterialLabel(){


        Font ttfRegular = null;
        try {
            InputStream is = this.getClass().getResourceAsStream("/resources/MyriadPro-Regular.ttf");
            Font f = Font.createFont(Font.TRUETYPE_FONT, is);
            ttfRegular = f.deriveFont(Font.PLAIN, 14);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(f);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setFont(ttfRegular);
    }
}
