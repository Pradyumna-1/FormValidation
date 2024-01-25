package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com/");
		
//		Locate user name --tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

// Locate password - tag[attributeValue]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
//		Switch to product page
		
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
//		tag.valueClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
//		tag[attribut$=substring]
		
		
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		
		
		

		
		
		Thread.sleep(2000);
		
		driver.quit();
		}
}
