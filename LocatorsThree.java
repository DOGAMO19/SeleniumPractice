import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //Creamos una instancia para usar el driver de chrome 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //Seleccionamos la url a ejecutarse 
		//Extraemos en forma de texto el valor contenido en el boton seleccionando un boton hermano (following-sibling indica que seleccione a su siguiente elemento hermano y con ::button[[1] indicamos que elemento seleccione)
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //Encontramos el boton de login con Traverse Sibling to Sibling 
		//Extraemos el texto del elemento. Con parent::div regresamos al padre de button[1] y seleccionamos button[2] de su padre
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText()); //Encontramos el boton de login con Traverse Child to Parent
	}

}
