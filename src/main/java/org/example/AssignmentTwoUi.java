package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwoUi {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //Dar click en el input de name y mandarle data
        driver.findElement(By.cssSelector("input[name='name']")).click();
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Daniel Garcia");

        //Dar click en el input de email y mandarle data
        driver.findElement(By.cssSelector("input[name='email']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("daniel@outlook.com");

        //Dar click en el input de password y mandarle data
        driver.findElement(By.id("exampleInputPassword1")).click();
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");

        //Dar click en el radio button
        driver.findElement(By.id("exampleCheck1")).click();

        //Poceso para seleccionar una opcion de un dropdown estatico
        //Guardamos en una variable el webElement del dropdown, en este caso lo obtendremos por su id
        WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        //Creamos un objeto con la clase SELECT (esto porque el elemento es de tipo select) y le pasamos como referencia a la clase el webelement
        Select gender = new Select(genderDropdown);
        //Seleccionamos el genero por su texto en las opciones
        gender.selectByVisibleText("Female");

        //Click en el radio button de Employment Status
        driver.findElement(By.cssSelector("input[name='inlineRadioOptions']")).click();

        //Enviamos la fecha de cumpleanos en el calendario
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("19/02/1998");

        //Damos click en el boton de Submit
        driver.findElement(By.cssSelector(".btn-success")).click();

        //Verificamos que salga la alerta de que el formulario ha sido enviado obteniendo el texto mostrado
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());


    }
}
