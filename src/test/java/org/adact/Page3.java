package org.adact;



import org.browser.BrowserLaunch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Page3 extends BrowserLaunch {
	public Page3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement location;
	
	@FindBy(id="continue")
	private WebElement hotel;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}
	public void searchhotel() {
	

		
		
	}
	
		
		
		
		
		

	}

	
	
