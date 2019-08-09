package org.junit;
 
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Annotations {
	static WebDriver driver;
	

  @BeforeClass	

	public static void launch()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//set the url
		
		// driver.get("http://www.greenstechnologys.com/index.html");
	
  
		 
	}
	
	
	@AfterClass
	
	public static void close() {
		
	//	driver.close();

	}

	@Before
	
	public  void startTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@After
	public  void endtime() {
		Date d1 = new Date();
		System.out.println(d1);

	}
	
	//@Test
	
  //	public void logic()  {
		
	   // driver.get("http://www.greenstechnologys.com/index.html");
	//	WebElement MOU1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
	//	Actions acc = new Actions(driver);
//		acc.moveToElement(MOU1).perform();
		
        
		//WebElement MOU2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		//acc.moveToElement(MOU2).perform();
		
		//WebElement c1 = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Training']"));
		//c1.click();
		
		

	//}
	
	@Test
	
public 	void Drag()
{
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement sr1 = driver.findElement(By.id("credit2"));
		WebElement des1 = driver.findElement(By.id("bank"));
		
		WebElement sr2 = driver.findElement(By.id("fourth"));
		WebElement des2 = driver.findElement(By.id("amt7"));
		
	  
		WebElement sr3 = driver.findElement(By.id("credit1"));
		WebElement des3 = driver.findElement(By.id("loan"));
	  
		WebElement sr4 = driver.findElement(By.id("fourth"));
		WebElement des4 = driver.findElement(By.id("amt8"));
	  
	  
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(sr1, des1).perform();
		acc.dragAndDrop(sr2, des2).perform();
			
		acc.dragAndDrop(sr3, des3).perform();
		acc.dragAndDrop(sr4, des4).perform();
		
}
	
	
	
}
