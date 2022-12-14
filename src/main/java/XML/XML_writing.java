package XML;

import Main_and_Calc.Calculator;
import Main_and_Calc.Console;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class XML_writing extends Console {
public static int res;
    public static int main() throws ParserConfigurationException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        try {


            File fXmlFile = new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\XML_input.xml");
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("String");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("String : " + eElement.getElementsByTagName("string").item(0).getTextContent());
                    String k = eElement.getElementsByTagName("string").item(0).getTextContent();
                    res= Calculator.RPN_to_answer(Calculator.expressionToReverse_poland_notation(k.split("\\s")));
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}



