// Generated by Selenium IDE
// 1 - Imports / Dependencias / Apontamento de Bibliotecas
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
 
// 2 - Classe
public class ComprarPassagemTest {
  // 2.1 - Atributos / Variaveis / Parametros / Caracteristica
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
 
  // 2.2 - Funções e Métodos
  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
 
  @Test
  public void comprarPassagem() {
    driver.get("https://www.blazedemo.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.name("fromPort")).click();
    {
      WebElement dropdown = driver.findElement(By.name("fromPort"));
      dropdown.findElement(By.xpath("//option[. = 'São Paolo']")).click();
    }
    driver.findElement(By.name("toPort")).click();
    {
      WebElement dropdown = driver.findElement(By.name("toPort"));
      dropdown.findElement(By.xpath("//option[. = 'Rome']")).click();
    }
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("Fernanda");
    driver.findElement(By.id("address")).sendKeys("123 main st");
    driver.findElement(By.id("city")).sendKeys("Salvador");
    driver.findElement(By.id("state")).sendKeys("BA");
    driver.findElement(By.id("zipCode")).sendKeys("12345");
    driver.findElement(By.id("cardType")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cardType"));
      dropdown.findElement(By.xpath("//option[. = 'American Express']")).click();
    }
    driver.findElement(By.id("creditCardNumber")).click();
    driver.findElement(By.id("creditCardNumber")).sendKeys("1234567890");
    driver.findElement(By.id("creditCardMonth")).click();
    driver.findElement(By.id("nameOnCard")).click();
    driver.findElement(By.id("nameOnCard")).sendKeys("Fernanda B");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Thank you for your purchase today!");
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)")).click();
    assertEquals(driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)")).getText(), "555 USD");
  }
}
 