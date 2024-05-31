package ExtentReport;

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

public class DwsBaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void BeforeSuit() {
    System.out.println("connecting to the data base");
    }
	@BeforeTest
	public void BeforeTest() {
    System.out.println("Precondition for test Runner");

	}

   @BeforeClass
   public void beforeclass() {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://demowebshop.tricentis.com");
	   }
   
   @BeforeMethod
   public void BeforeMethod(String username,String password) {
	   driver.findElement(By.cssSelector("a[class='ico-login']")).click();
	   driver.findElement(By.id("Email")).sendKeys("admin123@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("admin01");
   
   @AfterMethod
   public void AfterMethod() {
	   driver.findElement(By.xpath("//a[class='ico-logout']")).click();
   }
   @AfterClass
   public void AfterClass() {
	   driver.close();

}
   @AfterTest
   public void AfterTest() {
	   System.out.println("Post condition for Test Runner");
	   
   }
   @AfterSuite
   public void AfterSuite() {
	  System.out.println("Disconnect for DataBase"); 
   }
}


