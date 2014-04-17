

package SearchingUI;

import java.io.File;


public class EditingFunctions {

      public boolean  delete(String path)
      {
          try
          {
              new File(path).delete();

         return true;
          }catch(Exception e)
          {
              return false;
          }
      }

      public File  cut(String Path)
      {
          try
          {
             File newFile = new File(Path);
              return newFile;
          }catch(Exception e)
          {

              return null;
          }
      }

      
}
