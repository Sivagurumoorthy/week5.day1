package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditContact extends BaseClass {
	@Test
	public void TestCase2 () throws InterruptedException {
	
	//click on contacts tab
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Find Contacts")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gurusmart123@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
	Thread.sleep(800);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a[@class='linktext']")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("EDIT CONTACT");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
}}
