package seleniumQaone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
	
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.quit();
	//dr.close();
	
	
}
}
