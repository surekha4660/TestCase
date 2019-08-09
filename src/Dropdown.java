import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> frames = dr.findElements(By.tagName("iframe"));
		
		int size = frames.size();
		System.out.println(size);
		
		dr.switchTo().frame("a077aa5e");
		
		
		dr.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		
		dr.switchTo().defaultContent();

			}

}
