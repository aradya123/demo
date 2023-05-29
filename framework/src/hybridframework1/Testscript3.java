package hybridframework1;

import org.testng.annotations.Test;

public class Testscript3  extends  Generic_script {
	@Test
	public void validLogin() throws InterruptedException{
		Pom_Script3 p=new Pom_Script3(driver);
        p.unData("deepasavi987@gmail.com");
        Thread.sleep(2000);
        p.pwdData("Deepa@8431");
        Thread.sleep(2000);
        p.clickLogin();
        Thread.sleep(2000);
        p.clickLogout();	
        
        
	}

}
