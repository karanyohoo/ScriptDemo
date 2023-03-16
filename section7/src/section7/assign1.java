package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
	    
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	    Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	    
	    
		//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		//driver.quit();
		
	}

}
