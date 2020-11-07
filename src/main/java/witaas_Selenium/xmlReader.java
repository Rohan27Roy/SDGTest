package witaas_Selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class xmlReader {
	public static void main(String[] args) {
		
		try {
			BufferedReader flr=new BufferedReader(new FileReader("pom.xml"));
			System.out.println(new File("pom.xml").exists());
			String rdl=flr.readLine();
			while(rdl!=null) {
				System.out.println(rdl);
				rdl=flr.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
