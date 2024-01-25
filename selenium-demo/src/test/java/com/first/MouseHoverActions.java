package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.in/");
		
		WebElement element = driver.findElement(By.linkText("Shipping"));
		
		Actions act = new Actions(driver);
		
//		moveToElement() --> is used for mouse hover actions
		act.moveToElement(element).perform();
	
		Thread.sleep(4000);
		driver.quit();
	}

}
