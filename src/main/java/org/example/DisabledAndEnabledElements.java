package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisabledAndEnabledElements {
    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Verificamos con un assert que el checkbox no este seleccionado (por eso se usa un assertFalse)
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //Ubicamos el checkbox a seleccionar
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //Verificamos que el checkbox haya sido seleccionado
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //Verificamos con un assert que el checkbox este seleccionado (por eso se usa un assertTrue)
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //Contamos el numero total de checkboxes en la pagina con .size y con un atributo que tengan todos los checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        //Saber si un elemento web esta deshabilitado o habilitado
        //Ubicamos el elemento y obtenemos sus atributos de tipo style
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        //Damos click en el radio button de "Round Trip" para cambiar el valor de opacity del caledario y "Habilitarlo"
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //Obtenemos nuevamente los atributos del elemento calendario para ver si cambio su opacity
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        //Hacemos una validacion para saber si el elemento esta habilitado (en este caso, si opacity es 1 significa que esta habilitado y 0.5 esta deshabilitado)
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){ //Si los atributos del elemento contiene un 1 pasara el if
            Assert.assertTrue(true, "The element it's enabled"); //Afirmacion si es true pasara el programa y mandara un mensaje
        }
        else{ //Validacion si el valor 1 no se encuentra en las propiedades style del elemento (significando que no esta habilitado), para esto forzamos el error negando el assertTrue
            Assert.assertTrue(false,"The element it's not enabled");
        }





        //Ubicamos el dropdown que vamos a utlizar, en este caso lo ubicamos por su id
        driver.findElement(By.id("divpaxinfo")).click();
        //Establecemos una parada para que se abra el dropdown y no se detenga el codigo siguiente
        Thread.sleep(2000L);

        //Ejecutamos un bucle para que aumente la opcion de adultos hasta 5 , puede ser con while o for, todo depende las necesidades
        int i = 1; //Iniciamos un contador
        while (i < 5) //El while se ejecuta hasta que i sea menor que 5 (4)
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

        //Usamos un Assert con assertEquals para saber si el valor que se encuentra en el dropdowns dinamico de Numero de pasajeros es el valor esperado acorde al while
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        //Mostramos por consola el cambio generado en el dropdown en forma de txt para verifcar que este correcto
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }
}
