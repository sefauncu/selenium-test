package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication4 {

	public TestApplication4() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhgiris.com/Register.aspx");
		
		WebElement element = driver.findElement(By.id("p_pass"));
		System.out.println(element.getAttribute("name"));
		System.out.println(element.getTagName());
		System.out.println(element.getCssValue("font-size"));
		
		Thread.sleep(3000);
		driver.quit();
		
	}	
}
