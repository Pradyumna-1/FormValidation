import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {
	public static void main(String[] args) throws InterruptedException {
//		Lunching Chrome browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		Lunching webpages
		driver.get("https://www.calculator.net/");
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total list on webpage: "+linkElements.size());
	
		for(WebElement el:linkElements) {
			System.out.println(el.getText());
		}
		Thread.sleep(2000);
//			driver.close();
		driver.quit();
		
	}
}