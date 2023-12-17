package MySeleniumTest.MySeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title is :" + driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.quit();
		*/

		// using WebDriverManager

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title is :" + driver.getTitle());
		System.out.println("URL is  :" + driver.getCurrentUrl());
		System.out.println("Title is :" + driver.getTitle());
		System.out.println("URL is  :" + driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.quit();

	}

}
