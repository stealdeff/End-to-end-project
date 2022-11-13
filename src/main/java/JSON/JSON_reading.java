package JSON;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class JSON_reading
{
        public static String main()
        {
                String path = "input.json";
                String k = null;
                JSONObject json = new JSONObject();
                try {
                        Scanner cin=new Scanner(System.in);
                        System.out.println("Введите арифметическое выражение, которое будет выведено в json файле: ");
                         k=cin.next();
                        json.put("Arithmetical expression",k);
                } catch (JSONException e) {
                        e.printStackTrace();
                }

                try (PrintWriter out = new PrintWriter(new FileWriter("input.json"))) {
                        out.write(json.toString());
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return k;
        }

}