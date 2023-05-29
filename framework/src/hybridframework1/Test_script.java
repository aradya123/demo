package hybridframework1;

import org.testng.annotations.Test;

import hybridframework.Pom_script1;

public class Test_script extends  Generic_script {
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
