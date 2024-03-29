//package com.edureka.project;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Edureka {
//    static WebDriver driver;
//
//    public void EdurekaProfile() throws InterruptedException {
//        // Correct WebDriver initialization
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        // Launching the edureka website
//        driver.get("https://www.edureka.co/");
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Log in
//        driver.findElement(By.linkText("Log In")).click();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Enter email and password
//        driver.findElement(By.id("si_popup_email")).sendKeys("TestingEdureka@gmail.com");
//        driver.findElement(By.id("si_popup_psswd")).sendKeys("12345678");
//
//        // Click on the login button
//        driver.findElement(By.xpath("//button[@class='clik_btn_log-btn-block']")).click();
//
//        // Navigate to My Profile
//        driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
//        driver.findElement(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")).click();
//
//        // Edit personal details
//        driver.findElement(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Edureka");
//
//        // Navigate to career interests
//        driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
//        Thread.sleep(3000);
//
//        // Fill career interests form
//        Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
//        dropdownCurrentJob.selectByVisibleText("Software Testing");
//
//        Select dropdownEmploymentType = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
//        dropdownEmploymentType.selectByVisibleText("Both");
//
//        Select dropdownCTC = new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalary']")));
//        dropdownCTC.selectByVisibleText("Not applicable");
//
//        driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
//        driver.findElement(By.name("preferredCity")).sendKeys("Mumbai");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//        // Logout
//        driver.navigate().to("https://learning.edureka.co/");
//        driver.findElement(By.xpath("//span[@class='user_name']")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
//
//        // Close the browser
//        driver.quit();
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Edureka edureka = new Edureka();
//        edureka.EdurekaProfile();
//    }
//}












package com.edureka.project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Edureka {
    static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Correct WebDriver initialization
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Launching the edureka website
        driver.get("https://www.edureka.co/");
    }

    @Test
    public void testEdurekaProfile() throws InterruptedException {
        // Log in
        driver.findElement(By.linkText("Log In")).click();

        // Enter email and password
        driver.findElement(By.id("si_popup_email")).sendKeys("TestingEdureka@gmail.com");
        driver.findElement(By.id("si_popup_psswd")).sendKeys("12345678");

        // Click on the login button
        driver.findElement(By.xpath("//button[@class='clik_btn_log-btn-block']")).click();

        // Navigate to My Profile
        driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
        driver.findElement(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")).click();

        // Edit personal details
        driver.findElement(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Edureka");

        // Navigate to career interests
        driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
        Thread.sleep(3000);

        // Fill career interests form
        Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
        dropdownCurrentJob.selectByVisibleText("Software Testing");

        Select dropdownEmploymentType = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
        dropdownEmploymentType.selectByVisibleText("Both");

        Select dropdownCTC = new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalary']")));
        dropdownCTC.selectByVisibleText("Not applicable");

        driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
        driver.findElement(By.name("preferredCity")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Logout
        driver.navigate().to("https://learning.edureka.co/");
        driver.findElement(By.xpath("//span[@class='user_name']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

