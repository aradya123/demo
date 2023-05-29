package hybridframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Script1 {
	
		public WebDriver driver;
		@BeforeMethod
		public void Openapp()
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	          driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	          driver.get("http://106.51.87.42:9003/login");
		}
		@AfterMethod
		public void Closeapp()
		{
			driver.close();
	          
		}

	}




