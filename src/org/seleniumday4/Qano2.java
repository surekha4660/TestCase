package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qano2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.greenstechnologys.com/selenium-course-content.html");
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		
		//dr.findElement(By.xpath("//))
	}

}
