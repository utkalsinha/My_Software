
package SearchingUI;


import javax.swing.*;
import java.awt.*;
import java.io.File;

public class prev {

     ImageIcon thumbnail = null;
     File file = null;

      public ImageIcon loadImage(File file) {
        if (file == null) {
            thumbnail = null;
            return null;
        }
        else
        {

        ImageIcon tmpIcon = new ImageIcon(file.getPath());
        if (tmpIcon != null) {
            if (tmpIcon.getIconWidth() >250) {
                thumbnail = new ImageIcon(tmpIcon.getImage().
                                          getScaledInstance(250, -1,
                                                      Image.SCALE_DEFAULT));
                return thumbnail;
            } else { //no need to miniaturize
                thumbnail = tmpIcon;
                return thumbnail;
            }

        }
        return thumbnail;
      }
    }




}




