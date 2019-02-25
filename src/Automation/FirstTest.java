package Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.FeedsPage;
import PageObject.LoginPage;

public class FirstTest extends FunctionalTest{
	 
//@Test(dataProvider="InputData", priority=1)
public void feedsTest(String userName,String password,String URL) throws InterruptedException  {
	
	  WebDriverWait wait = new WebDriverWait(webdriver, 60);
	  JavascriptExecutor jse = (JavascriptExecutor)webdriver;
	  	 		
	  LoginPage loginPage = new LoginPage(webdriver);
	  
	  System.out.println("Testing Invalid Login");
	  loginPage.InvalidloginApplication(webdriver, userName, password, URL);
	  Assert.assertTrue(webdriver.getPageSource().contains("Your account or password is incorrect. If you don't remember your password"), "InvalidLogin");
	  Thread.sleep(2000);
	  System.out.println("Testing Valid Login");
	  loginPage.loginApplication(webdriver, userName, password,URL);
	  	 
	  FeedsPage feedsPage = new FeedsPage(webdriver);
	  wait.until(ExpectedConditions.elementToBeClickable(feedsPage.postUpdateButton()));
	  feedsPage.CloseIconButton().click();
	  System.out.println("Creating Post");
	  feedsPage.createPost(webdriver);	
	  System.out.println("Editing Post");
	  feedsPage.EditPost(webdriver);
	  
      Thread.sleep(4000);
	  feedsPage.iconforED().get(2).click();	
	  Thread.sleep(2000);
	  feedsPage.ViewEditHistory().get(2).click();
	  Thread.sleep(2000);
	  feedsPage.CloseButton().click();  
	  System.out.println("Commenting Post");
	  feedsPage.CommentLink().click();
	  Thread.sleep(2000);
	  feedsPage.CommentTextBox().sendKeys("Posting Comment for Automation testing " + Keys.ENTER);	  
	  feedsPage.ReplyCommentLink().click();
	  Thread.sleep(4000);
	  
	  System.out.println("Liking Post");
	  feedsPage.LikePost().click();
	  Thread.sleep(2000);
	  feedsPage.LikePost().click();
	  Thread.sleep(2000);
	  feedsPage.LikesCloseButton().click(); 
	  
	  jse.executeScript("arguments[0].scrollIntoView(true);", feedsPage.postUpdateButton());
	  System.out.println("Deleting Post");
	  feedsPage.DeletePost(webdriver); 
	  Thread.sleep(3000);
	  System.out.println("Closig the browser and session");
	  webdriver.quit();
	  
    	  
	  
   }    
   
@Test(dataProvider="InputData", priority=2)
public void feedsPollTest(String userName,String password,String URL) throws InterruptedException   {
	 
	  JavascriptExecutor jse = (JavascriptExecutor)webdriver;
	  WebDriverWait wait = new WebDriverWait(webdriver, 90);
	  
	  LoginPage loginPage = new LoginPage(webdriver);		  
	  loginPage.loginApplication(webdriver, userName, password,URL);	
	  FeedsPage feedsPage = new FeedsPage(webdriver);	
	  wait.until(ExpectedConditions.elementToBeClickable(feedsPage.postUpdateButton()));
	  feedsPage.CloseIconButton().click();
	  System.out.println("Creating Poll");
	  feedsPage.createPoll(webdriver);	  
	  jse.executeScript("arguments[0].scrollIntoView(true);", feedsPage.postUpdateButton());
	  Thread.sleep(5000);
	  System.out.println("Deleting Poll");
	  feedsPage.DeletePoll(webdriver);
	  Thread.sleep(3000);
	  System.out.println("Closig the browser and session");
	  webdriver.quit();
	  
   }  

}
