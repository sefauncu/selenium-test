package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication10 {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.0wikipedia.org");
		
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@id='searchInput']"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		
		Thread.sleep(5000);
		
		driver.quit();
	}		

}
