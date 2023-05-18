package org.adact;

import org.browser.BrowserLaunch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adact extends BrowserLaunch {
	public Adact() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void Adactin(String username,String password) {
		WebElement username2 = getUsername();
		typetext(username2, username);
		
		WebElement password2 = getPassword();
		
		typetext(password2, password);
		
		WebElement login2 = getLogin();
		click(login2);
		
	
	}
}
