package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenstech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surekha\\eclipse-workspace\\seleniumQaone\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.greenstechnologys.com");
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		
		WebElement review = dr.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		//String rev = review.getText();
		System.out.println(review.getText());
	}

}
