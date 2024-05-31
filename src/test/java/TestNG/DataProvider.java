package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	

	

	@Test(dataProvider="login")
	
	public void receiver ()
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricent.com/");
		  driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		  driver.findElement(By.id("Email")).sendKeys("username");
		  driver.findElement(By.id("Password")).sendKeys("password");
	  }
	  
	

}
