package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsJs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String name = "Daniel Garcia";
        String name2 = "Osvaldo Morales";
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click(); //Seleccionamos el boton alert por su atributo id pero con cssSelector
        System.out.println(driver.switchTo().alert().getText()); //Cambiamos de objetivo (frame) a la alerta y obtenemos su texto
        driver.switchTo().alert().accept(); //Da en "Ok" en la alerta

        driver.findElement(By.id("name")).sendKeys(name2);
        driver.findElement(By.xpath("//input[@value='Confirm']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss(); //Da en "Cancel" en la alerta



    }
}
