package hybridframework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script3 {
	@FindBy(name="email")
	private WebElement unTextbox;
	@FindBy(name="password")
	private WebElement pwdTextbox;
	@FindBy(id="loginBtn")
	private WebElement loginbtn;
	@FindBy(xpath="//a[href='http://106.51.87.42:9003/account/close']")
	private WebElement close;
	
	public Pom_Script3(WebDriver driver)
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
	public void clickLogout()
	{
		close.click();
	}

}


