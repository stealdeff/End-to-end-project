package Main_and_Calc;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void expressionToReverse_poland_notation() {
        String[]s=new String[1];
            s[0]="3+23";
        String []s2=new String[1];
           s2[0]= "675-345/12";
          String[]s3=new String[1];
         s3[0]="23-467*12+90";
        assertEquals("3 23+",Calculator.expressionToReverse_poland_notation(s));
        assertEquals("675 345 12/-",Calculator.expressionToReverse_poland_notation(s2));
        assertEquals("23 467 12 *-90+",Calculator.expressionToReverse_poland_notation(s3));
    }
    @org.junit.jupiter.api.Test
    public void RPN_to_answer()
    {
    String k="3 23+";
    String h="12 45 789 * - 12 0 + -";
      String l=  "15 5 - 123 *";
    assertEquals(26,Calculator.RPN_to_answer(k));
    assertEquals(-35505,Calculator.RPN_to_answer(h));
    assertEquals(1230,Calculator.RPN_to_answer(l));
    }
    @org.junit.jupiter.api.Test
    public void RPN_to_answer2()
    {
        String k="109 57 6 * -";
        String h="23 467 12 *-90+";
        assertEquals(-233,Calculator.RPN_to_answer(k));
        assertEquals(-5491,Calculator.RPN_to_answer(h));
    }
}