package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		
		
		Thread.sleep(4000);
		
		
		
		
		
		driver.quit();
	}
}
