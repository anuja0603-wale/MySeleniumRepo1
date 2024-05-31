package takeScreenShoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/USER/Downloads/iframe-1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id(("small-searchterms"))).sendKeys("Selenium007");
		//driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
