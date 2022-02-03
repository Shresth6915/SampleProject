package com.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import com.data.Constants;

public class ConnectionDriver {
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void initConnection()
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\"+ "jars\\chromedriver.exe");
	driver = new ChromeDriver();  
    driver.get(Constants.BASE_URL);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void close()
	{
    driver.quit();
	}

}
