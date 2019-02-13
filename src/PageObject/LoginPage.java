package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ObjectPage {

	@FindBy(id="username")
	WebElement userNameTextBox;
	
	@FindBy(id="checkButton")
	WebElement nextButton;
	
	@FindBy(id="i0118")
	WebElement passwordTextBox;
	
	@FindBy(id="idSIButton9")
	WebElement signInButton;
	
	
	public LoginPage(WebDriver webdriver)
	{
	super(webdriver);
	}	
	public WebElement userNameTextBox()
	{
		return userNameTextBox;
	}
	public WebElement nextButton()
	{
		return nextButton;
	}
	public WebElement passwordTextBox()
	{
		return passwordTextBox;
	}
	public WebElement signInButton()
	{
		return signInButton;
	}
	
	
	public void loginApplication(WebDriver webdriver,String userName,String password) {
		
	   userNameTextBox().sendKeys(userName);
	   nextButton().click();	  	    	
	   webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   passwordTextBox().sendKeys(password);
	   signInButton().click();
	   signInButton().click();
		  
	   
	}
	
	
}
