package ZIP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Recording_XML {
    public static void main(String[] args) {

        String filename = "C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\XML_input.xml";
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\OUT_XML.zip"));
            FileInputStream fis= new FileInputStream(filename);)
        {

            ZipEntry entry1 = new ZipEntry("XML_input.xml");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();


        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

}
