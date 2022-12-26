package TXT_with_Decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {
    static public  String filename;
    public  static void writeData(String data)
    {
        File file = new File(filename);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
