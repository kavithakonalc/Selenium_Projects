package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoDropAssignement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("Ind");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script=("return document.getElementById(\"autocomplete\").value;");
        String text=(String) js.executeScript(script);
        System.out.println(text);
        while(!text.equalsIgnoreCase("india")){
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
        	text=(String) js.executeScript(script);
            System.out.println(text);
        }
        
        
        
        
}}

