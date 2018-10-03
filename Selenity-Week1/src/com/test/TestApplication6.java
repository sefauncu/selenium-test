package com.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication6 {

	public TestApplication6() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String a[] = {"https://www.google.com","https://www.yahoo.com","https://www.mynet.com"};
		
		for (int i = 0; i < a.length; i++) {
			
			driver.get(a[i]);
			System.out.println("----------------------");
			if (driver.getTitle() != null) {
				System.out.println(i+1 + " " +a[i] + " " +driver.getTitle());	
			} else {
				System.out.println("Boþ");	
			}
			
			System.out.println();
			
			if (driver.findElement(By.xpath(".//Body")).getText() != null) {
				System.out.println(driver.findElement(By.xpath(".//Body")).getText());
			}
			else {
				System.out.println("Boþ");	
			}
		}
		System.out.println("----------------------");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
