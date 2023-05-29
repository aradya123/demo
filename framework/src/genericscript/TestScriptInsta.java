package genericscript;

import org.openqa.selenium.By;

public class TestScriptInsta extends InstagramGeneric
{
	
		public void validLogin() throws InterruptedException
		{
		driver.findElement(By.name("username")).sendKeys("deepasavi987gmail.com");
		driver.findElement(By.name("password")).sendKeys("Deepa@8431");
		driver.findElement(By.xpath("//div[.='Log in']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
	}
		
		


