package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		String text = "Karan";
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Assignment-2 code//
		// driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Approching alertbutton
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		// Approching confirmbutton
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		// driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Karan
		// T");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("karanyohoo@gmail.com");
//		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("123456");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
//		
//		Select drpGender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));					
//		drpGender.selectByVisibleText("Male");
//		
//		driver.findElement(By.id("inlineRadio1")).click();
//		
//		driver.findElement(By.name("bday")).sendKeys("15-05-1994");
//				
//		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
