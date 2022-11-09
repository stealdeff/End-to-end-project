import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class Result_in_XML
{

    public static void main(String[] args)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element rootElement = doc.createElementNS("https://javadevblog.com/language", "Languages");
            doc.appendChild(rootElement);
            Scanner cin=new Scanner(System.in);
           int result= XML_writing.main(XML_writing.res);
            String o=Integer.toString(result);

            rootElement.appendChild(getString(doc,"String",o,"input"));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult file = new StreamResult(new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\XML_output.xml"));
            transformer.transform(source, file);
            System.out.println("Создание XML файла закончено");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Node getString(Document doc, String id, String k, String a)
    {
        Element String= doc.createElement("String");
        String.appendChild(getstringElements(doc,String,"string",k));
        return String;
    }


    public static Node getstringElements(Document doc, Element element, String k,String p)
    {
        Element node = doc.createElement(k);
        node.appendChild(doc.createTextNode(p));
        return node;
    }

}
