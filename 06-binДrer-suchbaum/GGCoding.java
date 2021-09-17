import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
public class GGCoding
{
    public static void main( String[] args )
    {

     int[] arr = {2,5,9,11,14,15,10,12,20,18};

     CharacterSearchTree tree = new CharacterSearchTree();

      for(int i = 0 ; i<arr.length ; i++)
      {
        tree.add((char)arr[i]);
      }

      tree.show();


        // File file = new File(args[0]);
        // FileReader fr = null;
        // String s = "";

        // try{
        //      fr = new FileReader(file);
        //      int ch ;
        //      while ((ch = fr.read()) >10 ) { //Backspace sind nicht erlaub
        //        s +=(char)ch;
        //      }
        // }
        // catch(IOException e)
        // {
        //   e.printStackTrace();
        // }

        // CharacterSearchTree hal = new CharacterSearchTree();

        // for (int i= 0;i<s.length() ;i++ ) {
        //   hal.add(s.charAt(i));
        // }
        //  Object obj = 'n';

        // System.out.println(hal.onLevel(obj,hal.heigth()));System.out.println();



        }

    // }
}

