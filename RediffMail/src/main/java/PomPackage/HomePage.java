package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath=("//a[text()='rediff.com']"))
	private WebElement text;
	
	@ FindBy(xpath= "//a[@class='rd_logout']")
	private WebElement logout;
	
	
	
	//Data add in element by constructor
		public HomePage (WebDriver driver1)
			{
				PageFactory.initElements(driver1, this);
			}
	
	public String getLogIntext()
	{
		String gtext = text.getText();
		return gtext;
	}
	
	
		
	public void Logout()
	{
		logout.click();
	}
}
