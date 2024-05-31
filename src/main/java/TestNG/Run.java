package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Run {

	public static void main (String args[]) throws InterruptedException{

	
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jiocinema.com/");
		driver.findElement(By.id("open-profile-drawer")).click();
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Your mobile number']")).sendKeys("8080864634");
		Thread.sleep(2000);
	 //WebElement option= driver.findElement(By.cssSelector("h2[text()='Continue']"));
	driver.findElement(By.xpath("//div[@class='mui-style-1ja1tam-submit']")).click();
		driver.findElement(By.id("otp-id-0")).sendKeys("8");
		driver.findElement(By.id("otp-id-1")).sendKeys("2");
		driver.findElement(By.id("otp-id-2")).sendKeys("7");		
		driver.findElement(By.id("otp-id-3")).sendKeys("8");
		driver.findElement(By.id("otp-id-4")).sendKeys("1");
	driver.findElement(By.id("otp-id-5")).sendKeys("6");
	driver.findElement(By.xpath("//div[@class='mui-style-1ja1tam-submit']")).click();

	}
		
		
		
		
	}
		

