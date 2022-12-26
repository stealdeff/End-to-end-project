package XML;

import Main_and_Calc.Calculator;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class XML_Test {

    @Test
    void main() throws TransformerException, ParserConfigurationException, IOException, SAXException {

        String l = "Hello";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        DOMSource source = new DOMSource(doc);
        Document doc2 = dBuilder.parse("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TESt.XML");
        doc2.getDocumentElement().normalize();
        NodeList nList = doc2.getElementsByTagName("String");
        String k = null;
        //StreamResult file = new StreamResult(new File("C:\\Users\\ykamn\\IdeaProjects\\sh\\src\\main\\java\\TESt.XML"));
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                k = eElement.getElementsByTagName("string").item(0).getTextContent();
            }

        }

        assertEquals(l, k);

    }
}