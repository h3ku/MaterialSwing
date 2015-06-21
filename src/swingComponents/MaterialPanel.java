package swingComponents;

import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.border.DropShadowBorder;

import java.awt.*;

/**
 * Created by H3kuFC on 05/06/2015.
 */
public class MaterialPanel extends JXPanel {

    public void setShadow(boolean accion){
        if (accion){
            DropShadowBorder shadow = new DropShadowBorder();
            shadow.setShadowColor(Color.BLACK);
            shadow.setShowLeftShadow(true);
            shadow.setShowRightShadow(true);
            shadow.setShowBottomShadow(true);
            shadow.setShowTopShadow(true);
            this.setBorder(shadow);
        }else {
            this.setBorder(null);
        }
    }

}
