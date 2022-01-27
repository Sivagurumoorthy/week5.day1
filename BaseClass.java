package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://leaftaps.com/opentaps");
		// missing url
		//get the title
		String Title = driver.getTitle();
		System.out.println(Title);
		
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("Demosalesmanager");
	// Enter the Password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	// click on login button
	driver.findElement(By.className("decorativeSubmit")).click();

	// click on CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
Thread.sleep(60);
		driver.close();
	}

}
