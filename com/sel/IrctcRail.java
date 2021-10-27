package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcRail {

	public static void main(String[] args) {
		//driver and path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		//launching browser
		WebDriver driver = new ChromeDriver();
		//entering url
		driver.get(" https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//
		WebElement registerBtn = driver.findElement(By.className("ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		registerBtn.click();
		
	}

}
