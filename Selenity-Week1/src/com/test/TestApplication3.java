package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication3 {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Yahoo"));
		System.out.println("Baþlýk Doðru : "+driver.getTitle());
		
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		driver.findElement(By.id("uh-search-button")).click();
		
		//driver.findElement(By.xpath("//*[@id='uh-search-button']")).click();
	    //driver.findElement(By.cssSelector("#uh-search-box")).sendKeys("selenium");
		
		Thread.sleep(3000);
		driver.quit();
	
		
	}
}
