package Windows_classes;
import Interfaces.Factory;
import Interfaces.Button;
import Interfaces.Select;
import Interfaces.TextField;

public class WindowsFactory implements Factory {
    public WindowsFactory()
    {
        System.out.println("Creating gui factory for Windows OS");
    }

    public Button createButton() {
        System.out.println("Creating Button for Windows OS");
        return new WButton();
    }

    public TextField createTextField() {
        System.out.println("Creating TextField for Windows OS");
        return new WTextField();
    }

    public Select createSelect() {
        System.out.println("Creating Select for Windows OS");
        return new WSelect();
    }
}