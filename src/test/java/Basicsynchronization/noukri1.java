package Basicsynchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class noukri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://www.myntra.com/");
	
       //to maximize the window
		driver.manage().window().maximize();
	}

}
