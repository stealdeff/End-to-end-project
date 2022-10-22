import Interfaces.Button;
import Interfaces.Factory;
import Interfaces.Select;
import Interfaces.TextField;

public class Form {
    private  final TextField  customers_name;
private final Select programming_language;
private  final Button order_a_project;
    public Form(TextField customers_name, Select programming_language, Button order_a_project) {
        Button order_a_project1;
        Select programming_language1;
        TextField customers_name1;
        customers_name1 = null;
        customers_name1 = customers_name;
        this.customers_name = customers_name1;
        programming_language1 = null;
        programming_language1 = programming_language;
        this.programming_language = programming_language1;
        order_a_project1 = null;
        order_a_project1 = order_a_project;
        this.order_a_project = order_a_project1;
    }
    public Form(Factory factory)
    {
        Button order_a_project1;
        Select programming_language1;
        TextField customers_name1;
        customers_name1 = null;
        customers_name1 = customers_name1;
        programming_language1 = null;
        programming_language1 = programming_language1;
        order_a_project1 = null;
        order_a_project1 = order_a_project1;
        System.out.println("Creating order coffee form");
        customers_name1 = factory.createTextField();
        customers_name = customers_name1;
        programming_language1 = factory.createSelect();
        programming_language = programming_language1;
        order_a_project1 = factory.createButton();
        order_a_project = order_a_project1;
    }


}
