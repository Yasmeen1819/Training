package com.swaglabs.pageobjects;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.swaglabs.base.Baseclass;
import com.swaglabs.base.Baseclass;



public class Loginpage extends Baseclass {



public WebDriver driver;


By username=By.cssSelector("[id='user-name']");
By password=By.cssSelector("[id='password']");
By login=By.cssSelector("[id='login-button']");
public Loginpage(WebDriver driver){
// TODO Auto-generated constructor stub
this.driver=driver;


}
public WebElement getUsername()
{
return driver.findElement(username);
}

public WebElement getPassword()
{
return driver.findElement(password);
}
public WebElement getLogin()
{

return driver.findElement(login);
}
}
/*@AfterTest
public void teardown()
{
driver.close();
}
}*/
	

