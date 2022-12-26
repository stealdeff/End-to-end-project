package JSON;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.*;

class JSON_writingTest {

    @Test
    void main1() throws IOException {
        String path="C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TEST.JSON";
        JSONObject json2 = new JSONObject();
        json2.put("Thanks",JSON_readingTest.h);
        assertEquals("{\"Thanks\":\"to them\"}",json2.toString());
    }

}