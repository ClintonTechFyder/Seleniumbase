package ScriptsPrelogin;

import java.io.IOException;

import Browsers.Funucations;
import Excel.Read;
import Xpaths.Xpaths.LoginPage;
import Xpaths.Xpaths.PreloginNavBar;


public class SignInScripts {

	public static void loginAsRecruitor(Funucations browser) throws IOException {
		Read excelRead = new Read("RegistationTest.xlsx");
		LoginPage loginPage = new LoginPage();
		PreloginNavBar homepageNav = new PreloginNavBar();
		excelRead.splitPasswordandEmails();
		// Sign in as contrator
		browser.getDriver().get("http://techfynder.testtriangle.com/");
		browser.clickElementByXpath(homepageNav.loginDropDown, 20);
		browser.clickElementByXpath(homepageNav.signInAsEmployer, 20);
		browser.sendKeysElementByXpath(loginPage.email, 20,"wixif93271@mailernam.com");
		browser.sendKeysElementByXpath(loginPage.password, 20,"48f0856#I.I#1a88e7c9");
		browser.clickElementByXpath(loginPage.loginButton, 20);
	}

	public static void loginAsContractorByExcel(Funucations browser) throws IOException {
		// browser set up
		Read excelRead = new Read("RegistationTest.xlsx");
		LoginPage loginPage = new LoginPage();
		PreloginNavBar homepageNav = new PreloginNavBar();
		excelRead.splitPasswordandEmails();
		// Sign in as contrator
		browser.getDriver().get("http://techfynder.testtriangle.com/");
		browser.clickElementByXpath(homepageNav.loginDropDown, 20);
		browser.clickElementByXpath(homepageNav.signInAsContractor, 20);
		browser.sendKeysElementByXpath(loginPage.email, 20, "kahovig755@hxqmail.com");
		browser.sendKeysElementByXpath(loginPage.password, 20, "b8d5830$D.D$9d742cad");
		browser.clickElementByXpath(loginPage.loginButton, 20);
	}

	public static void loginAsContractor(Funucations browser, String email, String password) throws IOException {
		// browser set up
		Read excelRead = new Read("RegistationTest.xlsx");
		LoginPage loginPage = new LoginPage();
		PreloginNavBar homepageNav = new PreloginNavBar();
		excelRead.splitPasswordandEmails();
		// Sign in as contrator
		browser.getDriver().get("http://techfynder.testtriangle.com/");
		browser.clickElementByXpath(homepageNav.loginDropDown, 20);
		browser.clickElementByXpath(homepageNav.signInAsContractor, 20);
		browser.sendKeysElementByXpath(loginPage.email, 20, email);
		browser.sendKeysElementByXpath(loginPage.password, 20, password);
		browser.clickElementByXpath(loginPage.loginButton, 20);
	}

	public static void loginAsRecruitor(Funucations browser, String email, String password) throws IOException {
		Read excelRead = new Read("RegistationTest.xlsx");
		LoginPage loginPage = new LoginPage();
		PreloginNavBar homepageNav = new PreloginNavBar();
		excelRead.splitPasswordandEmails();
		// Sign in as contrator
		browser.getDriver().get("http://techfynder.testtriangle.com/");
		browser.clickElementByXpath(homepageNav.loginDropDown, 20);
		browser.clickElementByXpath(homepageNav.signInAsEmployer, 20);
		browser.sendKeysElementByXpath(loginPage.email, 20, email);
		browser.sendKeysElementByXpath(loginPage.password, 20, password);
		browser.clickElementByXpath(loginPage.loginButton, 20);
	}
}