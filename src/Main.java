import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)throws IOException {
        File fin = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\input.txt");
        FileReader fr = new FileReader(fin);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter out = new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
        DataSourceDecorator encoded_output = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt")));
        //DataSourceDecorator encoded_input = new CompressionDecorator(
        //new EncryptionDecorator(
        //new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\input.txt")));
        String line = reader.readLine();
        DataSource plain_output = new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\output.txt");
        //DataSource plain_input = new FileDataSource("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\input.txt");
        //encoded_input.writeData(line);
        encoded_output.writeData(line);
        out.write("- Input ----------------");
        while (line != null) {
            int answer = Calculator.RPN_to_answer((Calculator.expresionToReverse_poland_notation(line.split("\\s"))));
            out.write("\n");
            out.write(String.valueOf(answer) + " ");
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

    }

}