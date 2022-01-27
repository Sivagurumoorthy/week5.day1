package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends BaseClass  {
	
@Test
public void EditLead () throws InterruptedException {
	
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("SIVA GURUMOORTHY");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
System.out.println(driver.getTitle()); 
driver.findElement(By.xpath("//a[text()='Edit']")).click();
WebElement Companyname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName'][@name='companyName']"));
Companyname.clear();
Companyname.sendKeys("SIEMENS");
driver.findElement(By.className("smallSubmit")).click();		
}}

