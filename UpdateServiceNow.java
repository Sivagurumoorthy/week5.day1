package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateServiceNow extends BaseClass2 {
@Test
public  void udt() throws InterruptedException {
		// TODO Auto-generated method stub
	Thread.sleep(500);
	driver.findElement(By.xpath("//div[@class='sn-widget-list-title'][text()='Create New']")).click();
	Thread.sleep(500);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
	  WebElement incidentno = driver.findElement(By.xpath("//input[@id='incident.number']"));
	  String attribute = incidentno.getAttribute("value");
	  System.out.println(attribute);
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String>windows1=new ArrayList<String>(windowHandles1);
	driver.switchTo().window(windows1.get(1));
	driver.findElement(By.xpath("//a[text()='Creator User']")).click();
	driver.switchTo().window(windows1.get(0));
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("CREATOR USER");
	driver.findElement(By.xpath("//select[@role='listbox']//option[text()='In Progress']")).click();
	driver.findElement(By.xpath("//select[@role='listbox']//option[text()='1 - High']")).click();
    driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
   driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(attribute,Keys.ENTER);
   WebElement element = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]"));
   String incidentcreate = element.getText();
   driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).click();
   driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
   WebElement elment1 = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]"));
   String incidentcrate1 = elment1.getText();
   if (incidentcreate.equalsIgnoreCase(incidentcrate1)) {
	   
	   System.out.println("UPDATED SUCCESSFULLY" );
   }
   
	}

}
