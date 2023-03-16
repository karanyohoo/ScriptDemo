package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDrodowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
		// driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		System.out.println(driver.findElement(By.id("Div1")));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")));
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		// driver.close();
		// driver.findElement(By.id("divpaxinfojgrgug")).click();

		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		// Thread.sleep(3000);
//int i=1;
//	    while (i<5)
//	    {
//	    	driver.findElement(By.id("hrefIncChd")).click();
//	    	i++;
//	    }
//		
//	    driver.findElement(By.id("btnclosepaxoption")).click();

//	    for (int i1=1; i1<5; i1++)
//	    {
////	    	driver.findElement(By.id("hrefIncChd")).click();
////	    	driver.findElement(By.id("hrefIncInf")).click();
//	    	driver.findElement(By.id("hrefIncAdt")).click();
//	    }
//	    
//	    
//	    driver.findElement(By.id("btnclosepaxoption")).click();
//	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
//	    
//	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	   Thread.sleep(3000);
//	   driver.quit();
//	    
//	    //dropdown with select tag
	}
//
}
