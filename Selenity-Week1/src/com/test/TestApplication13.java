package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApplication13 {

	public TestApplication13() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dsdamat.com/urun/ds-damat-gomlek-slim-fit--408418.html");
		driver.findElement(By.xpath("//*[@id='ctl00_u9_ascUrunDetay_dtUrunDetay_ctl00_pnlSepet']/div[2]/table/tbody/tr/th/a"))
		.click();
	
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();// yes,ok
		//alert.dismiss(); => no
		Thread.sleep(2000);
		System.out.println("islem basarili");
		
		Thread.sleep(2000);
		
		driver.quit();
	}		

}
