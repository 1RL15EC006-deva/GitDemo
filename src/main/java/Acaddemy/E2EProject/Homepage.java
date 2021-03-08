package Acaddemy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.LandingPage;
import Pageobject.LoginPage;
import resources.base;

public class Homepage extends base
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
			
			LandingPage land = new LandingPage(driver);
				
			land.getlogin().click();
	  }
	  
	  @Test(dataProvider="getData")
	  public void baseUril(String email,String password) throws IOException
	  {
          LoginPage login = new LoginPage(driver);
    
		  login.getEmail().sendKeys(email);
    
		  login.getPassword().sendKeys(password);
    
		  login.getLogin().click();
	  }
	  
	  
  
	  @DataProvider
	  public Object[][] getData()
	  {
		  Object[][] data = new Object[2][2];
	  
		  data[0][0]="abc@gamil.com";
		  data[0][1]="1234";
	  
		  data[1][0]="aaa@gmail.com";
		  data[1][1]="12345"; 
	  
		  return data;
	  }
	  
	  @AfterTest
	  public void closeURL()
	  {
		  driver.close();
	  }
}
