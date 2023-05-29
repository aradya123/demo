package genericscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Mainclass {
	public WebDriver driver;
	@BeforeMethod
	public void Openapp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
          driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void Closeapp()
	{
		driver.close();
          
	}

}
