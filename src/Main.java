import java.io.*;
import java.io.FileReader;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)throws IOException
    {
        File fin = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\input.txt");
        FileReader fr = new FileReader(fin);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter out=new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
        String line = reader.readLine();
        //String []l = line.split("\\s");
        while (line != null)
        {
            out.write(String.valueOf(Calculator.RPN_to_answer((Calculator.expresionToReverse_poland_notation(line.split("\\s")))))+" ");
            line = reader.readLine();
        }


        out.close();
    }
}