package ScriptsPrelogin;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.interactions.Actions;

import Browsers.Funucations;
import Excel.AddEntry;
import Signupforms.SignUpPageRec;
import Signupforms.SignUpPageRec.Contractor;
import x.RandomPassword;

public class RegistrationContractor {

	private Funucations browser;

	public void Contrator(SignUpPageRec signUpPageRec, Contractor contractor, Funucations browser) throws IOException {
		String email = null;
		String password = RandomPassword.returnRandomPassword();
		AddEntry addEntry = new AddEntry();
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		String testResult = "Passed";

		try {
			testResult = "ERROR WITH THE HOMEPAGE!";
			// Handles Sign up with email.
			browser.getDriver().get("http://techfynder.testtriangle.com/signup-contractor-form");
			RandomEmail randomEmail = new RandomEmail(browser);
			email = randomEmail.getemailContrator();
			testResult = "ERROR WITH THE SERVICE THAT PROVIDES THE EMAIL!";
			browser.changeTab(0);
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-0\"]", 20, email);
			browser.clickElementByXpath(
					"//*[@id=\"contact-section\"]/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[2]/button/span",
					20);
			randomEmail.getRegisterLink();
			// Handles Password Page
			testResult = "ERROR WITH THE SIGN UP PAGE! (With Details)!";
			browser.clickElementByClassName("mat-form-field-infix", 20);
			Actions action = new Actions(browser.getDriver());
			action.sendKeys(password);
			action.perform();
			browser.clickElementByXpath(
					"/html/body/app-root/app-signup-contractor/main/section/div/div/form/mat-card/mat-card-content/mat-form-field[2]/div/div[1]/div[1]",
					20);
			action.sendKeys(password);
			action.perform();
			browser.clickElementByXpath(
					"/html/body/app-root/app-signup-contractor/main/section/div/div/form/mat-card/div/button/span", 20);
			// Handle sign in page
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-2\"]", 20, signUpPageRec.getFirstName());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-3\"]", 20, signUpPageRec.getLastName());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-4\"]", 20, email);
			// Country
			browser.clickElementByXpath("//*[@id=\"mat-input-5\"]", 20);
			browser.clickElementByXpath("//*[@id=\"mat-option-57\"]/span", 20);
			// State
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-6\"]", 20, contractor.getCountry());
			// Phone Number
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-7\"]", 20, signUpPageRec.getCountryCode());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-8\"]", 20, signUpPageRec.getPhoneNumber());
			this.browser = browser;
			// Job TItle
			browser.sendKeysElementByXpath("//*[@id=\"mat-chip-list-input-0\"]", 20, contractor.getJobTitle() + "\n");
			// Website/Portfollow
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-10\"]", 20, contractor.getWebsite());
			// Overview
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-11\"]", 20, contractor.getOverview());
			// Continue
			browser.clickElementByXpath("//*[@id=\"cdk-step-content-0-0\"]/div/div[4]/button/span", 20);
			for (int i = 0; i < contractor.getSkills().size(); i++) {
				browser.sendKeysElementByXpath("//*[@id=\"mat-chip-list-input-1\"]", 20, contractor.getSkills().get(i));
			}
			browser.clickElementByXpath("//*[@id=\"cdk-step-content-0-1\"]/div/div/button[2]/span", 20);
			// Daily Rate
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-14\"]", 20, "200");
			testResult = "TEST PASSED!";
		} catch (Exception e) {
			System.out.println(e);
			testResult = "Fail";
		} finally {
			String Result = "FAIL";
			if (testResult.equalsIgnoreCase("TEST PASSED!"))
				Result = "PASSED";
			Object[][] bookData = { { email, password, "Contractor", timeStamp, Result, testResult }, };
			addEntry.addEntry("RegistationTest.xlsx", bookData);
		}
	}

	public Funucations getBrowser() {
		return browser;
	}
}
