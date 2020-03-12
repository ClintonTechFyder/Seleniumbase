package ScriptsPrelogin;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import Browsers.Funucations;
import Excel.AddEntry;
import Signupforms.SignUpPageRec;
import Xpaths.Xpaths.EmployerPlans;
import Xpaths.Xpaths.PreloginNavBar;

public class RegistrationEmployer {

	Funucations browser;

	public RegistrationEmployer(Funucations browser) {
		super();
		this.browser = browser;
	}

	public enum Plan {
		BASIC, STANDARD, PREMIUN;
	}

	public enum PlanType {
		Monthly, Annual;
	}

	public void signUp(Plan plan, PlanType planType)
			throws IOException, HeadlessException, UnsupportedFlavorException, InterruptedException {

		String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		String testResult = "";
		String email = "";
		AddEntry addEntry = new AddEntry();
		CreatePassword createPassword = new CreatePassword(browser);

		try {
			testResult = "ERROR WITH THE HOMEPAGE!";
			PreloginNavBar homepageNav = new PreloginNavBar();
			EmployerPlans employerPlans = new EmployerPlans();
			RandomEmail randomEmail = new RandomEmail(browser);
			browser.getDriver().get("http://techfynder.testtriangle.com/");
			browser.clickElementByXpath(homepageNav.SignUp, 20);
			browser.clickElementByXpath(homepageNav.employerSignUp, 20);
			browser.clickElementByXpath(employerPlans.annual, 20);

			testResult = "ERROR WITH SELECTING A PLAN!";
			if (plan.equals(Plan.PREMIUN))
				browser.clickElementByXpath(employerPlans.premium, 20);
			if (plan.equals(Plan.STANDARD))
				browser.clickElementByXpath(employerPlans.standard, 20);
			if (plan.equals(Plan.BASIC))
				browser.clickElementByXpath(employerPlans.basic, 20);

			testResult = "ERROR WITH THE SERVICE THAT PROVIDES THE EMAIL!";
			email = randomEmail.getemailContrator();
			testResult = "ERROR WITH SIGN UP (ON TECHFYDER)";
			browser.changeTab(0);
			browser.sendKeysElementByXpath(employerPlans.yourEmail, 20, email);
			browser.clickElementByXpath(employerPlans.SignUpButton, 20);
			browser.changeTab(1);
			randomEmail.getRegisterLink();
			createPassword.createPasswordPage();

			testResult = "ERROR WITH THE SIGN UP PAGE! (With Details)!";
			// sign up page.
			SignUpPageRec signUpPageRec = new SignUpPageRec("Clinton", "Test", "353", "864939385", email);
			SignUpPageRec.Employer employerReg = new SignUpPageRec.Employer();
			employerReg.setContactByEmail(true);
			employerReg.setCompanyName("testcorp");
			employerReg.setCompanyWebsite("not a real company");
			employerReg.setCompanyAddress("fidsfhdf");
			employerReg.setAboutCompany("test about");
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-2\"]", 20, signUpPageRec.getFirstName());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-3\"]", 20, signUpPageRec.getFirstName());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-4\"]", 20, signUpPageRec.getCountryCode());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-5\"]", 20, signUpPageRec.getPhoneNumber());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-7\"]", 20, employerReg.getCompanyName());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-8\"]", 20, employerReg.getCompanyWebsite());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-9\"]", 20, employerReg.getCompanyAddress());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-10\"]", 20, employerReg.getAboutCompany());

			JavascriptExecutor Scrool = (JavascriptExecutor) browser.getDriver();
			Scrool.executeScript("window.scrollBy(0,300)", "");
			browser.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			browser.clickElementByXpath(
					"/html/body/app-root/app-signup-employer-tabs/main/section/div/div[2]/div/form/mat-horizontal-stepper/div[2]/div[1]/div/div[2]/div[3]/button",
					20);

			testResult = "ERROR WITH SELECTING A PLAN PART 2!";

			if (plan.equals(Plan.PREMIUN)) {
				browser.clickElementByXpath("//*[@id=\"mat-tab-label-0-2\"]/div", 20);
				if (planType.equals(PlanType.Annual))
					browser.clickElementByXpath("//*[@id=\"mat-button-toggle-8-button\"]/div/strong", 20);
				browser.clickElementByXpath("//*[@id=\"mat-tab-content-0-2\"]/div/div/div[1]/button/span", 20);
			}
			if (plan.equals(Plan.STANDARD)) {
				if (planType.equals(PlanType.Annual))
					browser.clickElementByXpath("//*[@id=\"mat-button-toggle-6-button\"]/div/strong", 20);
				browser.clickElementByXpath(
						"/html/body/app-root/app-signup-employer-tabs/main/section/div/div[2]/div/form/mat-horizontal-stepper/div[2]/div[2]/div[1]/div/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div[1]/button/span",
						20);
			}
			if (plan.equals(Plan.BASIC)) {
				browser.clickElementByXpath("//*[@id=\"mat-tab-label-0-0\"]/div", 20);
				if (planType.equals(PlanType.Annual))
					browser.clickElementByXpath("//*[@id=\"mat-button-toggle-4-button\"]/div/strong", 20);
				browser.clickElementByXpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div[1]/button/span", 20);
			}
			
			testResult = "ERROR WITH INPUTTING CARD DETAILS!";
			// inputs details for the user (not card info)
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-11\"]", 20, employerReg.getCompanyWebsite());
			browser.sendKeysElementByXpath("//*[@id=\"mat-input-12\"]", 20, "Ireland");
			browser.clickElementByXpath("//*[@id=\"mat-option-6\"]/span", 20);
			browser.sendKeystoIframe("/html/body/div/form/div/div[2]/span[1]/span[2]/span/input",
					"424242424242424242424242424242424242424242424242424242424242424242" + "\n");
			testResult = "ERROR WITH SKIPPING JOB POSTING PAGE!";
			browser.rest(5);
			browser.clickElementByXpath(
					"/html/body/app-root/app-job-posting-wrapper/main/div/app-job-posting/div/div/form/div/div[2]/a/span",
					20);
			browser.clickElementByXpath(
					"/html/body/div[2]/div[2]/div/mat-dialog-container/app-job-posting-dialog/div[2]/button[2]/span",
					20);
			testResult = "TEST PASSED!";
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			String Result = "FAIL";
			if (testResult.equalsIgnoreCase("TEST PASSED!"))
				Result = "PASSED";
			Object[][] bookData = { { email, createPassword.getPassword(),
					"Employer (" + plan.toString() + " + " + planType.toString() + ")", timeStamp, Result,
					testResult }, };
			addEntry.addEntry("RegistationTest.xlsx", bookData);
		}
	}
}
