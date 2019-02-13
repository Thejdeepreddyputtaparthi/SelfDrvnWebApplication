package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ObjectPage {
	    
		WebDriver driver;
			public ObjectPage(WebDriver webdriver)
			{
				this.driver=driver;
				PageFactory.initElements(webdriver,this);
			}

		}

