

package SearchingUI;

import java.io.File;


public class FileFilter extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File f) {
     
    return f.isDirectory();
    }

    @Override
    public String getDescription() {
        return "All Files";
    }

}
