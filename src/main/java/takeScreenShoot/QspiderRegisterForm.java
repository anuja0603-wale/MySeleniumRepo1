package takeScreenShoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderRegisterForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("anuja");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("waleanuja123@gmail.com");
		Thread.sleep(2000);
       driver.findElement(By.id("password")).sendKeys("anuja0603");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("waleanuja123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("anuja0603");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
