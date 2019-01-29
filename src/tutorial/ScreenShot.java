package tutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https:www.gmail.com");	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(src, new File("C://Users//admin//Desktop"));
		//C:\Users\admin\Desktop
	}

}
