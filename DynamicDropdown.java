import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Este codigo hace referencia a seleccionar valores en dos dropdown diferentes, pero el segundo se activa cuando al primero se le da un valor, por eso solo se abre un dropdown
		//Usamos en este caso index porque en ambos dropdowns estan los mismos posibles valores, por lo tanto aparecen en ambos drops
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Enconramos el dropdown (primero)
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); //Seleccionamos el valor del primero dropdown, note que usamos xpath relativo
		Thread.sleep(2000); //Hacemos un stop para que se active de forma automatica el segundo dropdown 
		//Opcion con indexes //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //Seleccionamos el valor del segundo dropdown, note que usamos xpat relativo + un index, esto porque el mismo value tambien aparecia en el primer dropdown
		
		//Opcion con parent-child relationship 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		
	}

}
