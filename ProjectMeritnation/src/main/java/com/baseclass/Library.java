package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;

public class Library {
	
	protected  WebDriver driver;
	//Launch Browser
	public  WebDriver LaunchBrowser(String browser , String url)
	{
		String base_path = "C:\\Users\\SRAAWYA CH\\eclipse-workspace\\ProjectMeritnation\\src\\test\\resources\\Drivers\\";
		
		switch(browser)
		{
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", base_path+"chromedriver.exe");
				driver = new ChromeDriver(options);
				break;
				
			case "firefox":
				System.setProperty("webdriver.gecko.driver", base_path+"geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			default:
				System.out.println("Supports only Chrome or Firefox browser");
				break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		return driver;
	}
	
	//Sleep
	public void sleep(int time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//close_browser
	public void browser_close()
	{
		this.sleep(2000);
		driver.close();
	}
	
	
	//Logger
	/*public static Logger log;	
	public static void logger(String msg)
	{
		log = Logger.getLogger("devpinoyLogger");
		log.info(msg);
	}*/
}
