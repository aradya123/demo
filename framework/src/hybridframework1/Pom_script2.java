package hybridframework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script2 {
	@FindBy(name="email")
	private WebElement unTextbox;
	@FindBy(name="password")
	private WebElement pwdTextbox;
	@FindBy(id="loginBtn")
	private WebElement loginbtn;
	@FindBy(className="active")
	private WebElement fvt;
	@FindBy(xpath="//a[.='Women Fit and Flare Purple Dress']")
	private WebElement select;
	public Pom_script2(WebDriver driver)
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
	public void fvrt()
	{
		fvt.click();
	}
	public void select1(String enter)
	{
		select.sendKeys(enter);
	}
	


}


