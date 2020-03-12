package ScriptsPrelogin;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Funucations;

public class RandomEmail {

	private Funucations browser;
	private String email;

	public RandomEmail(Funucations browser) {
		super();
		this.browser = browser;
	}

	public String getemailContrator() throws IOException, HeadlessException, UnsupportedFlavorException {
		browser.openNewTab();
		browser.getDriver().get("https://temp-mail.org/en/");
		StringSelection ss = new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		do {
			browser.clickElementByXpath("//*[@id=\"click-to-copy\"]", 60);
			email = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		} while (!email.endsWith(".com") && !email.contains("@"));
		return email;
	}

	public void getRegisterLink() {
		browser.changeTab(1);
		browser.getDriver().findElement(By.xpath("//*[@id=\"click-to-refresh\"]")).click();
		try {
			browser.clickElementByXpath(
					"/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[4]/ul/li[3]/div[2]/span/a", 15);
		} catch (Exception e) {
			browser.clickElementByXpath("/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[4]/ul/li[2]/div[2]/span/a", 15);
		}

		browser.waitForElementToApeearByXpath(
				"/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/section/div[2]/div/div/p[3]/a",
				60);
		WebElement element = browser.getDriver().findElement(By.xpath(
				"/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/section/div[2]/div/div/p[3]/a"));
		browser.getDriver().get(element.getAttribute("href"));
	}
}
