package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ManageChookies {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https:www.gmail.com");
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("kavitha.talli@gmail.com");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kavichandu");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		Thread.sleep(5000);
		/*Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".gb_kf"))).build().perform();*/
		driver.findElement(By.cssSelector(".gb_kf")).click();
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector(".gb_lf")).click();
		
		//driver.manage().deleteCookieNamed("gmail login");

	}
}
