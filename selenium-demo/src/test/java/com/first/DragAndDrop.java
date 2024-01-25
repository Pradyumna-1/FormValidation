package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
//		find the drag and drop 
		
		WebElement source =driver.findElement(By.id("box3"));
		WebElement target = driver.findElement(By.id("box105"));
		
		
		Actions act = new Actions(driver);
		
//		dragAndDrop(sourceElement,targetElement)
		act.dragAndDrop(source, target).perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
