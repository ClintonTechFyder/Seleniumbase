package ScriptsPrelogin;

import org.openqa.selenium.interactions.Actions;

import Browsers.Funucations;
import x.RandomPassword;

public class CreatePassword {
	
	private Funucations browser;
	private String password;
	

	public CreatePassword(Funucations browser) {
		super();
		this.browser = browser;
		password = RandomPassword.returnRandomPassword();
	}
	
	public void createPasswordPage() {
		// Handles Password Page
		browser.clickElementByClassName("mat-form-field-infix", 20);
		Actions action = new Actions(browser.getDriver());
		action.sendKeys(password);
		action.perform();
		browser.clickElementByXpath("//*[@id=\"mat-input-1\"]", 20);
		action.sendKeys(password);
		action.perform();
		browser.clickElementByXpath("/html/body/app-root/app-signup-employer/main/section/div/div/form/mat-card/div/button/span", 20);
	}

	public String getPassword() {
		return password;
	}
}
