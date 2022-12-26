package TXT_with_Decorator;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadingTest {

    @Test
    void readData() throws IOException {
        char[] buffer = null;
        String k="C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TESTING";
        File file=new File(k);
        FileReader reader = new FileReader(file);
        buffer = new char[(int) file.length()];
        reader.read(buffer);
   assertEquals("Hello",Reading.readData(k));
    }

}
