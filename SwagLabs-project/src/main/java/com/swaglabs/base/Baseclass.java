package com.swaglabs.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver()throws IOException
	{
	prop= new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\taj\\eclipse-workspace\\Training\\Selenium-project\\src\\main\\java\\com\\Selenium\\base\\data.properties");

	prop.load(fis);
	String browserName= prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\taj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{

	System.setProperty("webdriver.gecko.driver","C:\\Users\\taj\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");

	driver= new FirefoxDriver();
	}
	else if(browserName.equals("IE"))
	{
	System.setProperty("wedriver.Internet.explorer","C:\\Users\\taj\\Downloads\\IEDriverServer_Win32_4.2.0\\IEdriver.exe");

	driver= new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	return driver;




	}
	}



