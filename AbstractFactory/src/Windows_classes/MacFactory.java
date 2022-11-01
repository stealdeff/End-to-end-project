package Windows_classes;
import Interfaces.Factory;
import Interfaces.TextField;
import Interfaces.Select;
import Interfaces.Button;
import Mac_OS_classes.MacButton;
import Mac_OS_classes.MacTextField;
import Mac_OS_classes.MacSelect;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class MacFactory implements Factory {
    FileWriter out=new FileWriter("C:\\Users\\ykamn\\IdeaProjects\\sh\\AbstractFactory\\src\\File.txt");
    public MacFactory() throws IOException {
        out.write("Creating gui factory for macOS");
        out.close();
    }

    @Override
    public Button createButton() throws IOException {
        out.write("Creating Button for macOS");
        out.close();
        return new MacButton();
    }

    @Override
    public TextField createTextField() throws IOException {
        out.write("Creating TextField for macOS");
        out.close();
        return new MacTextField();
    }

    @Override
    public Select createSelect() throws IOException {
        out.write("Creating Select for macOS");
        out.close();
        return new MacSelect();
    }
}