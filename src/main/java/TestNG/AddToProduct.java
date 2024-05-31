package TestNG;

import java.time.Duration;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToProduct {

	

	public static void main(String[] args ) throws InterruptedException{
		// TODO Auto-generated method stub
//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the brower
		driver.manage().window().maximize();
		//impicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		 List<WebElement> products= driver.findElements(By.xpath("//input[@value='Add to cart']"));
		 for(WebElement web: products) {
			 web.click();
			 
		 }
		 Thread.sleep(3000);
		 driver.close();
	}

}
