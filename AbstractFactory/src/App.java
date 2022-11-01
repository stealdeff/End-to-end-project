import Interfaces.Factory;
import Windows_classes.MacFactory;
import Windows_classes.WindowsFactory;

import java.io.FileWriter;
import java.io.IOException;

public class App {
        private Form orderForm;

        public String draw() throws IOException {

            String osName = System.getProperty("os.name").toLowerCase();

            FileWriter out=new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\AbstractFactory\\src\\File.txt");
            Factory guiFactory ;

            if (osName.startsWith("win")) { // Для windows
                guiFactory = new WindowsFactory();
            } else if (osName.startsWith("mac")) { // Для mac
                guiFactory = new MacFactory();
            } else {
                //System.out.println("Unknown OS, can't draw form :( ");
                out.write("Unknown OS, can't draw form :( ");
            }
           // orderForm = new Form(guiFactory);
            return orderForm.toString();
        }

        public static void main(String[] args) throws IOException {
            FileWriter out=new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\AbstractFactory\\src\\File.txt");
            App application = new App();
            out.write(application.draw());
out.close();
        }
    }

