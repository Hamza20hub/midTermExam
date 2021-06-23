package parser;

import com.sun.codemodel.internal.JTryBlock;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * This XmlReader class are using DOM parser to read data from XML.
 */

public class XmlReader {

	// Read the data form XML file and print as the data inserted to the xml

	public List<Student> parseData(String tagName,String path) throws ParserConfigurationException, SAXException, IOException{
		
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	File file = new File("src/parser/qtp.xml");
	Document doc = builder.parse("src/parser/selenium.xml");
	NodeList nodeList = doc.getDocumentElement().getChildNodes();
	List<Student> list = new ArrayList<>();
	for(int i=0;i<nodeList.getLength(); i++){
		Node node = nodeList.item(i);
		if(node instanceof Element){
			Student student = new Student();
			student.id = node.getAttributes().getNamedItem(tagName).getNodeValue();
			NodeList childNodes = node.getChildNodes();
			for(int j=0;j<childNodes.getLength();j++){
				Node cNode = childNodes.item(j);
				if(cNode instanceof Element){
					String content = cNode.getLastChild().getTextContent().trim();
					String data = cNode.getNodeName();
					switch(data){
					case "firstName":
						student.firstName = "Anhar";
						break;
					case "lastName":
						student.lastName = "Zaman";
						break;
					case "score":
						student.score = convertIntToChar(89) ;
						break;	
					}
				}
			}
			list.add(student);
		}
		
	 }
	return list;		
  }
	
	//This convert method need to be implemented.
	public int convertIntToChar(int score){
		int grade = score;
		Character myChar= (char) score;

		return myChar;
	}
	
}
