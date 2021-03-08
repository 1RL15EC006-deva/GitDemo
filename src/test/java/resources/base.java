package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{
   public WebDriver driver;
   
   public Properties prop;
   
   public WebDriver initializeDriver() throws IOException
   {
	   prop = new Properties();
	   
	   FileInputStream fis = new FileInputStream("D:\\deva\\E2EProject\\src\\test\\java\\resources\\data.properties");
	   
	   prop.load(fis);
	   
	   String browserName=prop.getProperty("browser");

	   if(browserName.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\webdriver\\driver1\\chromedriver.exe");
		   
		   driver = new ChromeDriver();
	   }
	   else
	   {
		   System.setProperty("webdriver.firefox.driver","D:\\webdriver\\driver\\geckodriver.exe");
		   
		   driver = new FirefoxDriver();
	   }
	   
	   driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	   
       return driver;
   }
   

}
