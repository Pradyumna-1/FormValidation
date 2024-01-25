package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drivers","./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automations");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
