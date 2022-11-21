package Main_and_Calc;
import java.util.regex.Pattern;
public class RegularExpression extends Main
{
    public static final Pattern P1 = Pattern.compile(Main.line);
    public static String res;
    private static final Pattern P2 = Pattern.compile("-?\\d+(?:\\.\\d+(?:E\\d+)?)?(\\s*[-+/\\*]\\s+-?\\d+(?:\\.\\d+(?:E\\d+)?)?)+");
    public static String regular()
    {
        String e="Введено не арифметическое выражение";
      if (P1.equals(P2))
      {

          int k=Calculator.RPN_to_answer(Calculator.expresionToReverse_poland_notation(P1.split("\\s")));
       res=Integer.toString(k);
      }
      else{return e;}
return res;
    }

}
