package swingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by H3kuFC on 29/05/2015.
 */
public class MaterialButton extends JButton {

    private Color defaultColor;
    private Color clickColor;

    public MaterialButton(){
        initComponent();
    }

    private void MousePressed(MouseEvent e) {
        this.setBackground(clickColor);
    }

    private void MouseReleased(MouseEvent e) {
        this.setBackground(defaultColor);
    }

    private void initComponent(){
        defaultColor = new Color(151,212,222);
        clickColor = defaultColor.darker();
        this.setBackground(defaultColor);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setBorderPainted(false);
        this.setForeground(Color.WHITE);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                MousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                MouseReleased(e);
            }
        });

        Font ttfReal = null;
        try {
            InputStream is = this.getClass().getResourceAsStream("/resources/MyriadPro-Bold.ttf");
            Font f = Font.createFont(Font.TRUETYPE_FONT, is);
            ttfReal = f.deriveFont(Font.BOLD, 23);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(f);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setFont(ttfReal);

    }


}