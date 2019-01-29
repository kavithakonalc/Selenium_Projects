package tutorial;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ssl_handling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts()
		
		//bellows to your local browser
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
	

}}
