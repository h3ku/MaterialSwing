package swingComponents;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by H3kuFC on 19/06/2015.
 */
public class MaterialTextField extends JTextField {

    private String ghostText;

    public MaterialTextField(){


        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtFocusGained();
            }
            @Override
            public void focusLost(FocusEvent e) {
                txtFocusLost();
            }
        });

        Border border = BorderFactory.createLineBorder(new Color(113,160,168));
        this.setBorder(border);
    }

    public void setGhostText(String ghostText){
        this.ghostText = ghostText;
        this.setText(ghostText);
        this.setForeground(new Color(133,133,133));
    }

    private void txtFocusGained() {
        if (this.getText().equals(ghostText)){
            this.setText("");
        }
        this.setForeground(Color.black);

        Border border = BorderFactory.createLineBorder(new Color(151,212,222));
        this.setBorder(border);
    }

    private void txtFocusLost() {
        if (this.getText().equals("")){
            this.setText(ghostText);
            this.setForeground(new Color(133,133,133));
        }
        Border border = BorderFactory.createLineBorder(new Color(113,160,168));
        this.setBorder(border);
    }


}
