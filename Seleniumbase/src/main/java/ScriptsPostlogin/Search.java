package ScriptsPostlogin;

import java.io.IOException;

import org.openqa.selenium.Keys;

import Browsers.Funucations;
import Xpaths.Xpaths.SearchContracctor;
import Xpaths.Xpaths.SearchRecruitor;

public class Search {

	public Search() {
	}
	
	public void preloginSearch(Funucations browser) {
		browser.sendKeysElementByXpath("//input[@placeholder='Job Title']", 10, "Java Developer");
		browser.sendKeysElementByXpath("//input[@placeholder='Skills']", 10, "Java");
		browser.clickElementByXpath("//input[@name='no-country']", 10);
		browser.clickElementByXpath("//*[text()=' Ireland ']", 10);
		browser.clickElementByXpath("//span[@class=\"fontColor ng-star-inserted\"]", 10);

	} 


	public void RecruitorSearch(Funucations browser) throws IOException {
		SearchContracctor search = new SearchContracctor();
		browser.clickElementByXpath(search.advancedSearch, 10);
		// Search
		browser.sendKeysElementByXpath(search.jobTitle, 10, "Java Developer" + Keys.ARROW_DOWN);
		browser.sendKeysElementByXpath(search.skills, 10, "java" + Keys.ARROW_DOWN);
		browser.clickElementByXpath(search.state, 10);
		browser.clickElementByXpath(search.returnCountry("Ireland"), 10);
		browser.sendKeysElementByXpath(search.availabilityDate, 10, "11/30/2020");
		browser.clickElementByXpath(search.yearsOfExperince, 10);
		browser.clickElementByXpath(search.yearsExperinceDropdown(3), 10);
		browser.clickElementByXpath(search.dailyRate, 10);
		browser.sendKeysElementByXpath(search.minDaily, 10, "50");
		browser.sendKeysElementByXpath(search.maxDaily, 10, "5000");
		browser.clickElementByXpath(search.peferredCurrency, 10);
		browser.clickElementByXpath(search.returnPeferredCurrency("USD"), 10);
		browser.clickElementByXpath(search.elightAbletoWork, 10);
		browser.clickElementByXpath(search.elightAbletoWorkDropDown(false), 10);
		browser.sendKeysElementByXpath(search.lanuages, 10, "English" + Keys.ARROW_DOWN);
		browser.clickElementByXpath(search.Industry, 10);
		browser.clickElementByXpath(search.returnIndustry("Banking"), 10);
		browser.clickElementByXpath(search.search, 10);
	}

	public void ContractorSearch(Funucations browser) {
		SearchRecruitor search = new SearchRecruitor();
		browser.clickElementByXpath(search.advancedSearch, 10);
		browser.sendKeysElementByXpath(search.jobTitle, 10, "Java Developer" + Keys.ARROW_DOWN);
		browser.sendKeysElementByXpath(search.skills, 10, "java" + Keys.ARROW_DOWN);
		browser.clickElementByXpath(search.state, 10);
		browser.clickElementByXpath(search.returnCountry("Italy"), 10);
		browser.clickElementByXpath(search.dailyRate, 10);
		browser.sendKeysElementByXpath(search.minDaily, 10, "50");
		browser.sendKeysElementByXpath(search.maxDaily, 10, "5000");
		browser.clickElementByXpath(search.peferredCurrency, 10);
		browser.clickElementByXpath(search.returnPeferredCurrency("EUR"), 10);
		browser.clickElementByXpath(search.industry, 10);
		browser.clickElementByXpath(search.returnIndustry("Information Technology"), 10);
		browser.sendKeysElementByXpath(search.lanuages, 10, "English" + Keys.ARROW_DOWN);
		browser.clickElementByXpath(search.returnIndustry("English"), 10);
		browser.clickElementByXpath(search.searchButton, 10);
	}

}
