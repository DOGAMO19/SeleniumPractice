import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEcommerceFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dani_\\Documents\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo");
		//driver.findElement(By.className("user-actions-ico")).click();
		driver.findElement(By.id("Username")).sendKeys("Daniel");
		driver.findElement(By.className("password")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

}
