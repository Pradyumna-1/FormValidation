package com.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGetOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		open web page
		driver.get("https://www.opencart.com/index.php?route=account/register");
	
		WebElement element = driver.findElement(By.id("input-country"));
		
		Select dropdown = new Select(element);

		
//		Select by text method 
//		dropdown.selectByVisibleText("India");
		
	
//		select by value
//		dropdown.selectByValue("1");
		
//		Select by index
		
		dropdown.selectByIndex(12);

		
//		if(dropdown.isMultiple()) {
//			System.out.println("Dropdown is multiple ");
//		}
//		else {
//			System.out.println("Drop down is not multiple ");
//		}
//		
		
		
		List <WebElement> alldropdownoptions= dropdown.getOptions();

		
		for(WebElement el:alldropdownoptions) {
			System.out.println(el.getText());
		}
		
		
		
		
		driver.quit();
	
	}
}
