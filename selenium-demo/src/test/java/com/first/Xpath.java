package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com/");
		
//		locate Password using single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		
//		locate Password using multiple attribute
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
//		Switch to product page
		
		String currentWindowHandler= driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandler);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack' ]")).click();
		
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name= 'add-to-cart-sauce-labs-bike-light' ]")).click();
		
//		driver.quit();
		}

}
