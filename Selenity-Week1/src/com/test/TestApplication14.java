package com.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication14 {

	
	@Test
	public void Testing() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		 
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
