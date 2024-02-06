import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Ese codigo es para manejar un dropdown de tipo input que da valores de manera autosugestiva a partir de letras agregadas 
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); //Ubicamos el input y hacemos que se agregue el texo "ind" 
		Thread.sleep(3000); //Hacemos un stop del programa para que despliegue las opciones auosugestivas 
		//Como lo que se obtiene de las opciones sugestivas es una lista, se debe de guardar en una variable de tipo lista con tipo de dato WebElement 
		//Usamos findElements porque queremos obtener todos los resultados de la busqueda con ese selector 
		//Usamos un selector tipo css de Parent-to-child, pues vamos desde la clase hasta el anchor que es hijo de la clase 
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		//Iteramos cada elemento de la lista hasta encontrar el valor que deseamos 
		for(WebElement option:options) { //For Each donde en option se ira guardando cada valor de la lista y pasara a la condicion, el WebElement es para indicar que tipo de dato es el que se va a manejar en el iterador
			if(option.getText().equalsIgnoreCase("India")) { //De la opcion que se este valorando se obtiene solo el texto (recordando que lo que se obtiene es un elemento web completo) y se compara con el valor a buscar, en este caso India omitiendo las mayusculas 
				option.click(); //Cuando se encuentre el valor que queremos se dara click 
				break; //Rompe el ciclo una vez que se da click 
			}
		}
	}

}
