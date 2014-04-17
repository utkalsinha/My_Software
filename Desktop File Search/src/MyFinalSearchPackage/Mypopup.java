
package MyFinalSearchPackage;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;


public class Mypopup extends MouseAdapter {
    
        JPopupMenu popup;
    public Mypopup(JPopupMenu popupmenu) {
        popup = popupmenu;
        
        }

    @Override
     public void mousePressed(MouseEvent e) {
           
            maybeShowPopup(e);
       
        }

        @Override
        public void mouseReleased(MouseEvent e) {

            maybeShowPopup(e);
        }

        private void maybeShowPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                
                popup.show(e.getComponent(),
                           e.getX(), e.getY());
            }
        }



}
