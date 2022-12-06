package TXT_with_Decorator;

import java.io.*;

public class Reading
{

    public  String readData(String filename) throws FileNotFoundException
    {
        char[] buffer = null;
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}