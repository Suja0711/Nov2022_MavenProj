package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WelcomeMaven {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("sujatha");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456er");
		
		WebElement submitBtn = driver.findElement(By.name("login"));
		submitBtn.click();
	}

}
