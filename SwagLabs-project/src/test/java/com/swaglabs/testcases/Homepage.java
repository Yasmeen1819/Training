package com.swaglabs.testcases;


import java.io.IOException;import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.swaglabs.base.Baseclass;
import com.swaglabs.pageobjects.Loginpage;
public class Homepage extends Baseclass {
/*@BeforeTest()
public void initialize() throws IOException
{
driver=initializeDriver();
driver.get("https://www.saucedemo.com/");
}*/
@Test(dataProvider="getdata")
public void basepagenavigation(String username, String password) throws IOException
{
driver=initializeDriver();
driver.get("https://www.saucedemo.com/");
Loginpage Lp=new Loginpage(driver);
Lp.getUsername().sendKeys(username);
Lp.getPassword().sendKeys(password);
Lp.getLogin().click();
}@DataProvider
public Object[][] getdata()
{
Object[][] data= new Object[4][2];
data[0][0]="standard_user";
data[0][1]="secret_sauce";
//data[0][2]="resricted user";
data[1][0]="locked_out_user";
data[1][1]="secret_sauce";
data[2][0]="problem_user";
data[2][1]="secret_sauce";
data[3][0]="performance_glitch_user";
data[3][1]="secret_sauce";
return data;
}/*@AfterMethod()
public void teardown()
{
driver.close();
}
*/
@AfterTest
public void teardown()
{
driver.close();
}
}

