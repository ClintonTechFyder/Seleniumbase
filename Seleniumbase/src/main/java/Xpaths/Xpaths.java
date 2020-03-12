package Xpaths;

public class Xpaths {

	public static class EmployerPlans {
		public EmployerPlans() {
		}

		public String monthly = "//*[@id=\"mat-button-toggle-1-button\"]/div/strong";
		public String annual = "//*[@id=\"mat-button-toggle-2-button\"]/div";
		public String basic = "/html/body/app-root/app-signup-employer-subsciption/div[1]/div/div/div/div/div[2]/mat-card[2]/mat-card-content/div/button/span";
		public String standard = "/html/body/app-root/app-signup-employer-subsciption/div[1]/div/div/div/div/div[2]/mat-card[3]/mat-card-content/div/button/span";
		public String premium = "/html/body/app-root/app-signup-employer-subsciption/div[1]/div/div/div/div/div[2]/mat-card[4]/mat-card-content/div/button/span";
		public String yourEmail = "//*[@id=\"mat-input-6\"]";
		public String SignUpButton = "//*[@id=\"contact-section\"]/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[2]/button/span";
	}

	public static class PreloginNavBar {
		public PreloginNavBar() {
		}

		public String loginDropDown = "//*[@id=\"main-header\"]/div/div[2]/a[2]/span/strong";
		public String signInAsEmployer = "//*[@id=\"main-header\"]/div/div[2]/a[2]/span/div/a[1]/span/strong";
		public String signInAsContractor = "//*[@id=\"main-header\"]/div/div[2]/a[2]/span/div/a[2]/span/strong";
		public String SignUp = "//*[@id=\"main-header\"]/div/div[2]/a[1]/span/strong";
		public String employerSignUp = "//*[@id=\"main-header\"]/div/div[2]/a[1]/span/div/a[1]/span/strong";
		public String contractorSignUp = "//*[@id=\"main-header\"]/div/div[2]/a[1]/span/div/a[2]/span/strong";
	}

	public static class LoginPage {

		public LoginPage() {
		}

		public String email = "/html/body/app-root/app-login/main/section/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[1]/div/mat-form-field/div/div[1]/div/input";
		public String password = "/html/body/app-root/app-login/main/section/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[2]/div/mat-form-field/div/div[1]/div[1]/input";
		public String forgotPassword = "//*[@id=\"contact-section\"]/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[4]/a";
		public String signUp = "//*[@id=\"contact-section\"]/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[4]/p/a";
		public String loginButton = "//*[@id=\"contact-section\"]/div/div/div/div[1]/mat-card/mat-card-content/form/div/div[4]/button/span";
	}

	public static class PreLoginHomePage {

		public String findJobButton = "//*[@id=\"mat-tab-label-0-1\"]/div";
		public String jobTitle = "//*[@id=\"mat-input-0\"]";
		public String skills = "//*[@id=\"mat-chip-list-input-1\"]";
		public String advancedSearch = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/a/span";
		public String clear = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/button[1]/span";
		public String searchButton = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/button[2]/span";
		public String yearsExperince = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div";

		public String yearsExperinceDropdown(int yearsExperince) {
			return "//*[@id=\"mat-option-" + (564 + yearsExperince) + "\"]/span";
		}

		public String dailyRate = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/div[1]/div[3]/a";
		public String minDailyRate = "//*[@id=\"mat-input-10\"]";
		public String maxDailyRate = "//*[@id=\"mat-input-11\"]";
		public String dailyRateCurrency = "//*[@id=\"mat-tab-content-2-0\"]/div/div/mat-form-field[3]/div/div[1]/div";

		public String dailyRateCurrency(int currencyPoistion) {
			return "//*[@id=\"mat-option-" + (631 + yearsExperince) + "]/span";
		}

		public String eligibleToWork = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[1]/a";
		public String eligibleToWorkYes = "//*[@id=\"mat-button-toggle-22\"]";
		public String eligibleToWorkNo = "//*[@id=\"mat-button-toggle-23\"]";

		public String lanuage = "//*[@id=\"mat-chip-list-input-3\"]";
		public String lanuageDropDownOption1 = "//*[@id=\"mat-option-663\"]/span";

		public String industry = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[3]/mat-form-field/div/div[1]/div";

		public String industry(int currencyPoistion) {
			return "//*[@id=\"mat-option-" + (563 + yearsExperince) + "]/span";
		}
	}

	public static class SearchContracctor {

		public SearchContracctor() {
		}

		public String jobTitle = "//*[@id=\"mat-input-11\"]";
		public String skills = "//*[@id=\"mat-chip-list-input-3\"]";
		public String state = "//*[@id=\"mat-input-12\"]";

		public String returnCountry(String Country) {
			return "//*[text()=' " + Country + " ']";
		}

		public String clearButton = "//*[@id=\"mat-tab-content-1-0\"]/div/div/div/app-simple-search-contractors/form/div[3]/button[1]/span";
		public String search = "//*[@id=\"mat-tab-content-1-0\"]/div/div/div/app-simple-search-contractors/form/div[3]/button[2]/span";
		public String advancedSearch = "//*[@id=\"mat-tab-content-1-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/a/i";
		public String availabilityDate = "//*[@id=\"mat-input-14\"]";
		public String yearsOfExperince = "//*[@id=\"mat-select-2\"]/div/div[1]";

		public String yearsExperinceDropdown(int yearsExperince) {
			return "//*[@id=\"mat-option-" + (326 + yearsExperince) + "\"]/span";
		}

		public String dailyRate = "//*[@id=\"mat-tab-content-1-0\"]/div/div/div/app-simple-search-contractors/form/div[2]/div[1]/div[3]/a";
		public String minDaily = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[2]/mat-tab-group/div/mat-tab-body/div/div/mat-form-field[1]/div/div[1]/div/input";
		public String maxDaily = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[2]/mat-tab-group/div/mat-tab-body/div/div/mat-form-field[2]/div/div[1]/div/input";
		public String peferredCurrency = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[2]/mat-tab-group/div/mat-tab-body/div/div/mat-form-field[3]/div/div[1]/div/mat-select/div/div[2]";

		public String returnPeferredCurrency(String Country) {
			return "//*[text()='" + Country + "']";
		}

		public String elightAbletoWork = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[1]/a";

		public String elightAbletoWorkDropDown(Boolean ElgihtableToWork) {
			if (ElgihtableToWork == true)
				return "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[1]/mat-button-toggle-group/mat-button-toggle[1]";
			else
				return "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[1]/mat-button-toggle-group/mat-button-toggle[2]";
		}

		public String lanuages = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[2]/mat-form-field/div/div[1]/div/mat-chip-list/div/input";
		public String Industry = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-contractors/form/div[2]/div[3]/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";

		public String returnIndustry(String industry) {
			return "//*[text()=' " + industry + " ']";
		}
	}

	public static class SearchRecruitor {

		public SearchRecruitor() {
		}

		public String advancedSearch = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-jobs/form/div[3]/a/span";
		public String jobTitle = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-jobs/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input";
		public String skills = "//*[@id=\"mat-chip-list-input-2\"]";
		public String state = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-jobs/form/div[1]/div[3]/mat-form-field[1]/div/div[1]/div/div/input";

		public String returnCountry(String Country) {
			return "//*[text()=' " + Country + " ']";
		}

		public String dailyRate = "//*[@id=\"mat-tab-content-1-0\"]/div/div/div/app-simple-search-jobs/form/div[2]/div/div[1]/a";
		public String minDaily = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-jobs/form/div[3]/mat-tab-group/div/mat-tab-body/div/div/mat-form-field[1]/div/div[1]/div/input";
		public String maxDaily = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer-content/div/app-search-results/section/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/app-simple-search-jobs/form/div[3]/mat-tab-group/div/mat-tab-body/div/div/mat-form-field[2]/div/div[1]/div/input";
		public String peferredCurrency = "//*[@id=\"mat-tab-content-2-0\"]/div/div/mat-form-field[3]/div/div[1]/div";

		public String returnPeferredCurrency(String Currency) {
			return "//*[text()='" + Currency + "']";
		}

		public String industry = "//*[@id=\"mat-select-2\"]/div/div[1]";

		public String returnIndustry(String industry) {
			return "//*[text()=' " + industry + " ']";
		}

		public String lanuages = "//*[@id=\"mat-chip-list-input-3\"]";
		public String searchButton = "//*[@id=\"mat-tab-content-1-0\"]/div/div/div/app-simple-search-jobs/form/div[4]/button[2]/span";

	}

	public static class JobPosting {

		public JobPosting() {
		}

		public String jobPostingMenu = "/html/body/app-root/app-dashboard/mat-drawer-container/mat-drawer/div/mat-nav-list/mat-list-item[2]/div/div[2]/h4";
		public String postNewJob = "//*[@id=\"mat-tab-label-2-1\"]/div/span";
		public String companyName = "//*[@id=\"mat-input-14\"]";
		public String jobTitle = "//input[@placeholder='Job title']";
		public String country = "//input[@placeholder='Country']";
		public String stateCity = "//*[@id=\"mat-input-17\"]";
		public String industry = "//*[@id=\"mat-select-3\"]/div/div[2]";

		public String returnIndustry(String industry) {
			return "//*[text()=' " + industry + " ']";
		}

		public String dropDownYOE  = "//*[@id=\"mat-select-4\"]/div/div[2]";

		public String yearsExperince(int years) {
			return "//*[text()=' " + years + " yrs ']";
		}

		public String minDayily = "//*[@id=\"mat-input-18\"]";
		public String maxDaily = "//*[@id=\"mat-input-19\"]";
		public String dropDownPC = "//*[@id=\"mat-select-5\"]/div/div[2]";

		public String returnPeferredCurrency(String Currency) {
			return "//*[text()='" + Currency + "']";
		}

		public String startDate =  "//*[@id=\"mat-input-20\"]";

		public String contractLenght =  "//*[@id=\"mat-input-21\"]";

		public String numberOfPoistions =  "//*[@id=\"mat-input-22\"]";

		public String visaStatus =  "//*[@id=\"mat-select-6\"]/div/div[1]/span/span";

		public String returnPeferredCurrency(boolean avaiable) {
			if (avaiable == true)
				return "//*[@id=\"mat-option-70\"]/span";
			else
				return "//*[@id=\"mat-option-71\"]/span";
		}

		public String lanuages = "//*[@id=\"mat-input-23\"]";

		public String jobSpec = "//*[@id=\"mat-input-24\"]";

		public String skills = "//*[@id=\"mat-input-25\"]";

	//	public String postJob = "//*[@id=\"mat-tab-content-7-1\"]/div/app-job-posting/div/div/form/div/div[2]/button[2]/span";

	}

}
