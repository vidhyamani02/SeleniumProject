package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fraMe {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    driver.manage().window().maximize();
	    //
	    driver.findElement(By.name("login_page"));
	    driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vidhya");
	    
	}
}
 