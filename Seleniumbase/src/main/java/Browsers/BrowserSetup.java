package Browsers;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSetup {

	public WebDriver driver;

	public void setupFireFox() {
		System.setProperty("webdriver.gecko.driver", "Seilnium drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "Seilnium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void setupEdge() {
		System.setProperty("webdriver.edge.driver", "Seilnium drivers\\MicrosoftWebDriver.exe"); // put actual location
		WebDriver driver = new EdgeDriver();
	}

	public void setupBrave() {
		System.setProperty("webdriver.chrome.driver", "Seilnium drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		driver = new ChromeDriver(options);
	}

	public void setupBrave(ArrayList<String> chromeOptions) {
		System.setProperty("webdriver.chrome.driver", "Seilnium drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		for (int i = 0; i < chromeOptions.size(); i++) {
			options.addArguments(chromeOptions.get(i));
		}
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	public void setupChrome(ArrayList<String> chromeOptions) {
		System.setProperty("webdriver.chrome.driver", "Seilnium drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		for (int i = 0; i < chromeOptions.size(); i++) {
			options.addArguments(chromeOptions.get(i));
		}
		driver = new ChromeDriver(options);
	}

	public void setupOpera() {
		System.setProperty("webdriver.opera.driver", "Seilnium drivers\\operadriver.exe");
		driver = new OperaDriver();
	}

	public void close() {
		driver.close();
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}
}