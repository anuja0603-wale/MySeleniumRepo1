package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demoapps.qspiders.com/ui/formValidation?sublist=0&scenario=1");
		driver.findElement(By.name("requiredfield")).sendKeys("HiGuys");
		driver.findElement(By.name("minLength")).sendKeys("")
		driver.findElement(By.name("password")).sendKeys("")
		driver.findElement(By.name("confirmpass")).sendKeys("")
		driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']")).sendKeys("");
		driver.findElement(By.name("rangeLength")).sendKeys("");
		driver.findElement(By.name("minValue")).sendKeys("");
		
	}

}
