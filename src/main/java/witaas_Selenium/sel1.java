package witaas_Selenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sel1 {
	public static void main(String[] args){
		System.out.println("its working fine");
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebDriverWait exWait=new WebDriverWait(driver,4);
		WebElement we=driver.findElement(By.xpath("//input[@name='q']"));
		exWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
		we.sendKeys("xpath");
		we.submit();
//		exWait.until(ExpectedConditions.titleContains());
		Scanner sc=new Scanner(System.in);
		String ss=sc.nextLine();
		driver.close();
		sc.close();
	}
	
	public String sel2(){
		System.out.println("its working fine");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebDriverWait exWait=new WebDriverWait(driver,4);
		WebElement we=driver.findElement(By.xpath("//input[@name='q']"));
		exWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
		we.sendKeys("xpath");
		we.submit();
//		exWait.until(ExpectedConditions.titleContains());
		Scanner sc=new Scanner(System.in);
//		String ss=sc.nextLine();
//		System.out.println(ss);
		driver.close();
		sc.close();
		return "1";
	}
}
