package ScriptsPrelogin;

import org.openqa.selenium.Keys;

import Browsers.Funucations;
import Xpaths.Xpaths.JobPosting;

public class JobPostingScript {

	public void posting(Funucations browser) {
		JobPosting jp = new JobPosting();
		browser.clickElementByXpath(jp.jobPostingMenu, 20);
		browser.clickElementByXpath(jp.postNewJob, 20);
		browser.sendKeysElementByXpath(jp.companyName, 20, "Test");
		browser.sendKeysElementByXpath(jp.jobTitle, 20, "Test");
		browser.sendKeysElementByXpath(jp.country, 20, "Ireland" + Keys.ARROW_DOWN + "\n");
		browser.sendKeysElementByXpath(jp.stateCity, 20, "Dublin" + Keys.ARROW_DOWN + "\n");
		browser.clickElementByXpath(jp.industry, 20);
		browser.clickElementByXpath(jp.returnIndustry("Banking"), 20);
		browser.clickElementByXpath(jp.dropDownYOE, 20);
		browser.clickElementByXpath(jp.yearsExperince(3), 20);
		browser.sendKeysElementByXpath(jp.minDayily, 20, "50");
		browser.sendKeysElementByXpath(jp.maxDaily, 20, "500");
		browser.clickElementByXpath(jp.dropDownPC, 20);
		browser.clickElementByXpath(jp.returnPeferredCurrency("USD"), 20);
		browser.sendKeysElementByXpath(jp.startDate, 20, "1/30/1995");
		browser.sendKeysElementByXpath(jp.contractLenght, 20, "6");
		browser.sendKeysElementByXpath("//input[@placeholder=\"Languages *\"]", 20, "6");
		//		Job Spec 
		//		browser.clickElementByXpath(jp.visaStatus, 20);
		//		browser.clickElementByXpath(jp.returnPeferredCurrency(true), 20);
		browser.sendKeysElementByXpath("//input[@placeholder=\"Languages *\"]", 20, "English" + Keys.ARROW_DOWN + "\n");
		browser.sendKeysElementByXpath("//input[@placeholder=\"Skills *\"]", 20, "Java" + Keys.ARROW_DOWN + "\n");
		browser.sendKeysElementByXpath("//textarea[@placeholder=\"Job Spec\"]", 20, "Java");
		
		
	}
	
	
}
