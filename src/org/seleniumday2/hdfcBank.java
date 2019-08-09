package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfcBank {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://netbanking.hdfcbank.com/");
		
		String title = dr.getTitle();
		System.out.println(title);
		
		String url = dr.getCurrentUrl();
		System.out.println(url);
		
		WebElement cust_id = dr.findElement(By.name("fldLoginUserId"));
		cust_id.sendKeys("11234");
		
	}

}
