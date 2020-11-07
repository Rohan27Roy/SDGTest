package witaas_Selenium;


import java.io.IOException;

import org.joox.selector.CSS2XPath;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Xpath {
	public static void main(String[] args) {
		
		try {
	        Document doc = Jsoup.connect("https://www.google.com/").get();
	        Elements elements = doc.select("*");
	        for (Element element : elements) {
	            String path = CSS2XPath.css2xpath(element.cssSelector());
	            System.out.println("Node name : " + element.nodeName());
	            System.out.println("      Tag : " + element.tagName());
	            System.out.println("      CSS : " + element.cssSelector());
	            System.out.println("    XPath : " + path + "\n");

	        }
	    } catch (IOException e) {
	        System.out.println(e);
	    }
	}
}
