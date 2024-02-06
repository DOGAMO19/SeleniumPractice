import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Ubicamos el checkbox a seleccionar
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//Verificamos que el checkbox haya sido seleccionado
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Contamos el numero total de checkboxes en la pagina con .size y con un atributo que tengan todos los checkboxes 
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//Ubicamos el dropdown que vamos a utlizar, en este caso lo ubicamos por su id 
		driver.findElement(By.id("divpaxinfo")).click();
		//Establecemos una parada para que se abra el dropdown y no se detenga el codigo siguiente
		Thread.sleep(2000L); 
		
		//Ejecutamos un bucle para que aumente la opcion de adultos hasta 5 , puede ser con while o for, todo depende las necesidades 
		int i=1; //Iniciamos un contador
		while(i<5) //El while se ejecuta hasta que i sea menor que 5 (4)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //Ubicamos el boton, en este caso por su id y se dara click
			i++; //Aumentamos el contador
		}
		
		/*
		 //Con for seria 
		 for(int i=1; i<5; i++ ){
		 	driver.findElement(By.id("hrefIncAdt")).click(); //Ubicamos el boton, en este caso por su id y se dara click
		 } 
		 */
		
		//Ubicamos el boton de aceptar y damos click
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Mostramos por consola el cambio generado en el dropdown en forma de txt para verifcar que este correcto 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}

}
