package BasicActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
       //to maximize the window
		driver.manage().window().maximize();
		
		//step1:create object of action class
		//step2:in actions constructor pass webdriver reference as an argument
	   Actions act = new Actions(driver);
		
	 //Step3:identify the targeted element in the webpage
	 WebElement rome = driver.findElement(By.id("box6"));
	 WebElement italy = driver.findElement(By.id("box106"));
	 act.clickAndHold(rome).moveToElement(italy).release().build().perform();
	// WebElement source= driver.findElement(By.id(""));
	// WebElement target= driver.findElement(By.id(""));
	 
	 
	 //step4: call non static method
	 //a.doubleclick()
	// act.dragAndDrop(source,target).build().perform();
	 
	//step5:call perform
     //a.perform();
	}

}

	


