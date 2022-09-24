package sequenceoftest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	//public static WebDriver driver;
	@Test(priority=0,alwaysRun=true)
	public void launchBrower() {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().getPageLoadTimeout();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		//driver.manage().timeouts().getPageLoadTimeout();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
		
	}


