package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icicibank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");

	   WebDriver dr = new ChromeDriver();
	   dr.get("https://infinity.icicibank.com/corp/Login.jsp");
	   
	   String title = dr.getTitle();
	   System.out.println(title);
	   
	   String url = dr.getCurrentUrl();
	   System.out.println(url);
	   
	   //pass the value
	   
	   WebElement username = dr.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	   username.sendKeys("surekha");
	   
	   WebElement pass = dr.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	   pass.sendKeys("password");
	   
	   
	   
	   
	}

}
