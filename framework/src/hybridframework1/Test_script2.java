package hybridframework1;

import org.testng.annotations.Test;

public class Test_script2 extends  Generic_script {
	@Test
	public void validLogin() throws InterruptedException{
		Pom_script2 p=new Pom_script2(driver);
        p.unData("deepasavi987@gmail.com");
        Thread.sleep(2000);
        p.pwdData("Deepa@8431");
        Thread.sleep(2000);
        p.clickLogin();
        Thread.sleep(2000);
         p.fvrt();
         Thread.sleep(2000);
         p.select1("Women Fit and Flare Purple Dress");
	}


}
