package org.browser;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static  WebDriver driver;
	Actions acc;
	Alert al;
	//Select se;
	

	// browser launch
	public void getDriver(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser launch");
			break;
		}
		driver.manage().window().maximize();
	}
//launch url
	public void launch(String url) {
		driver.get(url);
		


	}	
//sendkeys
	public void typetext(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	//click
	public void click(WebElement element) {
		element.click();
		

	}
	//gettext
	public void gettext(WebElement element) {
		element.getText();
	
	}
	//getattribute
	public void getattribute(WebElement element,String data) {
		element.getAttribute(data);
		
	}
	//close
	public void close() {
		driver.close();
			
}
	//quit
	public void quit() {
		driver.quit();
		

	}
	//Actions
	//right click or context click
    public void rightclick() {
		acc.contextClick();

	}
	//double click
    public void doubleclick() {
    	acc.doubleClick();
		

	}
    public void doublicclickref(WebElement target) {
    	acc.doubleClick(target);
   
		

	}
    

		

	
//drag and drop
    public void draganddrop(WebElement ele1,WebElement ele2) {
    	acc.dragAndDrop(ele1, ele2);
	

	}
   
	//alert
    //accept
    public void accept() {
    	al.accept();

	}
    //dismiss
    public void dismiss() {
    	al.dismiss();
		
	}
    //sendkeys
    public void sendkeys(String data) {
    	al.sendKeys(data);
		
	}
   
    //select
    public void vissibletext( WebElement element,String text) {
    	Select se = new Select(element);
		se.selectByVisibleText(text);
	}
		
    public void selectbyvalue(WebElement element,String value) {
    	Select se = new Select(element);
		se.selectByValue(value);

	}
    public void selectbyindex(WebElement element,int index) {
    	Select se = new Select(element);
		se.selectByIndex(index);

	}
    
    public List<WebElement> getoption(WebElement element) {
    	Select se = new Select(element);
	   List<WebElement> options = se.getOptions(); 
	   return options;

	}
	
    public void firstselectedoption(WebElement element) {
    	Select se = new Select(element);
		se.getFirstSelectedOption();

	}
    	public void allselectedoption(WebElement element) {
    		Select se = new Select(element);
			se.getAllSelectedOptions();

		}
		
       public void ismultiple(WebElement element) {
    	   Select se = new Select(element);
		se.isMultiple();

	}
       public void deselectbyindex(WebElement element,int index) {
    	   Select se = new Select(element);
		se.deselectByIndex(index);

	} 
       public void deselectbyvalue(WebElement element,String value) {
    	   Select se = new Select(element);
		se.deselectByValue(value);

	}
       public void deselectbyvissibletext(WebElement element,String text) {
    	   Select se = new Select(element);
		se.deselectByVisibleText(text);

	}
       
       
	}

	
   
	
	


