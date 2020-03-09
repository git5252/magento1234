package com.abc.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void launch(String name)
	{
		if(name.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		
	}

	
	
	@Test
	public void testCase2()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.magento.com");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.id("email")).sendKeys("udkp14ec@cmrit.ac.in");
        driver.findElement(By.id("pass")).sendKeys("Welcome1234");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.linkText("Log Out")).click();
	} b   
	
}
