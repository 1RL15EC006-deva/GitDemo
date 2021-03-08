package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
  public WebDriver driver;
  
  
  public LoginPage(WebDriver driver) 
  {
	this.driver = driver;
  }
  
  By email = By.id("user_email");
  public WebElement getEmail()
  {
	  return driver.findElement(email);
  }
  
  
  By password = By.name(" password");
  public WebElement getPassword()
  {
	  return driver.findElement(password);
  }
  
  
  By login = By.name("commit");
  public WebElement getLogin()
  {
	  return driver.findElement(login);
  }
   
}
