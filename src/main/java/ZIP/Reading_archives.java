package ZIP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
public class Reading_archives {
    public static void main(String[] args) {

        try(ZipInputStream zin = new ZipInputStream(new FileInputStream("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\OUT.zip")))
        {
            ZipEntry entry;
            String name;
            long size;
            while((entry=zin.getNextEntry())!=null){

                name = entry.getName();
                size=entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);
                FileOutputStream fout = new FileOutputStream("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\new" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
