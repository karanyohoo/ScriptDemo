package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		// Assert.assertEquals(false, null)

		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n
		// r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5
		// r-tju18j r-5njf8e r-1otgn73']"));

		driver.findElement(
				By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'][normalize-space()='International']"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'DXB')]")).click();

//		Thread.sleep(4000);
//		System.out.println(driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).getText());
//		System.out.println(driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).getText());
//		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();

		// driver.quit();

	}

}
