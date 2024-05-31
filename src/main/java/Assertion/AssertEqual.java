package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqual {
@Test
public void hardAssert() {
	String expected_result="https://demowebshop.tricentis.com/";
	String a="Anuja";
	String b=null;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	//when we create a object of softassert then any anything we have passed but program runaaaaaaaaa
	SoftAssert c=new SoftAssert();
	String actual_result=driver.getCurrentUrl();
	//assertEquals(expected_result,actual_result);
     boolean result=expected_result.equals(actual_result);
     c.assertTrue(result);
     
	
	
	driver.findElement(By.id("small-searchterms")).sendKeys("Anuja");
	c.assertNull(a);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	//assertAll() showiong report all the exception
	c.assertAll();
}

	
}

