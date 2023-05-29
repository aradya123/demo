package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_script1 {
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Pom_script p=new Pom_script(driver);
        p.unData("7337640208");
        Thread.sleep(2000);
        p.pwdData("Deepa@8431");
        Thread.sleep(2000);
        p.clickLogin();
	}
        

}
