package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication12 {

	public TestApplication12() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.haberturk.com/");
		
		 int size = driver.findElement(By.cssSelector("#header > div.content > div > div.category-list > ul"))
		 .findElements(By.tagName("li")).size();
		 
		 System.out.println(size);
		 
		 for(int i=0; i<size;i++){
			String link = driver.findElement(By.cssSelector("#header > div.content > div > div.category-list > ul"))
			 .findElements(By.tagName("li")).get(i).getText();
			System.out.println(link);
		 }
		
		Thread.sleep(5000);
		
		driver.quit();
	}		

}
