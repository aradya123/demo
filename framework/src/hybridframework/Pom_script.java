package hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script {
	@FindBy(name="email")
	private WebElement unTextbox;
	@FindBy(name="pass")
	private WebElement pwdTextbox;
	@FindBy(name="login")
	private WebElement loginbtn;
	public Pom_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void unData(String un)
	{
		unTextbox.sendKeys(un);
	}
	public void pwdData(String pwd)
	{
		pwdTextbox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}


}



