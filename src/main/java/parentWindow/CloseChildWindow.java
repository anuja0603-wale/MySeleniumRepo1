package parentWindow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Launch the application
		 //to maximize the window
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> Facebook= driver.findElements(By.xpath("//a[contains(text(),='Facebook']"));
	a.click().build().perform();
																							
		
	}

}
