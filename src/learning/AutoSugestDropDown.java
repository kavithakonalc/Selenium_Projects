package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//testcase is to select bellari option from auto suggesion dropdown
		driver.get("https://www.abhibus.com");
		driver.findElement(By.xpath("//*[@id='source']")).sendKeys("bel");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='source']")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.xpath("//*[@id='source']")).getText());//here i'm not able to find the text
		//javascript DOM can extract hidden elements
		//becouse selenium cannot find hidden element-(Ajax implementation)
		//investigate the properties of object if it have any hidden text
		//go to consel in inspect page execute document.getElementById('source').value;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById('source').value;";
		Thread.sleep(2000);
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("belary")){
			driver.findElement(By.xpath("//*[@id='source']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			i++;
			if(i>5) {
				break;
			}
		}
		if(i>5) {
			System.out.println("element is not found in list");
		}
		else {
			System.out.println("element is found sucessfully");
		}
	}

}
