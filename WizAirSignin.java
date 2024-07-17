package com.SIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WizAirSignin {


	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://wizzair.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement dialogBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='svg-icon svg-fill icon__x'])[2]")));
		dialogBox.click();
		Thread.sleep(1000);

		WebElement signInBtn = driver.findElement(By.xpath("(//button[text()=' Sign in '])[1]"));
		signInBtn.click();
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("siva@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("123@sdjkbw");
		
		WebElement submit =wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//button[text()=' Sign in  '])"))));
		submit.click();

		Thread.sleep(1000);
		driver.quit();

	}

}
