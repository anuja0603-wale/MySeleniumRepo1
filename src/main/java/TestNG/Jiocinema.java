package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Jiocinema {
	public void main (String args[]) {

	
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jiocinema.com/");
		driver.findElement(By.id("open-profile-drawer")).click();
		driver.findElement(By.id("login-btn")).click();
		
		
		
	}
		
}
