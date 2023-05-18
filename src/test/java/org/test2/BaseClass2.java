package org.test2;

import org.browser.BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass2 extends BrowserLaunch {
	public static void main(String[] args) {

		BaseClass2 cl = new BaseClass2();
		cl.getDriver("chrome");
		cl.launch("https://www.facebook.com/");
		// locators
		WebElement username = driver.findElement(By.id("email"));
		cl.typetext(username, "Naveen");

		WebElement password = driver.findElement(By.id("pass"));
		cl.typetext(password, "Naveen@123");

		//WebElement loginbtn = driver.findElement(By.name("login"));

		//cl.click(loginbtn);
		WebElement gettext = driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/div[1]/h2"));
		cl.gettext(gettext);
		
		System.out.println(gettext);
		
		
		// Actions

		
	}

}
