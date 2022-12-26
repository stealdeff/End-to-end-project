package TXT_with_Decorator;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WritingTest {

    @Test
    void writeData() throws IOException {
        String k="C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TESTING";
        File file = new File(k);
        FileOutputStream fos = new FileOutputStream(file);
         String data="Write that";
        fos.write(data.getBytes(), 0, data.length());
         assertEquals(data,Reading.readData(k));
    }
}