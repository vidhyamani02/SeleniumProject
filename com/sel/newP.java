package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newP {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		//
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    //
	    WebElement userNm = driver.findElement(By.name("username"));
	    userNm.sendKeys("Vidhya");
	    
	    WebElement pswD = driver.findElement(By.id("login_password|input"));
	    pswD.sendKeys("hello");
	   
	    //
	    WebElement login = driver.findElement(By.className("oj-button-text"));
	    login.click();
	    
	    
	    
	    
	  
	    		
	    

}
}