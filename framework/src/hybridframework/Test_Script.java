package hybridframework;

import org.testng.annotations.Test;

import pom_script.Pom_script;

public class Test_Script extends  Generic_Script  {
	@Test
	public void validLogin() throws InterruptedException
	{
		Pom_script p=new Pom_script(driver);
        p.unData("7337640208");
        Thread.sleep(2000);
        p.pwdData("Deepa@8431");
        Thread.sleep(2000);
        p.clickLogin();
	}
        

}


