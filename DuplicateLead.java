package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class DuplicateLead extends BaseClass {
    @Test
	public  void DuplicateLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress'][@type='text']")).sendKeys("gurusmart123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
	     Thread.sleep(5000);
String CaptureFirstElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println(CaptureFirstElement);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Create Lead']")).click();
		String DuplicateTitle = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(DuplicateTitle);
		if(DuplicateTitle.equalsIgnoreCase(CaptureFirstElement))
		{
			System.out.println("duplicated lead name is same as captured name");
		}
		else {
			System.out.println("duplicated lead name is not same as captured name");
		}}}
	

