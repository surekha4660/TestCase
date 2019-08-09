package org.seleniumday2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
	   WebDriver dr = new ChromeDriver();
	   dr.get("https://www.irctc.co.in/");
	   System.out.println(dr.getTitle());
	   System.out.println(dr.getCurrentUrl());
	   
	   
	}

}
