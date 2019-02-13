package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import PageObject.FeedsPage;
import PageObject.LoginPage;

public class FirstTest extends FunctionalTest{
		   
	    
@Test(dataProvider="InputData")
public void feedsTest(String userName,String password)
   {
	  	
	  webdriver.get("https://selfdrvn-web-staging.azurewebsites.net");	   
	 		
	  LoginPage loginPage = new LoginPage(webdriver);	
	  
/*	  loginPage.userNameTextBox().sendKeys(userName);
	  loginPage.nextButton().click();	  	    	
	  webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  loginPage.passwordTextBox().sendKeys(password);
	  loginPage.signInButton().click();
	  loginPage.signInButton().click();  */
	  
	  loginPage.loginApplication(webdriver, userName, password);
	  	 
	  FeedsPage feedsPage = new FeedsPage(webdriver);
	  WebDriverWait wait = new WebDriverWait(webdriver, 60);
	  wait.until(ExpectedConditions.elementToBeClickable(feedsPage.postTextBox()));
	  Actions actions = new Actions(webdriver);
	  actions.moveToElement(feedsPage.postTextBox());
	  actions.click();
	  actions.sendKeys("This is testing Feeds  for Selenium Automation for applications  "+ "https://selfdrvn.com");
	  actions.build().perform();
	  feedsPage.postUpdateButton().click();
	  wait.until(ExpectedConditions.elementToBeClickable(feedsPage.postUpdateButton()));
	  
	  feedsPage.iconforED().get(2).click();
	  webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  feedsPage.editPost().get(4).click();
	  
	  actions.moveToElement(feedsPage.postText().get(1));
	  actions.click();
	  actions.sendKeys("  Selenium Automation for applications");
	  actions.build().perform();
	  
	  feedsPage.EditDoneButton().click();
	  
	  
   }
   


}
