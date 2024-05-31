package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseClass {
	WebDriver driver;
	@BeforeSuite
	public void BeforeSuit() {
    System.out.println("connecting to the data base");
    }
	@BeforeTest
	public void BeforeTest() {
    System.out.println("Precondition for test Runner");

	}
	@Parameters("url")
   @BeforeClass
   public void beforeclass(String url) {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get(url);
	   }
   @Parameters({"username","password"})
   @BeforeMethod
   public void BeforeMethod(String username,String password) {
	   driver.findElement(By.cssSelector("a[class='ico-login']")).click();
	   driver.findElement(By.id("Email")).sendKeys(username);
	   driver.findElement(By.id("Password")).sendKeys(password);
   }
//   @Test
//   public void Test() {
//	   driver.
//	   
//   }
   @AfterMethod
   public void AfterMethod() {
	   driver.close();
   }
   @AfterClass
   public void AfterClass() {
	   System.out.println("Post condition for Test Runner");

}
   @AfterTest
   public void AfterTest() {
	   System.out.println("Disconnect for DataBase");
	   
   }
   @AfterSuite
   public void AfterSuite() {
	   
   }
}
