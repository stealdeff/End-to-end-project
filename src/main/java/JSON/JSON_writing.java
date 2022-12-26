package JSON;

import Main_and_Calc.Console;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;

public class JSON_writing extends Console
{
    public static Object main()
    {
        String path = "output.json";
        JSONObject json2 = new JSONObject();
        try {
        JSON_reading.main();
        int res=JSON_reading.res;
            json2.put("Answer",String.valueOf(res));
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
