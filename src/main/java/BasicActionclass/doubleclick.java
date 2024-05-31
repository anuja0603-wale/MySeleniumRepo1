package BasicActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
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
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		//step4:call non static method
				//a.doubleClick();
		
		a.doubleClick(button);
		
		//step5:call perform
        a.perform();
	}

}
