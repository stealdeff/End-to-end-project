package JSON;

import Main_and_Calc.Calculator;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class JSON_reading
{
        public static int res;
        public static void main() {
                JSONObject json = new JSONObject();
                try {

                        Scanner cin = new Scanner(System.in);
                        System.out.println("Введите арифметическое выражение, которое будет выведено в json файле: ");
                        String k = cin.next();
                        res = Calculator.RPN_to_answer(Calculator.expressionToReverse_poland_notation(k.split("\\s")));
                        JSONObject l=json.put("Arithmetical expression", k);
                } catch (JSONException e) {
                        e.printStackTrace();
                }

                try (PrintWriter out = new PrintWriter(new FileWriter("input.json"))) {
                        out.write(json.toString());
                } catch (Exception e) {
                        e.printStackTrace();
                }

        }


}