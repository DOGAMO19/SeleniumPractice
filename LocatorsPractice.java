import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dani_\\Documents\\webdrivers\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Synchronize the core (all the test) for wait each test to find element and testing
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Daniel"); 
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //CssSelector find element
		driver.findElement(By.linkText("Forgot your password?")).click(); //Ubicamos el anchor (link) que tenga el texto "Forgot your password?" y le damos click
		Thread.sleep(1000); //Pausamos la ejecucion del codigo esto para esperar que se realice la transicion de la animacion del login y encuentre los elementops
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Osva"); //Xpath find element
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dan@gmail.com"); //Css Selector find element
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //Find element with xpath and index (Simulate with i don't have different attribute) clear delete the text 
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("osva@gmail.com"); //Find element with css selector and index 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5589809087"); //Find element with xpath traverse technique (parent to child) to find the phone label 
		driver.findElement(By.className("reset-pwd-btn")).click(); //Find the button to reset the password and click on it
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //Find the paragraph with css traverse technique (parent to child) to recover the paragraph if the password it was reset 
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000); //Pausamos la ejecucion del codigo esto para esperar que se realice la transicion de la animacion del login y encuentre los elementops
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Osva");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
