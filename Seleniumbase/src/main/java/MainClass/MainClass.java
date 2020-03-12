package MainClass;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Browsers.Funucations;
import ScriptsPrelogin.RegistrationContractor;
import Signupforms.SignUpPageRec;
import Signupforms.SignUpPageRec.Contractor;

public class MainClass {

	public static void main(String[] args) throws InvalidFormatException, IOException, HeadlessException,
			UnsupportedFlavorException, InterruptedException {
		Funucations browser = new Funucations();
		browser.setupChrome();
//		browser.getDriver().manage().window().maximize();
//		SignInScripts signInScripts = new SignInScripts();
//		signInScripts.loginAsRecruitor(browser);
//		Search search = new Search();
//		search.preloginSearch(browser);
		Contractor contractor = new Contractor();
		//Contrator(SignUpPageRec signUpPageRec, Contractor contractor, Funucations browser) 
		SignUpPageRec signUpPageRec = new SignUpPageRec("Jim", "gem", "mex", "4534535353", "rfj");
		RegistrationContractor Contrator = new RegistrationContractor();
		Contrator.Contrator(signUpPageRec, contractor, browser);

	}
}