package org.adact;

import org.browser.BrowserLaunch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 extends BrowserLaunch{
	public  Page5() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_noorder_no")
	private WebElement orderno;
	public WebElement getOrderno() {
		return orderno;
	}
	

	public void orderNo(String data) {
        WebElement orderno2 = getOrderno();
        typetext(orderno2, data);
	}
}
