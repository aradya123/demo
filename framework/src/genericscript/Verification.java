package genericscript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification extends Mainclass {
	@Test
	public void validLogin() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("7337640208");
	driver.findElement(By.id("pass")).sendKeys("Deepa@8431");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Facebook");
	System.out.println("1");
	
}
}
	
	
