package com.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestApplication {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		try { 
			Assert.assertTrue(driver.getTitle().contains("Google Search"));
			System.out.println("Ba�l�k Do�ru : "+driver.getTitle());
		} catch (Error e) {
			System.out.println("Ba�l�k Hatal� : "+driver.getTitle());
		}
		
	}

}
