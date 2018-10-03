package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestApplication11 {

	public TestApplication11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		WebElement webElement = driver.findElement(By.xpath("//*[@id='u_0_j']"));
		webElement.sendKeys("Test Selenium");
		webElement.click();
		
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		sel1.selectByIndex(4);
		
	}
}
