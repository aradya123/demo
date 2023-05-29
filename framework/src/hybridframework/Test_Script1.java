package hybridframework;

import org.testng.annotations.Test;

public class Test_Script1 extends  Generic_Script1  {
	@Test
	public void validLogin() throws InterruptedException{
		Pom_script1 p=new Pom_script1(driver);
        p.unData("deepasavi987@gmail.com");
        Thread.sleep(2000);
        p.pwdData("Deepa@8431");
        Thread.sleep(2000);
        p.clickLogin();
	}
}