import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities de=new DesiredCapabilities();
		de.setBrowserName("chrome");
		de.setPlatform(Platform.WINDOWS);

		//to run webdriver in node we need give that EemoWebDriver
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),de);
		driver.get("https:www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("kavitha.talli@gmail.com");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
	}

}
