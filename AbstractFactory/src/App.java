import Interfaces.Factory;
import Windows_classes.MacFactory;
import Windows_classes.WindowsFactory;

public class App {
        private Form orderForm;

        public void drawOrderForm()
        {
            String osName = System.getProperty("os.name").toLowerCase();
            Factory guiFactory;

            if (osName.startsWith("win")) { // Для windows
                guiFactory = new WindowsFactory();
            } else if (osName.startsWith("mac")) { // Для mac
                guiFactory = new MacFactory();
            } else {
                System.out.println("Unknown OS, can't draw form :( ");
                return;
            }
            orderForm = new Form(guiFactory);
        }

        public static void main(String[] args) {
            App application = new App();
            application.drawOrderForm();
        }
    }

