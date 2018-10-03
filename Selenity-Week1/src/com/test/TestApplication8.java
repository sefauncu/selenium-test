package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication8 {

	public TestApplication8() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileWriter fileWriter = new FileWriter("result.txt");
		BufferedWriter bufferedReader = new BufferedWriter(fileWriter);
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.obilet.com/");
		
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div[1]/div/span")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("select2-dll-from-results"));
		List<WebElement> list = element.findElements(By.xpath(".//li"));
		
		for(WebElement webElement : list){
					
			String name = webElement.getText();
		
			bufferedReader.write(name);
			bufferedReader.write("\n");
			bufferedReader.newLine();
			
			System.out.println(name);
		}
		bufferedReader.close();
		driver.quit();
		
		
	}

}
