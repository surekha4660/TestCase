package org.seleniumday2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
	    WebDriver dr = new ChromeDriver();
	    dr.get("http://www.greenstechnologys.com/oracle-training.html");
	}

}
