package Main_and_Calc;

import GUI.calculator;
import JSON.JSON_writing;
import TXT_with_Decorator.*;
import XML.Result_in_XML;
import XML.XML_reading;
import XML.XML_writing;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.Scanner;

public class Console {
    public static String line;

    public static void main(String[] args) throws IOException, ParserConfigurationException {

        Scanner cin = new Scanner(System.in);
        System.out.println("Введите тип файла, который нужно создать:");
        String answ = cin.next();

        if (answ.trim().equalsIgnoreCase("txt"))
        {
            File fin = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\input.txt");
            FileReader fr = new FileReader(fin);
            BufferedReader reader = new BufferedReader(fr);
            FileWriter out = new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\output.txt");
            DataSourceDecorator encoded_output = new CompressionDecorator(
                    new EncryptionDecorator(
                            new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt")));

             line = reader.readLine();
            DataSource plain_output = new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
            if (line != null) {
                encoded_output.writeData(line);
            }
            out.write("- Input ----------------");

               while (line != null) {
                   int answer = Calculator.RPN_to_answer((Calculator.expressionToReverse_poland_notation(line.split("\\s"))));
                   out.write("\n");
                   out.write(answer + " ");
                   line = reader.readLine();
               }


               out.write("\n");
               out.write("- Decoded --------------");
               out.write("\n");
               out.write(plain_output.readData());
               out.write("\n");
               out.write("- Encoded --------------");
               out.write("\n");
               out.write(encoded_output.readData());
               out.write("\n");
               out.close();


        } else if (answ.trim().equalsIgnoreCase("xml")) {
            XML_reading.main();
            XML_writing.main();
            Result_in_XML.main();
        } else if (answ.trim().equalsIgnoreCase("json") || answ.trim().equalsIgnoreCase("js"))
        {
            JSON_writing.main();

        }
        else{
            System.out.println("Создание таких файлов мы не можем себе позволить.");
        }


    }
}
