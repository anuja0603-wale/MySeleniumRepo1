package BasicActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://www.ajio.com/");
	
       //to maximize the window
		driver.manage().window().maximize();
		
		//step1:create object of action class
		//step2:in actions constructor pass webdriver reference as an argument
		Actions a = new Actions(driver);
		
		//Step3:identify the targeted element in the webpage
		WebElement bag = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		//step4:call non static method
		a.moveToElement(bag, 300, 0);
		
		//step5: call perform
		a.perform();
	

	}

}
