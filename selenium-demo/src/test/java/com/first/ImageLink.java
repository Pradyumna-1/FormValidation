package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://impradyumna.vercel.app/");
		
//		To find the webelement image 
		
		driver.findElement(By.xpath("//img[@alt='Pradyumna']")).click();
		
		if(driver.getTitle()=="Vite + React") {
			System.out.println("Title Passed");
		}else {
			System.out.println("Not Failed");
		}
	
		Thread.sleep(2000);
		driver.quit();
	}
}
