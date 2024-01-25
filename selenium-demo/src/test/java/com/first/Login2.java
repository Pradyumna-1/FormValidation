package com.first;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2 {
	public static void main(String[] args) throws InterruptedException {
		String browserType = "chrome"; // Change this to "edge" or "firefox" based on your preference

		WebDriver driver;

		if (browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid browser type. Please choose 'chrome', 'edge', or 'firefox'.");
			return;
		}

		try {
			driver.manage().window().maximize();
			driver.get("https://saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
		} finally {
			driver.quit();
		}
	}
}
