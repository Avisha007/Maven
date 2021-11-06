package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver OpenFireFoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\New folder\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
