package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
	@ FindBy(xpath = "//input[@id='login1']")
	private WebElement userN;
	
	@ FindBy(xpath = "//input[@id='password']")
	private WebElement pwd;
	
	@ FindBy(xpath = "//input[@type='submit']")
	private WebElement signIn;
	
	
	
	public SignInPage (WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void sendusername()
	{
		userN.sendKeys("gupta.avisha@rediffmail.com");
	}
	
	public void sendpwd()
	{
		pwd.sendKeys("Ahsvia@123");
	}
	
	public void clicksignin()
	{
		signIn.click();
	}
}
