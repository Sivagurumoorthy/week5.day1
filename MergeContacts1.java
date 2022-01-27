package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MergeContacts1 extends BaseClass {
@Test
public  void MegContact() throws InterruptedException {
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Thread.sleep(8000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		String childwindow = windows.get(1);
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("(//div//a[@class='linktext'])[1]")).click();
		Thread.sleep(800);
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		Thread.sleep(7000);
		Set<String> windHande = driver.getWindowHandles();
		List<String> winow = new ArrayList<String>(windHande);
		String childwindo = winow.get(1);
		driver.switchTo().window(childwindo);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]//a")).click();
		Thread.sleep(800);
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
