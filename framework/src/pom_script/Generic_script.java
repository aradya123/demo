package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generic_script {
	@FindBy(name="login")
	private WebElement loginbtn;
	public Generic_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickLogin()
	{
		loginbtn.click();
	}

}
