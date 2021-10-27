package com.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelFirst {

	public static void main(String[] args) {
		//driver and path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		//launching browser
		WebDriver driver = new ChromeDriver();
		//entering url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//
		WebElement signInBtn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signInBtn.click();
		
	}
		
	}
