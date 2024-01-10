package com.AutomateFlipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void auto_setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("The Operations are performed using the Chrome Driver");
	}
	
	@Test
	public void boost_loadTime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		long start_time = System.currentTimeMillis();
		
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length -1], 3000);");
		
		System.out.println("Passed Time: " +(System.currentTimeMillis() - start_time) + " milliSeconds");		
		Thread.sleep(2000);
//		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("vmb4401@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Vishu@0000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(4000);
		System.out.println("Login Successful");		
		driver.quit();
		driver.quit();
	}
	
	@Test
	public void choose_scroll() throws InterruptedException {
//		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		System.out.println("Displaying iPhone 13 under mobile category");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(1500);
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(3000);
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(3000);
		System.out.println("Reached to the Maximum value of the screen height");
		
		js.executeScript("scrollBy(0, -2000)");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0, -2000)");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0, -2000)");
		Thread.sleep(2000);
		System.out.println("The page is scrolled to top of the page");
		Thread.sleep(2000);
		
        driver.navigate().refresh();   
        System.out.println("Refreshed the page successfully");
	
		System.out.println("Executed Successfully");
		driver.quit();
		driver.quit();
		
	}
	
	@Test
	public void firefox_setUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
//		Thread.sleep(2000);
		System.out.println("Firefox driver started");
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		System.out.println("Displaying iPhone 13 under mobile category");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(1500);
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(3000);
		js.executeScript("scrollBy(0, 2000)");
		Thread.sleep(3000);
		System.out.println("Reached to the Maximum value of the screen height");
		
		js.executeScript("scrollBy(0, -2000)");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0, -2000)");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0, -2000)");
		Thread.sleep(2000);
		System.out.println("The page is scrolled to top of the page");
		Thread.sleep(2000);
		
        driver.navigate().refresh();   
        System.out.println("Refreshed the page successfully");
	
		System.out.println("Executed Successfully");
		driver.quit();
		
		
	}
}

