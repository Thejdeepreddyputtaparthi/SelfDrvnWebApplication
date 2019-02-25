package PageObject;

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
	
	
	public void loginApplication(WebDriver webdriver,String userName,String password,String URL) throws InterruptedException {
		
	   webdriver.get(URL);	
	   userNameTextBox().sendKeys(userName);
	   nextButton().click();	  	    	
	   Thread.sleep(3000);
	   passwordTextBox().sendKeys(password);
	   signInButton().click();
	   signInButton().click();
	   Thread.sleep(5000);  
	   
	}
	
	public void InvalidloginApplication(WebDriver webdriver,String userName,String password,String URL) throws InterruptedException {
		
		   webdriver.get(URL);	
		   userNameTextBox().sendKeys("test123@nettium.net");
		   nextButton().click();
		   Thread.sleep(3000);
		   passwordTextBox().sendKeys(password);
		   signInButton().click();
		    	   
		}
}
