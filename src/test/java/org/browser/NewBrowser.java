package org.browser;
	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class NewBrowser {

		static WebDriver driver;

		// Browser Launch

		public void getDriver(String browserName) {

			switch (browserName) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("Invlaid Browser Name");
				break;
			}

			driver.manage().window().maximize();

		}

		// Launch url

		public void launchUrl(String url) {
			driver.get(url);
		}

		// navigate url
		public void navigateUrl(String url) {
			driver.navigate().to(url);
		}

		// backward
		public void backword() {
			driver.navigate().back();
		}

		// forward
		public void forward() {
			driver.navigate().forward();
		}

		// refresh
		public void refresh() {
			driver.navigate().refresh();
		}

		// close all window

		public void closeCurrentWindow() {
			driver.close();
		}

		// quit all window

		public void closeAllWindow() {
			driver.quit();
		}

		// for find by locators

		public WebElement findElementByLocators(String locator, String value) {
			WebElement element = null;
			switch (locator) {
			case "id":
				element = driver.findElement(By.id(value));
				break;

			case "name":
				element = driver.findElement(By.name(value));
				break;
			case "xpath":
				element = driver.findElement(By.xpath(value));
				break;
			default:
				break;
			}

			return element;
		}

		// for find by id

		public WebElement findById(String id) {
			WebElement element = driver.findElement(By.id(id));
			return element;
		}
		// for find by name

		public WebElement findByName(String name) {
			WebElement element = driver.findElement(By.name(name));

			return element;
		}

		// for find by class

		public WebElement findByClass(String className) {
			WebElement element = driver.findElement(By.className(className));
			return element;
		}

		// for find by xpath

		public WebElement findByXpath(String xpath) {
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}

		// find by tagname

		public List<WebElement> findByTagName(String tagName) {
			List<WebElement> element = driver.findElements(By.tagName(tagName));
			return element;
		}

		// for sendkeys()

		public void typeText(WebElement element, String data) {
			element.sendKeys(data);
		}

		// btnClick
		public void btnClick(WebElement element) {
			element.click();
		}

		// clear

		public void clear(WebElement element) {
			element.clear();

		}

		// mousehoverAction
		public void mouseHover(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
			;

		}

		// Right Click
		public void rightClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).perform();

		}

		// doubleClick
		public void doubleClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).perform();

		}

		// draganddrop
		public void dragandDrop(WebElement srce, WebElement trgt) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(srce, trgt).perform();
		}

		// for capital letters

		public void capitalLetter(WebElement element, String Data) {
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.SHIFT).sendKeys(element, Data).keyUp(Keys.SHIFT).perform();
		}

		// Robot action

		// send keys enter

		public void robotSendKeysEnter(WebElement element, String text) {

			element.sendKeys(text, Keys.ENTER);
		}

		// robot class enter action

		public void robotClassEnter() throws AWTException {

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

		// robot class down

		public void robotClassDown() throws AWTException {
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

		}

		// Alert
		// accept

		public void alertAccept() {
			driver.switchTo().alert().accept();
		}

		// dismiss

		public void alertDismiss() {
			driver.switchTo().alert().dismiss();

		}

		// alert sendkeys

		public void alertSendKeys(String text) {
			driver.switchTo().alert().sendKeys(text);
		}

		// alert gettext

		public String alertBoxText() {
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
			return text;
		}

		// gettext

		public String getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
			String String = null;
			return String;

		}

		// getAttribute

		public String getAttri(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
			String String = null;
			return String;
		}

		// Javascript
		// sending txtvalue

		public Object sendingTextJs(String data, WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		}

		// gettingtext value

		public String gettingTextJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
			String text = (String) executeScript;
			System.out.println(text);

			String String = null;
			return String;
		}

		// buttonclick

		public Object buttonClickJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click()", element);
		}

		// scrollup

		public Object scrollUpJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].scrollIntoView(false)", element);

		}

		// scrolldown

		public Object scrollDownJs(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].scrollIntoView(true)", element);
		}

		// takesscreenshot

		public File screenShot(String Filename) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

			File file = new File("C:\\Users\\HP\\Pictures\\Saved Pictures\\" + Filename + ".jpg");

			FileUtils.copyFile(screenshotAs, file);

			return file;
		}

		// dropdowns
		// select
		// selectdropdown

		public void selectDropDown(WebElement element, String data, String value) {
			Select se = new Select(element);

			switch (data) {
			case "value":
				se.selectByValue(value);
				break;
			case "text":
				se.selectByVisibleText(value);
				break;
			case "index":
				se.selectByIndex(Integer.parseInt(value));
				break;
			default:
				break;

			}
		}

		public void byvisibleText(WebElement element, String text) {

			Select se = new Select(element);

			se.selectByVisibleText(text);
		}

		public void byname(WebElement element, String value) {
			Select se = new Select(element);

			se.selectByValue(value);
		}

		public void byindex(WebElement element, int index) {
			Select se = new Select(element);
			se.selectByIndex(index);

		}

		public String firstSelectedOptionDropDown(WebElement element) {
			Select se = new Select(element);
			WebElement firstSelectedOption = se.getFirstSelectedOption();
			String attribute = firstSelectedOption.getAttribute("value");
			System.out.println(attribute);
			String String = null;
			return String;

		}

		public void deselectall(WebElement element) {
			Select se = new Select(element);
			se.deselectAll();
		}

		public String getOptionsDropDown(WebElement element) {

			Select se = new Select(element);
			String String = null;

			List<WebElement> options = se.getOptions();

			for (int i = 0; i < options.size(); i++) {
				WebElement element1 = options.get(i);
				String text = element1.getText();
				se.selectByVisibleText(text);
				System.out.println(text);
			}
			return String;

		}

		public String allSelectedOoptionsDropDown(WebElement element) {
			Select se = new Select(element);
			List<WebElement> allSelectedOptions = se.getAllSelectedOptions();

			for (WebElement ele : allSelectedOptions) {
				String text = ele.getText();
				System.out.println(text);
			}
			String String = null;

			return String;

		}

		public boolean multiple(WebElement element) {
			Select se = new Select(element);
			return se.isMultiple();

		}

		public void deselectbyindex(WebElement element, int index) {
			Select se = new Select(element);
			se.deselectByIndex(index);
		}

		public void deselectbyvalue(WebElement element, String value) {
			Select se = new Select(element);
			se.deselectByValue(value);

		}

		public void deselectbytext(WebElement element, String text) {
			Select se = new Select(element);
			se.deselectByVisibleText(text);

		}

		// Windowshandling

		// get parent window id

		public String prntWinId() {

			String prntWinId = driver.getWindowHandle();
			System.out.println(prntWinId);
			String String = null;
			return String;
		}

		// get all windows id

		public String allWinId() {

			Set<String> allwinid = driver.getWindowHandles();
			System.out.println(allwinid);
			String String = null;
			return String;

		}

		public void switchToCurrentWindow() {

			String prntWinId = driver.getWindowHandle();
			System.out.println(prntWinId);

			Set<String> allwinid = driver.getWindowHandles();
			System.out.println(allwinid);

			for (String win : allwinid) {

				if (!prntWinId.equals(win)) {
					driver.switchTo().window(win);
				}

			}

		}

	}

