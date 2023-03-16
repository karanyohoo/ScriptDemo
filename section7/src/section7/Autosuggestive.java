package section7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("US");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("United States (USA)")) {
				option.click();
				break;
			}
		}
		driver.quit();
	}
}
