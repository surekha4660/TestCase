package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://www.google.com/");
	  
	  String title = dr.getTitle();
	  System.out.println(title);
	  
	  String url = dr.getCurrentUrl();
	  System.out.println(url);
	  
	  //passing the value
	  
	  WebElement name = dr.findElement(By.name("q"));
	  name.sendKeys("GreensTechnology");
	  
	  
	
	}
}
