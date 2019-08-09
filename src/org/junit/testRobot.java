package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testRobot {
	
	static WebDriver driver;
	
	@BeforeClass
	
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
	    //set url
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
	}
	
 @AfterClass
 public static void close()
 {
   //driver.close();
	 
}

  @After
  public void startTime()
  {
	  Date d1 = new Date();
	  System.out.println(d1);
	  
  }
  
  @Before
  
  public void EndTime() {
	  Date d2 = new Date();
	  System.out.println(d2);
	  
  }
  
  @Test
  
  public void logic() throws AWTException   {
	   
	  WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys("1234");
	  
	  //Actions acc = new Actions(driver);
	  //acc.doubleClick(email).perform();
	  //acc.contextClick(email).perform();
	  
	  
	  
   Robot r = new Robot();
   
   	r.keyPress(KeyEvent.VK_CONTROL);
   	r.keyPress(KeyEvent.VK_A);
   
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_A);
    
    r.keyPress(KeyEvent.VK_CONTROL);
   	r.keyPress(KeyEvent.VK_C);
   
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_C);
   
    
   
	 
 /*  for(int i=0; i<3;  i++)
   {
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     
   }*/
   
   //r.keyPress(KeyEvent.VK_ENTER);
   //r.keyRelease(KeyEvent.VK_ENTER);
   
    // WebElement pwd = driver.findElement(By.id("pass"));
     //pwd.click();
   r.keyPress(KeyEvent.VK_TAB);
   r.keyRelease(KeyEvent.VK_TAB);
     
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_V);
      
	 	  
  }
}