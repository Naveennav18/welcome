package org.adact;

import org.browser.BrowserLaunch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends BrowserLaunch {
	public Page2() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "location"), @FindBy(xpath = "pass") })
	private WebElement ddnLocation;

	@FindAll({ @FindBy(id = "hotels"), @FindBy(xpath = "hot") })
	private WebElement ddnhotel;

	@FindAll({ @FindBy(id = "room_type"), @FindBy(xpath = "room") })
	private WebElement ddnroomtype;

	@FindAll({ @FindBy(id = "room_nos"), @FindBy(xpath = "room") })
	private WebElement ddnroomnos;

	@FindAll({ @FindBy(id = "datepick_in"), @FindBy(xpath = "date") })
	private WebElement ddncheckin;

	@FindAll({ @FindBy(id = "datepick_out"), @FindBy(xpath = "default") })
	private WebElement ddncheckout;

	@FindAll({ @FindBy(id = "adult_room"), @FindBy(xpath = "default") })
	private WebElement ddnadultroom;

	@FindAll({ @FindBy(id = "child_room"), @FindBy(xpath = "default") })
	private WebElement ddnchildroom;

	@FindAll({ @FindBy(id = "Submit"), @FindBy(xpath = "default") })
	private WebElement ddnsearch;

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnhotel() {
		return ddnhotel;
	}

	public WebElement getDdnroomtype() {
		return ddnroomtype;
	}

	public WebElement getDdnroomnos() {
		return ddnroomnos;
	}

	public WebElement getDdncheckin() {
		return ddncheckin;
	}

	public WebElement getDdncheckout() {
		return ddncheckout;
	}

	public WebElement getDdnadultroom() {
		return ddnadultroom;
	}

	public WebElement getDdnchildroom() {
		return ddnchildroom;
	}

	public WebElement getDdnsearch() {
		return ddnsearch;
	}

	public void searchPage(String value, String value1, String value2, String value3, String value4, String value5, String data, String data1) {
		

		WebElement ddnLocation2 = getDdnLocation();
		selectbyvalue(ddnLocation2, value);

		WebElement ddnhotel2 = getDdnhotel();
		selectbyvalue(ddnhotel2, value1);
		
		WebElement ddnroomtype2 = getDdnroomtype();
		selectbyvalue(ddnroomtype2, value2);
		
		WebElement ddnroomnos2 = getDdnroomnos();
		selectbyvalue(ddnroomnos2, value3);
		
		WebElement ddnadultroom2 = getDdnadultroom();
		selectbyvalue(ddnadultroom2, value4);
		
		WebElement ddnchildroom2 = getDdnchildroom();
		selectbyvalue(ddnchildroom2, value5);
		
		WebElement ddncheckin2 = getDdncheckin();
		typetext(ddncheckin2, data);
		
		WebElement ddncheckout2 = getDdncheckout();
		typetext(ddncheckout2, data1);
		
		WebElement ddnsearch2 = getDdnsearch();
		click(ddnsearch2);
		
		
	}

}
