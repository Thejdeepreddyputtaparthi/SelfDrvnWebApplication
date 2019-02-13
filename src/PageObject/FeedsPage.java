package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FeedsPage extends ObjectPage {

	@FindBy(css="div > div.ui-editor-content.ql-container.ql-snow")
	WebElement postTextBox;
	
	@FindBy(css="#allfeeds div.status-form-action > div.right button")
	WebElement postUpdateButton;
	
	@FindBy(css="#bs-example-navbar-collapse-1 > ul > li > a > i")
	List<WebElement> iconforED;
	
	@FindBy(css="#bs-example-navbar-collapse-1 > ul > li > ul > li:nth-child(1) > a")
	List<WebElement> editPost;
	
	@FindBy(css="div > div.ui-editor-content.ql-container.ql-snow")
	List<WebElement> postText;
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/edit-post/p-dialog/div/div[2]/div[2]/button[1]")
	WebElement EditDoneButton;
	
	
	
	public FeedsPage(WebDriver webdriver)
	{
	super(webdriver);
	}	
	public WebElement postTextBox()
	{
		return postTextBox;
	}
	public WebElement postUpdateButton()
	{
		return postUpdateButton;
	}
	public List<WebElement> iconforED()
	{
		return iconforED;
	}
	public List<WebElement> editPost()
	{
		return editPost;
	}
	public List<WebElement> postText()
	{
		return postText;
	}
	public WebElement EditDoneButton()
	{
		return EditDoneButton;
	}
	
	
}
