package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2eFirst {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Select the updated dropdrown (cities)

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Select the first dropdown (From city)
        driver.findElement(By.xpath("//a[@value='BLR']")).click(); //Select the from city
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); //Select the destination city

        //Seleccionamos el dia en el calendario
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //Select the day in the calendar

        //Verificar que el segundo calendario este inhabilitado

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){ //Si los atributos del elemento contiene un 1 pasara el if
            Assert.assertTrue(true, "The element it's disabled"); //Afirmacion si es true pasara el programa y mandara un mensaje
        }
        else{ //Validacion si el valor 1 no se encuentra en las propiedades style del elemento (significando que no esta habilitado), para esto forzamos el error negando el assertTrue
            Assert.assertTrue(false,"The element it's enabled");
        }

        //Agregamos el numero de pasajeros adultos

        //Ubicamos el checkbox a seleccionar
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //Abrimos el dropdown de pasajeros
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000); //Damos un stop para que se abra bien el dropdown y empiece a agregar los pasaejros el ciclo
        //Ejecutamos un bucle para que aumente la opcion de adultos hasta 5 , puede ser con while o for, todo depende las necesidades
        int i = 1; //Iniciamos un contador
        while (i < 5) //El while se ejecuta hasta que i sea menor que 5 (4)
        {
            driver.findElement(By.id("hrefIncAdt")).click(); //Ubicamos el boton, en este caso por su id y se dara click
            i++; //Aumentamos el contador
        }
        //Ubicamos el boton de aceptar y damos click
        driver.findElement(By.id("btnclosepaxoption")).click();
        //Usamos un Assert con assertEquals para saber si el valor que se encuentra en el dropdowns dinamico de Numero de pasajeros es el valor esperado acorde al while
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        //Mostramos por consola el cambio generado en el dropdown en forma de txt para verifcar que este correcto
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //Seleccionamos el tipo de moneda a pagar

        //Proceso para seleccionar una opcion de un dropdown estatico
        //Guardamos en una variable el webElement del dropdown, en este caso lo obtendremos por su id
        WebElement currencyDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //Creamos un objeto con la clase SELECT (esto porque el elemento es de tipo select) y le pasamos como referencia a la clase el webelement
        Select currency = new Select(currencyDropdown);
        //Seleccionamos el genero por su texto en las opciones
        currency.selectByVisibleText("USD");

        //Damos click en enviar la peticion (Search)
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        //driver.findElement(By.xpath("//input[@value='Search']")).click(); //Esta linea toma el mismo elemento que la anterior linea solo que en xpath


    }
}
