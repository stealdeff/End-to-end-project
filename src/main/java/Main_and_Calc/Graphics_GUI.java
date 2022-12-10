package Main_and_Calc;

import JSON.JSON_writing;
import TXT_with_Decorator.*;
import XML.Result_in_XML;
import XML.XML_reading;
import XML.XML_writing;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Graphics_GUI {
    public static String line;
    public static void txt() throws IOException
    {
        File fin = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\input.txt");
        FileReader fr = new FileReader(fin);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter out = new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
        DataSourceDecorator encoded_output = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt")));
        line = reader.readLine();
        DataSource plain_output = new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
        while (line != null) {
            int answer = Calculator.RPN_to_answer((Calculator.expresionToReverse_poland_notation(line.split("\\s"))));
            out.write("\n");
            out.write(answer + " ");
            line = reader.readLine();
        }
    }
    public static  void XML() throws ParserConfigurationException {
        XML_reading xml_reading;
        XML_reading.main();
        XML_writing.main();
        Result_in_XML.main();
    }
    public static  void JSON() throws IOException
    {
        JSON_writing.main();
    }
    public static void do_graphics()
    {
        var app=new GUI();
        app.setVisible(true);
    }
}
