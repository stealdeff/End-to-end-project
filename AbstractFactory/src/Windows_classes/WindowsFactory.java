package Windows_classes;
import Interfaces.Factory;
import Interfaces.Button;
import Interfaces.Select;
import Interfaces.TextField;

import java.io.FileWriter;
import java.io.IOException;

public class WindowsFactory implements Factory {
    FileWriter out=new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\AbstractFactory\\src\\File.txt");
    public WindowsFactory() throws IOException {
        out.write("Creating gui factory for Windows OS");
        out.close();
    }

    public Button createButton() throws IOException {
        out.write("Creating Button for Windows OS");
        out.close();
        return new WButton();
    }

    public TextField createTextField() throws IOException {
        out.write("Creating TextField for Windows OS");
        out.close();
        return new WTextField();
    }

    public Select createSelect() throws IOException {
        out.write("Creating Select for Windows OS");
        out.close();
        return new WSelect();
    }
}