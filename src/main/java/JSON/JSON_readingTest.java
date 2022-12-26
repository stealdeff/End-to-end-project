package JSON;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.*;

class JSON_readingTest {
    public static String h="to them";
    @Test
    void main() throws IOException
    {
        JSONObject json = new JSONObject();
        String file="C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TEST.JSON";
        JSONObject l=json.put("Say hello", h);
        assertEquals("{\"Say hello\":\"to them\"}", json.toString());
    }
}