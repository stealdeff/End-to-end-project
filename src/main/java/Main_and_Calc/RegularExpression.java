package Main_and_Calc;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class RegularExpression extends Console
{
    public static final Pattern P1 = Pattern.compile(Console.line);
    public static String res;
    private static final Pattern P2 = compile("-?\\d+(?:\\.\\d+(?:E\\d+)?)?(\\s*[-+/\\*]\\s+-?\\d+(?:\\.\\d+(?:E\\d+)?)?)+");
    public static String regular()
    {
      if (P1.equals(P2))
      {

          int k=Calculator.RPN_to_answer(Calculator.expressionToReverse_poland_notation(P1.split("\\s")));
       res=Integer.toString(k);
          return res;
      }

       else{return "Failed";}
    }

}
