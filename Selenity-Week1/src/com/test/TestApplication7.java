package com.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication7 {

	public TestApplication7() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.haberturk.com");
		
		WebElement element = driver.findElement(By.xpath(".//*"));
		List<WebElement> list = element.findElements(By.tagName("a"));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			
			String url = webElement.getAttribute("href");
			String urls[] = new String[] {url};
			
			for(int i = 0 ; i<urls.length; i++ ){
				
				if (urls[i].contains("spor")) {
					
					System.out.println(urls[i]);
				}
				
			}
			
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
