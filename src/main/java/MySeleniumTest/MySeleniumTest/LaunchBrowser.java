package MySeleniumTest.MySeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

		

		// using WebDriverManager

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title is :" + driver.getTitle());
		System.out.println("URL is  :" + driver.getCurrentUrl());
		//Remove extra code
		// System.out.println(driver.getPageSource());
		driver.quit();

	}

}
