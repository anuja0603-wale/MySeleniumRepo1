package TestNG.Qspider;


	

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class textfield {
			WebDriver driver;
			@BeforeSuite
			public void BeforeSuit() {
		    System.out.println("connecting to the data base");
		    }
			@BeforeTest
			public void BeforeTest() {
		    System.out.println("Precondition for test Runner");

			}
		
		   @BeforeClass
		   public void BeforeClass()
		  {
				   driver=new ChromeDriver();
				   driver.manage().window().maximize();
				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				   driver.get("https://demoapps.qspiders.com/");
			   }
		   
		   @BeforeMethod
		   public void BeforeMethod() throws InterruptedException {
			   driver.findElement(By.xpath("//p[text()='UITesting Concept']"));
			   Thread.sleep(2000);
			   Actions a=new Actions(driver);
		      WebElement dropdown = driver.findElement(By.xpath("//section[text()='Web Element']"));
		      a.click(dropdown);
		      Thread.sleep(2000);
		   }
		
		   @AfterMethod
		   public void AfterMethod() {
			   
		   }
		   @AfterClass
		   public void AfterClass() {
			   driver.close();

		}
		   @AfterTest
		   public void AfterTest() {
			   System.out.println("post condition test");
			   
		   }
		   @AfterSuite
		   public void AfterSuite() {
			   System.out.println("disconnect database");

			   
		   
		  
		}
}




