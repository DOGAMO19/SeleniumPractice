import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximiza la ventana del navegador 
		driver.get("http://google.com"); //Abre una pagina y espera que carguen todos sus elementos antes de pasar al siguiente paso
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); //Abre una pagina pero NO espera que se carguen todos sus elementos antes de pasar al siguiente paso
		driver.navigate().back(); //Regresa a la pagina anterior
		driver.navigate().forward(); //Avanza/Regresa a la pagina siguiente
	}

}
