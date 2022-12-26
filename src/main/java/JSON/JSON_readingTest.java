package JSON;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.*;

class JSON_readingTest {

    @Test
    void main() throws IOException {
        JSONObject json = new JSONObject();
        String h="HELLO";
        String file="C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TEST.JSON";
        JSONObject l=json.put("Say hello", h);
        PrintWriter out = new PrintWriter(new FileWriter(file));
        out.write(json.toString());
        assertEquals("{\"Say hello\":\"HELLO\"}", json.toString());
    }
}