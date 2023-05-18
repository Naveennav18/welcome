package org.login;

import org.openqa.selenium.WebElement;
import org.test2.BaseClass2;

public class BrowserLaunch1 extends BaseClass2 {

	public static void main(String[] args) {
		
		BaseClass2 b= new BaseClass2();
		b.getDriver("chrome");
		b.launch("https://www.facebook.com/");
		
		LoginPage page=new LoginPage();
		WebElement txtusername = page.getTxtusername();
		b.typetext(txtusername, "welcome");
		
		
		WebElement txtpassword = page.getTxtpassword();
		b.typetext(txtpassword, "Hello Java");
		
		WebElement btnlogin = page.getBtnlogin();
		b.click(btnlogin);
		

	}

}
