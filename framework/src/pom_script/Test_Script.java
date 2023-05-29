package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Script {
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Generic_script G=new Generic_script(driver);
        G.clickLogin();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        G.clickLogin();
        
	}

}
