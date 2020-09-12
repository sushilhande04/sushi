package com.selenium.extractkeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTypedText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driverr= new ChromeDriver();
		driverr.get("https://www.google.com/advanced_search");
		driverr.findElement(By.id("xX4UFf")).sendKeys("selenium");
		String getname= driverr.findElement(By.id("xX4UFf")).getAttribute("value");
		System.out.println(getname);
	}
}
