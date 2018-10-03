package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication9 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		WebElement webElement = driver.findElement(By.xpath("//*[@id='article-body']/ol[2]/li[3]/div/form"));
		List<WebElement> list = webElement.findElements(By.xpath(".//input"));
		
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i).getAttribute("id"));
			//list.get(i).click();
			//Thread.sleep(2000);
			
		}

		driver.quit();
	}

}
