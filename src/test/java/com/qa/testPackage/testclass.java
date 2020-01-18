package com.qa.testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {

	@Test
	//public static void main(String[] args) {
	public void testNg() {
		System.setProperty("webdriver.chrome.driver", "/Users/Shwetha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String tit = driver.getTitle();
		System.out.println(tit);
	
		System.out.println("hello");
		driver.quit();
	}
}
