package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExersise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		int sum = 0;
		int totalvaluesOF = 0;
		int extraval = 0;
		int addtotalValue = 0;
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22081/uae-vs-nep-3rd-odi-nepal-tour-of-uae-2019");
		// to select particular table
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		// in particular table finding particula row
		// int rowcount=table.findElements(By.cssSelector(".cb-col cb-col-100
		// cb-scrd-itms")).size();
		// in particular row travering to particular coloum through normal css
		// div:nth-child(3) will navigate to the coloumn
		// getting all coloumn count
		int valuesCount = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		// getting all coulms one by one except last two unwanted values
		for (int i = 0; i < valuesCount - 2; i++) {
			// all list of values will be storing in listvalues variable in string format
			String listofvalues = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			// converting listvalues as int type
			int convertedValue = Integer.parseInt(listofvalues);
			// adding converted value one by one
			sum = sum + convertedValue;
		}
		/*
		 * System.out.println("sum value without adding extra value"+sum);
		 * System.out.println("Added both extra and list values"+addtotalValue);
		 * System.out.println("Actaull total value by caluculation is " +addtotalValue);
		 */
		
		//finding extra value
		String extra = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		//converting extra value as int
		extraval = Integer.parseInt(extra);
		//adding sum and extravalue
		addtotalValue = sum + extraval;
		//to display total value of sum and extra
		//System.out.println("extra value is " + extraval);
		
		
		//finding total value
		String totalval = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		totalvaluesOF = Integer.parseInt(totalval);
		
		//comparing actual total value and Caluculated toatal value
		System.out.println("total value is" + totalvaluesOF);
		if (addtotalValue == totalvaluesOF) {
			System.out.println("Toal value is correct");
		} else {
			System.out.println("total is not valid");
		}
	}
}
