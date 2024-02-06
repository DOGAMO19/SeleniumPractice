import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		
		//PATH driver Chrome or any web Explorer System.setProperty makes the property a global property
		// Invoke browser with the interface methods only
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dani_/Documents/webdrivers/chromedriver.exe"); //Path to chromeDriver
		WebDriver driver = new ChromeDriver(); //Instance for Chrome
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/dani_/Documents/webdrivers/geckodriver.exe"); //Path to firefoxDriver (geckoDriver)
		//WebDriver driver = new FirefoxDriver(); // Instance for Firefox
		
		//System.setProperty("webdriver.edge.driver","C:/Users/dani_/Documents/webdrivers/msedgedriver.exe"); //Path to Edge driver
		//WebDriver driver = new EdgeDriver();// Instance for Edge
		
		driver.get("https://matrixcalc.org/es/"); //Open the web page 
		System.out.println(driver.getTitle()); //Get the Title of the web page
		System.out.println(driver.getCurrentUrl()); //Get the current Url of the web page 
		driver.close(); //Close the current window to test
		//driver.quit(); //Close all the windows of the test

	}

}
