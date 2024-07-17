package com.SIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zoho_Practice {

	public static void main(String[] args) throws InterruptedException, AWTException{

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);

		driver.get("https://careers.zohocorp.com/jobs/Careers/2803000614913581/"
				+ "QA-Engineers?$apply=true&source=CareerSite&$callback_url=https://"
				+ "www.zoho.com/careers/jobdetails/?job_id=2803000614913581");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		WebElement mrDropdown = driver.findElement(By.xpath("(//span[text()='-None-'])[1]"));
		mrDropdown.click();

		WebElement selMr = driver.findElement(By.xpath("//*[text()='Mr.']"));
		selMr.click();

		WebElement firstName = driver.findElement(By.xpath("(//input[@data-tabindex='0'])[1]"));
		firstName.sendKeys("Ram");

		WebElement lastName = driver.findElement(By.xpath("(//input[@data-tabindex='0'])[2]"));
		lastName.sendKeys("Chandran");

		WebElement email = driver.findElement(By.xpath("(//input[@data-tabindex='0'])[3]"));
		email.sendKeys("sivaseruvai@yahoo.co.in");
		Thread.sleep(1000);

		WebElement contact = driver.findElement(By.xpath("(//*[@class='cxBorderBottom '])[4]"));
		contact.sendKeys("9876543210");
		Thread.sleep(1000);

		WebElement yearEdu = driver.findElement(By.xpath("(//*[@class='cxBorderBottom '])[5]"));
		yearEdu.sendKeys("2023");

		WebElement GenDropdown = driver.findElement(By.xpath("(//span[text()='-None-'])[1]"));
		GenDropdown.click();
		Thread.sleep(1000);

		WebElement expDrpDwn = driver.findElement(By.xpath("(//*[@class='dropdown'])[3]"));
		expDrpDwn.click();
		Thread.sleep(3000);
		
		WebElement selExp = driver.findElement(By.xpath("//*[@data-zcqa='Experience In Years_4-5 Years' and text()='4-5 Years']"));
		selExp.click();
		
		WebElement currentEmp = driver.findElement(By.xpath("(//*[@data-tabindex='0'])[6]"));
		currentEmp.sendKeys("Yes");
		Thread.sleep(1000);
		
		WebElement currentCTCDrop = driver.findElement(By.xpath("(//span[text()='-None-'])[1]"));
		currentCTCDrop.click();
		Thread.sleep(2000);
		
		WebElement selCurrentCTC = driver.findElement(By.xpath("//lyte-drop-item[text()='3-5']"	));
		selCurrentCTC.click();
		Thread.sleep(1000);
		
		
		WebElement ExpCTCDrop = driver.findElement(By.xpath("(//*[@cx-prop-zcqa='manual_Expected_CTC_In_Lakhs_Per_Annum'])[1]"));
		ExpCTCDrop.click();
		Thread.sleep(2000);
		
		WebElement selExpCTC = driver.findElement(By.xpath("(//lyte-drop-item[@data-value='9-10'])[2]"));
		selExpCTC.click();
		Thread.sleep(1000);
		
		WebElement notePerDrop = driver.findElement(By.xpath("(//*[@class='dropdown'])[6]"));
		notePerDrop.click();

		WebElement selNotPer = driver.findElement(By.xpath("(//*[text()='Immediate'])"));
		selNotPer.click();

		WebElement skillSet = driver.findElement(By.xpath("//input[@placeholder='Search and add skills']"));
		skillSet.sendKeys("Automation");
		Thread.sleep(3000);
		
		WebElement txtAutomation = driver.findElement(By.xpath("//li[text()='Automation']"));
		txtAutomation.click();
		Thread.sleep(1000);
		
		actions.click().build().perform();
		Thread.sleep(1000);
		
		WebElement acrossDrop = driver.findElement(By.xpath("(//*[@class='dropdown'])[7]"));
		acrossDrop.click();

		WebElement selAcross = driver.findElement(By.xpath("(//*[text()='Referral'])"));
		actions.click(selAcross).build().perform();

		WebElement currentLoc = driver.findElement(By.xpath("(//input[@data-tabindex='0'])[8]"));
		currentLoc.sendKeys("Chennai");

		WebElement prefLocDrop = driver.findElement(By.xpath("(//input[@id='inputId'])[1]"));
		prefLocDrop.click();

		WebElement selPrefLoc = driver.findElement(By.xpath("//*[text()='Madurai']"));
		actions.click(selPrefLoc).build().perform();
		Thread.sleep(1000);
		
		WebElement cancelBtn = driver.findElement(By.xpath("//lyte-yield[text()='Cancel']"));
		cancelBtn.click();

	
	}

}












//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);


//WebElement company = driver.findElement(By.xpath("(//li[@class='nav-menu']//span)[1]"));
//company.click();
//
//WebElement careers = driver.findElement(By.xpath("(//*[text()='Careers'])[1]"));
//careers.click();
//
//WebElement qa = driver.findElement(By.xpath("//*[text()='QA Engineers']"));
//qa.click();
//
//WebElement imInt = driver.findElement(By.xpath("(//a[text()=' I’m interested '])[1]"));
//imInt.click();
