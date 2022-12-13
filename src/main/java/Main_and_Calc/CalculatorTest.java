package Main_and_Calc;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void expressionToReverse_poland_notation() {
        String[]s=new String[1];
            s[0]="3+23";
        String []s2=new String[1];
           s2[0]= "675-345/12";

        assertEquals("3 23+",Calculator.expressionToReverse_poland_notation(s));
        assertEquals("675 345 12/-",Calculator.expressionToReverse_poland_notation(s2));
    }
    @org.junit.jupiter.api.Test
    public void RPN_to_answer()
    {
    String k="3 23+";
    String h="12 45 789 * - 12 0 + -";
    assertEquals(26,Calculator.RPN_to_answer(k));
        assertEquals(-35505,Calculator.RPN_to_answer(h));
    }

}