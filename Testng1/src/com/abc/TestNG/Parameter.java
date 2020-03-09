package com.abc.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
    @Test
	@Parameters({"url","email","pass"})
	public void testCase2(String url,String email,String pass)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.linkText("Log Out")).click();
	}
	
	
	
}
