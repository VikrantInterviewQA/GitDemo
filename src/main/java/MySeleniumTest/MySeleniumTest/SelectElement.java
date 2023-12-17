package MySeleniumTest.MySeleniumTest;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.navigate().to("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement FirstName = driver.findElement(By.id("FirstName"));
		FirstName.sendKeys("Rashmi");
		WebElement LastName = driver.findElement(By.id("LastName"));
		LastName.sendKeys("Shingne");

		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("rashmi@23.com");

		WebElement ConfirmEmail = driver.findElement(By.id("ConfirmEmail"));
		ConfirmEmail.sendKeys("rashmi@23.com");

		WebElement Username = driver.findElement(By.id("Username"));
		Username.sendKeys("Masterchef");

		WebElement ele = driver.findElement(By.id("CountryId"));

		Select select = new Select(ele);

		/*
		 * select.selectByIndex(98); Thread.sleep(3000); select.selectByValue("400");
		 * 
		 * Thread.sleep(3000); select.selectByVisibleText("Zimbabwe");
		 * 
		 * Thread.sleep(3000);
		 */
		List<WebElement> allOptions = select.getOptions();

		for (WebElement option : allOptions) {
			if (option.getText().equalsIgnoreCase("Haiti")) {
				option.click();

			}
		}

		WebElement valid = driver.findElement(By.id("TimeZoneId"));

//	js.executeScript("argument[0].scrollintoview();",valid);

		Select select1 = new Select(valid);
		select1.selectByValue("Aleutian Standard Time");

		// Aleutian Standard Time
		List<WebElement> allOption2 = select.getOptions();

		for (WebElement option2 : allOption2) {
			if (option2.getText().equalsIgnoreCase("Aleutian Standard Time"))

			{

				option2.click();
				System.out.println("77");
				break;
			}
		}

		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("qwerty");

		WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassword.sendKeys("qwerty");

		WebElement ccc = driver.findElement(By.id("Details_CompanyIndustryId"));

//			js.executeScript("argument[0].scrollintoview();",valid);

		Select select2 = new Select(ccc);
		select2.selectByVisibleText("Develops nopCommerce extensions");

		WebElement Details_CompanyRoleId = driver.findElement(By.id("Details_CompanyRoleId"));

//				js.executeScript("argument[0].scrollintoview();",valid);

		Select select3 = new Select(Details_CompanyRoleId);
		select3.selectByVisibleText("Technical developer");

		WebElement Details_CompanySizeId = driver.findElement(By.id("Details_CompanySizeId"));

//					js.executeScript("argument[0].scrollintoview();",valid);

		Select select4 = new Select(Details_CompanySizeId);
		select4.selectByVisibleText("2–5");

		WebElement website = driver.findElement(By.id("Details_CompanyWebsiteUrl"));

		website.sendKeys("rashmi@tester.com");

		Thread.sleep(4000);

		WebElement register = driver.findElement(By.id("register-button"));
		register.click();

		driver.close();

	}

}
