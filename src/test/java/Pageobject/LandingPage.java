package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
  public WebDriver driver;
  
  
public LandingPage(WebDriver driver) 
{
	this.driver=driver;
}

By Login = By.xpath("//span[text()='Login']");

public WebElement getlogin() 
{
	// TODO Auto-generated method stub
	return driver.findElement(Login);
}

  By title = By.xpath("//h2[text()='Featured Courses']");
  
  public WebElement getTitle()
  {
	  return driver.findElement(title);
  }

}
