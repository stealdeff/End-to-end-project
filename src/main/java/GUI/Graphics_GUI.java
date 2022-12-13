package GUI;

import JSON.JSON_writing;
import Main_and_Calc.Calculator;
import Main_and_Calc.Console;
import XML.Result_in_XML;
import XML.XML_reading;
import XML.XML_writing;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Graphics_GUI extends Console {
    public static String line;
    public static int  answer;
    public static void txt() throws IOException
    {
        File fin = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\input.txt");
        FileReader fr = new FileReader(fin);
        BufferedReader reader = new BufferedReader(fr);
        try (FileWriter out = new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt")) {
            line = reader.readLine();
            //DataSource plain_output = new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
            while (line != null) {
                answer = Calculator.RPN_to_answer((Calculator.expresionToReverse_poland_notation(line.split("\\s"))));
                out.write("\n");
                out.write(answer + " ");
                line = reader.readLine();
            }
        }
        System.out.println( "TxT was created");
    }
    public static  void XML() {
        XML_reading.main();
        try {
            XML_writing.main();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        Result_in_XML.main();
        System.out.println( "XML was created");
    }
    public static  void JSON()
    {
        JSON_writing.main();
        System.out.println( "JS was created");
    }


}
