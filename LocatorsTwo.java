import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LocatorsTwo {

	public static void main(String[] args) throws InterruptedException {
		String name = "Daniel";
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Synchronize the core (all the test) for wait each test to find element and testing
		String password = getPassword(driver); //LLamamos al metodo getPassword para poder obtener la password y le pasamos como argumento el driver. El valor que devuelva el metodo lo guardamos en una variable
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); 
		driver.findElement(By.name("inputPassword")).sendKeys(password); //Ubicamos el campo de inputPassword y le mandamos como llaves el password recuperado del metodo getPassword
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000); //Damos un tiempo de espera a la pagina para que se muestre el siguiente render
		System.out.println(driver.findElement(By.tagName("p")).getText()); //Obtenemos el texto You are successfully logged in. para saber si se ha ingresado. Lo hacemos con el tagname porque es el unico elemento "p" que existe en la pagina
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in."); //Comparamos el texto del elemento obtenido y lo comparamos con el texto que de es el que debe de estar
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(),"Hello "+name+","); //Comparamos el texto ("Hello {name},") con el texto que esperemamos que se muestre, nota que hacemos una concatenacion con el nombre
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); //Localizamos el boton de log out a traves del texto en el tag name y le damos click	
		driver.close(); //Cerramos el navegador
	}

	//Metodo que recupera la contrasena generada y la almacena en una varible para despues utilizarla
	public static String  getPassword(WebDriver driver) throws InterruptedException { //Pasamos como argumento el driver para no generar una nueva instanciacion
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); //Ubicamos el anchor (link) que tenga el texto "Forgot your password?" y le damos click
		Thread.sleep(1000); //Pausamos la ejecucion del codigo esto para esperar que se realice la transicion de la animacion del login y encuentre los elementops
		driver.findElement(By.className("reset-pwd-btn")).click(); //Find the button to reset the password and click on it
		String passwordText = driver.findElement(By.cssSelector("form p")).getText(); //Find the paragraph with css traverse technique (parent to child) to recover the paragraph if the password it was reset and save it in a variable
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	//Please use temporary password 'rahulshettyacademy' to Login. --> This is the text in passwordText
		String[] passwordArray = passwordText.split("'"); //Dividimos el string recuperado cuando encuentre una comilla lo separara y lo guardamos en una nueva variable 
	//0th index - Please use temporary password 
	//1th index - rahulshettyacademy' to Login.
		String password = passwordArray[1].split("'")[0]; //En una nueva variable almacenamos el resultado de divir el array en la posicion 1 cuando comience con ' y guardamos la posicion 0 que es la que contiene la pass
	//0th index - rahulshettyacademy
	//1th index -  to Login.
		return password; //Retornamos la password cuando se llame la funcion 
		
		/*NOTA: LA SIGUIENTE LINEA --> String[] passwordArray = passwordText.split("'");  ES LO MISMO QUE: 
		String passwordArray2 = passwordArray[1].split("'");
		passwordArray[0];
		Solo que acortamos una linea indicando al final  el ndex que queremos recuperar 
		*/
	}
	
}
