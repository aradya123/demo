package genericscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertclass extends Mainclass {
	@Test
	public void validLogin() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("7337640208");
	driver.findElement(By.id("pass")).sendKeys("Deepa@8431");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title, "Facebook");
	System.out.println("1");
	sa.assertAll();


	}
}
