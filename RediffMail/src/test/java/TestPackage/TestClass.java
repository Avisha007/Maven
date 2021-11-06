package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.HomePage;
import PomPackage.LoginButton;
import PomPackage.SignInPage;


public class TestClass extends BaseClass
{	
	WebDriver driver;
	HomePage home;
	LoginButton log;
	SignInPage Page;
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = OpenChromeBrowser();
		}
		
		else
		{
			driver = OpenFireFoxBrowser();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		Thread.sleep(3000);
	}
	
	@BeforeClass
	public void PomClassObj() 
	{
		log = new LoginButton(driver);
		home = new HomePage(driver);
		Page = new SignInPage(driver);
	}
	
	@BeforeMethod
	public void loginToMail()
	{
		log.Sign();
		Page.sendusername();
		Page.sendpwd();
		Page.clicksignin();
	}
	
	@Test
	public void verifyHomePage()
	{
			String text = home.getLogIntext();
			System.out.println(text);
			if(text.equals("rediff.com"))
				System.out.println("Pass");
			else
				System.out.println("Fail");
			
	}
	
	@AfterMethod
	public void logOutFromMail() throws InterruptedException
	{
		Thread.sleep(3000);
		home.Logout();
	}
	
	@AfterClass
	public void clearPom()
	{
		home = null;
		log = null;
		Page = null;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
		System.gc();
	}
	
	
}
