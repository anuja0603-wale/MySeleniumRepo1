package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
WebElement optional=driver.findElement(By.xpath("//input[@name='custom_gender']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeAsyncScript("arguments[0].value='Okayokay';",optional);


	}

}
