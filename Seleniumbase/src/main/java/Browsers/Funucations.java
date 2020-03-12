package Browsers;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Funucations extends BrowserSetup {
	ArrayList<String> tabs;

	public void clickElementByXpath(String Xpath, long delayBeforeAction) {
		final WebDriverWait wait = new WebDriverWait(driver, delayBeforeAction);
		final By feelLuckyXpath = By.xpath(Xpath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(feelLuckyXpath)).click();
	}

	public void sendKeysElementByXpath(String Xpath, long delayBeforeAction, String send) {
		final WebDriverWait wait = new WebDriverWait(driver, delayBeforeAction);
		final By feelLuckyXpath = By.xpath(Xpath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(feelLuckyXpath)).sendKeys(send);
	}

	public void clickElementByClassName(String className, long delayBeforeAction) {
		final WebDriverWait wait = new WebDriverWait(driver, delayBeforeAction);
		final By ByClass = By.className(className);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass)).click();
	}

	public void sendKeysElementByClassName(String className, long delayBeforeAction, String send) {
		final WebDriverWait wait = new WebDriverWait(driver, delayBeforeAction);
		final By ByClass = By.className(className);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass)).sendKeys(send);
	}

	public void sendKeystoIframe(String xpath, String send) {
		driver.switchTo().frame(
				driver.findElements(By.tagName("iframe")).get(0));
		new WebDriverWait(driver, 20).until(
		    ExpectedConditions.elementToBeClickable(By
		        .xpath(xpath))).sendKeys(send);
	}
	
	public void clickIframe(String xpath) {
		driver.switchTo().frame(
				driver.findElements(By.tagName("iframe")).get(0));
		new WebDriverWait(driver, 20).until(
		    ExpectedConditions.elementToBeClickable(By
		        .xpath(xpath))).click();
	}
	
	
	public void waitForElementToApeearByXpath(String xpath , long delayBeforeAction) {
		final WebDriverWait wait = new WebDriverWait(driver, delayBeforeAction);
		final By ByClass = By.xpath(xpath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass));
	}
	
	public WebDriver openNewTab() {
		((JavascriptExecutor) driver).executeScript("window.open('about:blank', '-blank')");
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return driver;
	}

	public WebDriver zoomOut(int scrollOutBy) {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0," + scrollOutBy + ")", "");
		return driver;
	}

	public WebDriver changeTab(int tabNumber) {
		driver.switchTo().window(tabs.get(tabNumber));
		return driver;
	}

	public String itemFromClipborad() throws HeadlessException, UnsupportedFlavorException, IOException {
		return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
	}

	public String copyAttrabuteFromWebPage(WebDriver driver, String xpath, String attributeName) {
		return driver.findElement(By.xpath(xpath)).getAttribute(attributeName);
	}

	public void closeAllTabs(int tabstoclose) {
		for (int i = 0; i <  tabstoclose; i++) {
			driver.close();
		}
		System.exit(0);
	}

	public void resizeBrowser(int xAyes, int yAyes) {
		Dimension dimension = new Dimension(xAyes, yAyes);
		driver.manage().window().setSize(dimension);
	}

	public void rest(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getTabs() {
		return tabs;
	}
}
