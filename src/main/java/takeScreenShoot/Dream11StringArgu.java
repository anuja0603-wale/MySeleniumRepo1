package takeScreenShoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11StringArgu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame("send-sms-iframe");
		
		//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123456778");
		/*switch the controller to iframe to parent*/
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
	}

}
