package com.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		open url
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		
		
		
//		Find radio button
		List<WebElement> radioButtonList= driver.findElements(By.xpath("//input[@type='radio']"));
	
		System.out.println("Total no of radio button : "+radioButtonList.size());
		
//		driver.close();
		driver.quit();
		
	}
}
