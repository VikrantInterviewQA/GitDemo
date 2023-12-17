package MySeleniumTest.MySeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestSelectBboxTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");

		WebElement ele = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));
		ele.click();
		ele.sendKeys("dhoni");

		List<WebElement> count = driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//div[@class='sa_tm']/span"));

		System.out.println("333333");
		System.out.println("count is :" + count.size());
		System.out.println("333333");
		System.out.println("count is :" + count.size());

//		for (WebElement dhoni : count) {
//			System.out.println("Found search text is :"+dhoni.getText());
//			if (dhoni.getText().equalsIgnoreCase("dhoni age")) {
//				dhoni.click();
//				break;
//
//			}
//
//		}
		
		for (WebElement dhoni : count) {
			System.out.println(dhoni.getText());
		}
Thread.sleep(2000);
		driver.quit();

	}

}
