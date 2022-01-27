package week5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
public ChromeDriver driver;
@Test
public  void bseclass() throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
driver.manage().window().maximize();
driver.get("https://dev101786.service-now.com/nav_to.do?");	
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("XYZ123a#",Keys.ENTER);
Thread.sleep(9000);
driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("incident",Keys.ENTER);
}


}
