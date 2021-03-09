package Acaddemy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.LandingPage;
import resources.base;

public class validaTile extends base
{
	 public WebDriver driver;
  @BeforeTest
  public void openURL() throws IOException
  {
		driver = initializeDriver();
		
		String URL = prop.getProperty("url");
		
		System.out.println(URL);
		
		driver.get(URL);
		
		driver.manage().window().maximize();
  }
  
  @Test
  public void baseUril() throws IOException
  {	
	  	LandingPage land = new LandingPage(driver);
	
	  	String title = land.getTitle().getText();
	  	
	  	System.out.println("devanand");
	  	
	  	System.out.println("devanand");
	
	  	Assert.assertEquals(title,"FEATUREDs COURSES");
  }
  
  @AfterTest
  public void closeURL()
  {
		driver.close();
  }
  
}
