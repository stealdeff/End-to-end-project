package JSON;

import Main_and_Calc.Calculator;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;

public class JSON_writing
{
    public static void main(String[] args)
    {
        String path = "output.json";
        JSONObject json2 = new JSONObject();
        try {
            String k=JSON_reading.main();
            int res= Calculator.RPN_to_answer(Calculator.expresionToReverse_poland_notation(k.split("\\s")));
            String r=String.valueOf(res);
        json2.put("Answer",r);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
