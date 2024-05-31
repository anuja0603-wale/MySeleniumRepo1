package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the empty chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://www.ajio.com/");
	
       //to maximize the window
		driver.manage().window().maximize();
		//Enter Watches in search text field
		driver.findElement(By.name("searchVal")).sendKeys("watches");
		//click on search icon
		driver.findElement(By.className("ic-search")).click();
		//To capture id of the current window
		String id = driver.getWindowHandle();
		//To print id of the current window in the console
		System.out.println(id);
	}

}
