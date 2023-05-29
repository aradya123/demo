package genericscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript extends Mainclass {
	@Test
	public void validLogin() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("7337640208");
	driver.findElement(By.id("pass")).sendKeys("Deepa@8431");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
}
}
	
	
	
	


