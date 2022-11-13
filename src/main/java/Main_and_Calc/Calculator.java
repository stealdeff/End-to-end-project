package Main_and_Calc;

import  java.util.Stack;
public class Calculator
{
    public static String expresionToReverse_poland_notation(String []expr)
    {
        String current = "";
        Stack<Character> stack = new Stack<>();
        int prioraty, index ;
        for(index=0;index<expr.length;index++)
        {
            for (int i = 0; i < expr[index].length(); i++) {
                prioraty = getprioraty(expr[index].charAt(i));
                if (prioraty == 0) {
                    current += expr[index].charAt(i);
                }
                if (prioraty == 1) {
                    stack.push(expr[index].charAt(i));
                }
                if (prioraty > 1) {
                    current += ' ';
                    while (!stack.empty()) {
                        if (getprioraty(stack.peek()) >= prioraty) current += stack.pop();
                        else break;
                    }
                    stack.push(expr[index].charAt(i));
                }
                if (prioraty == -1) {
                    current += ' ';
                    while (getprioraty(stack.peek()) != 1) current += stack.pop();
                    stack.pop();
                }

            }
        }
        while (!stack.empty()) current += stack.pop();

        return current;
    }
    public static int RPN_to_answer(String rpn)
    {
        String operand=new String();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<rpn.length();i++)
        {
            if(rpn.charAt(i)== ' ')
                continue;
            if(getprioraty(rpn.charAt(i))==0)
            {
                while(rpn.charAt(i)!=' ' && getprioraty(rpn.charAt(i))==0)
                {
                    operand+=rpn.charAt(i++);
                    if(i==rpn.length())break;
                }

                stack.push(Integer.parseInt(operand));
                operand =new String();
            }

            if(getprioraty(rpn.charAt(i))>1)
            {
                int a=stack.pop();
                int b=stack.pop();
                if(rpn.charAt(i)=='+') stack.push(b+a);
                if(rpn.charAt(i)=='-') stack.push(b-a);
                if(rpn.charAt(i)=='*') stack.push(b*a);
                if(rpn.charAt(i)=='/') stack.push(b/a);

            }
        }
        return stack.pop();
    }
    private static int getprioraty(char token)
    {
        if(token == '*'||token == '/')     {return 3;}
        else if(token == '+'||token == '-'){return 2;}
        else if(token == '(')              {return 1;}
        else if(token == ')')              {return -1;}
        else return 0;

    }

}