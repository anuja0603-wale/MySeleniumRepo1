package BasicActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args, WebElement button) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
       //to maximize the window
		driver.manage().window().maximize();
		
		//step1:create object of action class
		//step2:in actions constructor pass webdriver reference as an argument
				Actions a = new Actions(driver);

		//Step3:identify the targeted element in the webpage
		WebElement button1 = driver.findElement(By.xpath("//span[text()='right click me ']"));
		
		//step4:call non static method
		//a.contextClick();
		a.contextClick(button1);
		
		//step5:call perform
		a.perform();
	}

}
