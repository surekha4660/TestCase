package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passvalue {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
	
	WebDriver dr = new ChromeDriver();
	
	dr.get("https://www.facebook.com/");
	
	String title = dr.getTitle();
	System.out.println(title);
	
	String url = dr.getCurrentUrl();
	System.out.println(url);
	
	//pass the values
	
	WebElement email = dr.findElement(By.id("email"));
	email.sendKeys("surekhapatil@gmail.com");

	WebElement pass = dr.findElement(By.id("pass"));
	pass.sendKeys("password");
	
	//click
	
	WebElement btn = dr.findElement(By.xpath("//input[@ data-testid='royal_login_button']"));
	btn.click();
	
	
}
}
