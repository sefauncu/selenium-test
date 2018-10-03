package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication5 {

	public TestApplication5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhgiris.com/Register.aspx");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div/div[9]/input[2]"));
		element.click();
		if(element.isSelected()){
			System.out.println("evet");
		}else {
			System.out.println("hayýr");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}	
}
