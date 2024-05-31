package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("");
		Thread.sleep(2000);
		WebElement jdk64Ram=driver.findElement(By.linkText("jdk-8u411-linux-x64.rpm"));
		JavaScriptExecutor("arguments[0].scrollIntoView(false)",jdk64Ram);
		
		WebElement disable_element = driver.findElement(By.linkText("Download jdk-8u411-linux-x64.rpm"));
		
	}

	private static void JavaScriptExecutor(String string, WebElement jdk64Ram) {
		// TODO Auto-generated method stub
		
	}

}
