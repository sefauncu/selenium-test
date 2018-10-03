package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication2 {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Google"));
		System.out.println("Ba�l�k Do�ru : "+driver.getTitle());
		
		WebElement element = driver.findElement(By.name("q"));
		//input alan�n name'i q oldu�u i�in o �ekilde bulduk
		element.sendKeys("selenium");
		element.submit(); //arama i�lemi ger�ekle�tirdik
		
		Thread.sleep(3000);
		driver.quit();
	
		
	}

}
