package Windows_classes;
import Interfaces.Factory;
import Interfaces.TextField;
import Interfaces.Select;
import Interfaces.Button;
import Mac_OS_classes.MacButton;
import Mac_OS_classes.MacTextField;
import Mac_OS_classes.MacSelect;
import java.awt.*;

public class MacFactory implements Factory {
    public MacFactory() {
        System.out.println("Creating gui factory for macOS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for macOS");
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating TextField for macOS");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for macOS");
        return new MacSelect();
    }
}