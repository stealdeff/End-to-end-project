package Main_and_Calc;

import java.io.*;
import java.util.Scanner;

public class Check_parser {
    //public static String line;
public static void main(String[] args) throws IOException {
    Scanner cin=new Scanner(System.in);
    System.out.println("Введите тип файла, который нужно создать:");
    String answ = cin.next();
    if (answ.trim().equalsIgnoreCase("txt")) {
        File fin = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\input.txt");
        FileReader fr = new FileReader(fin);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter out = new FileWriter("output.txt");
        String line;
        line = reader.readLine();
      //String[] formulas = new String[]{"2+2*2", "2+X*2", "sin(90)+4-cos(0)", "2--4", "2**3*5-----7", "3.5.6-2"};
           Parser p=new Parser();
           try {
               double answer = p.Parse(line);
               out.write(String.valueOf(answer));
               System.out.println(String.valueOf(answer));
           }
           catch (Exception e)
           {
               System.err.println( "Error while parsing");
           }
          // line= reader.readLine();
       }

}
}
