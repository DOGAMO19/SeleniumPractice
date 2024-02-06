import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Guardamos en una variable el webElement del dropdown ubicandolo con id (se puede ubicar con css,xpath)
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Creamos un objeto de la clase SELECT (esta clase se usa solo cuando el tagname del dropdown es de tipo select) esto lo hacemos para tener todas las propiedades de un dropdopwn llamando solo al objeto
		//Le pasamos como referencia a la clase el webelement 
		Select dropdown = new Select(staticDropdown); 
		
		dropdown.selectByIndex(3); //Escogemos el elemento en la posicion 3 del dropdown (en este caso selecciona USD)
		System.out.println(dropdown.getFirstSelectedOption().getText()); //Obtenemos el texto del valor seleccionado, utilizamos getText al final porque getFirstSelectedOption devuelve todo el elemento web (con tag y clases) y con text solo obtenemos el texto dentro del elemento web (fuera de tag)
		dropdown.selectByVisibleText("AED"); //Selecciona el elemento por su texto (Este texto debe ser el mismo que el de la pagina web)
		System.out.println(dropdown.getFirstSelectedOption().getText()); //Obtenemos el texto del valor seleccionado, utilizamos getText al final porque getFirstSelectedOption devuelve todo el elemento web (con tag y clases) y con text solo obtenemos el texto dentro del elemento web (fuera de tag)
		dropdown.selectByValue("INR"); //Selecciona el elemento por su value (esto solo se puede si las opciones tiene la propiedad value en su webElement)
		System.out.println(dropdown.getFirstSelectedOption().getText()); //Obtenemos el texto del valor seleccionado, utilizamos getText al final porque getFirstSelectedOption devuelve todo el elemento web (con tag y clases) y con text solo obtenemos el texto dentro del elemento web (fuera de tag)

	}

}
