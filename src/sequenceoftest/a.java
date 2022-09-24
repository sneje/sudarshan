package sequenceoftest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a {public static WebDriver driver;
@Test(priority=1,alwaysRun=true)
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().getPageLoadTimeout();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[text()=' Login ']")).click();

}
}