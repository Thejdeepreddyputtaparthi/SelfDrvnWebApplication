package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FeedsPage extends ObjectPage {
		
	@FindBy(xpath="//img[contains(@src,'/images/close_icon.svg')]")
	WebElement CloseIconButton;
	
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
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li/ul/li[2]/a")
	List<WebElement> ViewEditHistory;
	
	@FindBy(css="#bs-example-navbar-collapse-1  div > button")
	WebElement CloseButton;
	
	@FindBy(css="#feeds > div:nth-child(3) > photo-post > div > div.panel-footer > comment-list > div.comment-panel > div > div.like > a")
	WebElement CommentLink;
	
	@FindBy(css="#feeds > div:nth-child(3) > photo-post > div > div.panel-footer > comment-list > div.comment-main-form.ng-star-inserted > feed-editor > div > p-editor > div > div.ui-editor-content.ql-container.ql-snow > div.ql-editor.ql-blank")
	WebElement CommentTextBox;
	
	@FindBy(css="#feeds > div:nth-child(3) > photo-post > div > div.panel-footer > comment-list > div.comment-panel > div.comment-parent-container.ng-star-inserted > comment-parent > div > ul > li > ul > li > div > div > div.ui > span:nth-child(3) > a")
	WebElement ReplyCommentLink;
	
	@FindBy(css="#feeds > div:nth-child(3) > photo-post > div > div.panel-footer > comment-list > div.comment-panel > div.comment-parent-container.ng-star-inserted > comment-parent > div > ul > li > ul > li > div > div.comment-parent-form.ng-star-inserted > feed-editor > div > p-editor > div > div.ui-editor-content.ql-container.ql-snow > div.ql-editor.ql-blank > p")
	WebElement ReplyCommentTextBox;
	
	@FindBy(css="#feeds > div:nth-child(3) > photo-post > div > div.panel-footer > comment-list > div.comment-panel > div.comment_ui > div.share.ng-star-inserted > ul > li:nth-child(1) > a:nth-child(2) > span")
	WebElement LikePost;
		
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div/div/button")
	WebElement LikesCloseButton;
	
	@FindBy(css="#allfeeds > div > div > div.col-xs-9.ng-star-inserted > createfeed > div > div > div > form > div.status-form-action > div.left > span:nth-child(2) > a")
	WebElement UploadImage;
	
	@FindBy(css="#allfeeds > div > div > div.col-xs-9.ng-star-inserted > createfeed  div.status-form-action > div.left > input:nth-child(5)")
	WebElement UploadImageInput;
	
	@FindBy(css="#allfeeds  div.col-xs-9.ng-star-inserted > createfeed > div > div > div > form > div.status-form-action > div.left > span:nth-child(3) > a > i")
	WebElement CreatePollButton;
	
	@FindBy(css="#EndDate > input")
	WebElement PollEndDateTextBox;
	
	@FindBy(css="#EndDate > div > div > div.datepicker.col-md-6 > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(4)")
	WebElement PollDate;
	
	@FindBy(id="question")
	WebElement QuestionTextBox;
	
	@FindBy(css="div.ui-dialog-content.ui-widget-content  div.createpoll_form > form > div:nth-child(4)  input")
	WebElement Option1TextBox;
	
	@FindBy(css="div.ui-dialog-content.ui-widget-content  div.createpoll_form > form > div:nth-child(5)  input")
	WebElement Option2TextBox;
	
	@FindBy(css="div.ui-dialog-content.ui-widget-content  div.createpoll_form > form > div:nth-child(7) > div:nth-child(3)  button.btn.btn-blue")
	WebElement PostPollButton;
	
	@FindBy(css="#bs-example-navbar-collapse-1 > ul > li > ul > li:nth-child(3) > a")
	List<WebElement> DeletePost;
	
	@FindBy(xpath="/html/body/sd-app/p-confirmdialog/div/div[3]/button[1]/span[2]")
	WebElement ConfirmYesButton;
	
	
	
	public FeedsPage(WebDriver webdriver)
	{
	super(webdriver);
	}	
	public WebElement CloseIconButton()
	{
		return CloseIconButton;
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
	public List<WebElement> ViewEditHistory()
	{
		return ViewEditHistory;
	}
	public WebElement CloseButton()
	{
		return CloseButton;
	}
	public WebElement CommentLink()
	{
		return CommentLink;
	}
	public WebElement CommentTextBox()
	{
		return CommentTextBox;
	}
	public WebElement ReplyCommentLink()
	{
		return ReplyCommentLink;
	}
	public WebElement ReplyCommentTextBox()
	{
		return ReplyCommentTextBox;
	}
	public WebElement LikePost()
	{
		return LikePost;
	}
	public WebElement LikesCloseButton()
	{
		return LikesCloseButton;
	}
	public WebElement UploadImage()
	{
		return UploadImage;
	}
	public WebElement UploadImageInput()
	{
		return UploadImageInput;
	}
	
	public WebElement CreatePollButton()
	{
		return CreatePollButton;
	}
	public WebElement PollEndDateTextBox()
	{
		return PollEndDateTextBox;
	}
	public WebElement PollDate()
	{
		return PollDate;
	}
	public WebElement QuestionTextBox()
	{
		return QuestionTextBox;
	}
	public WebElement Option1TextBox()
	{
		return Option1TextBox;
	}
	public WebElement Option2TextBox()
	{
		return Option2TextBox;
	}
	public WebElement PostPollButton()
	{
		return PostPollButton;
	}
	public List<WebElement> DeletePost()
	{
		return DeletePost;
	}
	public WebElement ConfirmYesButton()
	{
		return ConfirmYesButton;
	}
	
	public void createPost(WebDriver webdriver) throws InterruptedException 	{
		
		  Actions actions = new Actions(webdriver);
		  actions.moveToElement(postTextBox());
		  actions.click();
		  actions.sendKeys("This is testing Feeds  for Selenium Automation for applications  "+ "https://selfdrvn.com");
		  actions.build().perform();
		  UploadImageInput().sendKeys("C:\\Users\\puttaparthi\\Desktop\\Image.png");	  		  
		  postUpdateButton().click();
		  WebDriverWait wait = new WebDriverWait(webdriver, 30);
		  wait.until(ExpectedConditions.elementToBeClickable(postUpdateButton()));	  
		  Thread.sleep(4000);				  
	}
	
	public void EditPost(WebDriver webdriver) throws InterruptedException 	{
		
		  Actions actions = new Actions(webdriver);
		  iconforED().get(2).click();	 
		  Thread.sleep(4000);
		  editPost().get(4).click();	  
		  actions.moveToElement(postText().get(1));
		  actions.click();
		  actions.sendKeys("  Selenium Automation for applications");
		  Thread.sleep(3000);
		  actions.build().perform();	  
		  EditDoneButton().click();	  
		
	}
	
	public void DeletePost(WebDriver webdriver) throws InterruptedException  {
		
		 Thread.sleep(2000);
		 iconforED().get(2).click();
		 Thread.sleep(2000);
		 DeletePost().get(3).click();
		 Thread.sleep(2000);
		 ConfirmYesButton().click();
	}
	
	public void createPoll(WebDriver webdriver) throws InterruptedException 	{
				
		CreatePollButton().click();
		Thread.sleep(5000);
		PollEndDateTextBox().click();
        PollDate().click();
		PollEndDateTextBox().click();
	    Thread.sleep(3000);
		QuestionTextBox().sendKeys("Chose one tool for Automation to develop scripts");
		Option1TextBox().sendKeys("Selnium tool");
		Option2TextBox().sendKeys("QTP Tool");
		PostPollButton().click();		  		
	}
	public void DeletePoll(WebDriver webdriver) throws InterruptedException 	{
		
		 iconforED().get(2).click();
		 //Delete button ( Edit Button WebElement) 
		 Thread.sleep(2000);
		 editPost().get(4).click();
		 Thread.sleep(2000);
		 ConfirmYesButton().click();
				 
	}
	
}

