package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginButton 
{
	@ FindBy(xpath="//a[text()='Sign in']")
	private WebElement signIn;
	
	public LoginButton (WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void Sign()
	{
		signIn.click();
	}
}
