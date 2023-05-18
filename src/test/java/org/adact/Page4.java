package org.adact;

import org.browser.BrowserLaunch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends BrowserLaunch {
	public Page4() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "first_name"), @FindBy(id = "default") })
	private WebElement firstname;
	

	@FindAll({ @FindBy(id = "last_name"), @FindBy(id = "default") })
	private WebElement lastname;
	
	@FindAll({ @FindBy(id = "address"), @FindBy(id = "default") })
	private WebElement address;

	@FindAll({ @FindBy(id = "cc_num"), @FindBy(id = "default") })
	private WebElement creditcard;
	@FindAll({ @FindBy(id = "cc_type"), @FindBy(id = "default") })
	private WebElement creditcardtype;
	
	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(id = "default") })
	private WebElement month;
	
	@FindAll({ @FindBy(id = "cc_exp_year"), @FindBy(id = "default") })
	private WebElement year;
	
	@FindAll({ @FindBy(id = "cc_cvv"), @FindBy(id = "default") })
	private WebElement cvvnumber;
	
	@FindAll({ @FindBy(id = "book_now"), @FindBy(id = "default") })
	private WebElement Booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return Booknow;
	}
	public void BookHotel(String data, String data2, String add, String number, String type, String mon, String date, String cvno) {
		
		WebElement firstname2 = getFirstname();
		typetext(firstname2, data);
		
		WebElement lastname2 = getLastname();
		typetext(lastname2, data2);
		
		WebElement address2 = getAddress();
		typetext(address2, add);
		
		WebElement creditcard2 = getCreditcard();
		typetext(creditcard2, number);
		
		WebElement creditcardtype2 = getCreditcardtype();
		selectbyvalue(creditcardtype2, type); 
		
		WebElement month2 = getMonth();
		selectbyvalue(month2, mon);
		
		WebElement year2 = getYear();
		selectbyvalue(year2, date);
		
		WebElement cvvnumber2 = getCvvnumber();
		typetext(cvvnumber2, cvno);
		
		WebElement booknow2 = getBooknow();
		click(booknow2);
		

	}
}
