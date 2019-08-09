package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class grrens1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
		
				WebDriver dr = new ChromeDriver();
				
				dr.get("http://www.greenstechnologys.com/");
				System.out.println(dr.getTitle());
				System.out.println(dr.getCurrentUrl());
				
				WebElement contact = dr.findElement(By.xpath("//input[@type='text']"));
			    contact.sendKeys("surekha");
			    
	}
}
