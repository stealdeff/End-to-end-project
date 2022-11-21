package Main_and_Calc;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.testng.AssertJUnit;

public class Parser {
    private AssertJUnit Assertions;
public static String k;
    public String givenSimpleExpression_whenCallEvaluateMethod_thenSuccess() {
        String r;
        Expression expression = new ExpressionBuilder(k).build();
        double result = expression.evaluate();
        r = Integer.toString((int) result);
        return r;
    }
}
