package Basicpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				//Launch the application
				driver.get("https://demo.guru99.com/test/upload");
			
		       //to maximize the window
				driver.manage().window().maximize();
				
			
				//step1:click on choose file
				driver.findElement(By.id("file_wrapperO")).click();
				
				Thread.sleep(2000);
				
				
				//step2:Autoit tool
				Runtime.getRuntime().exec("C:\Users\USER\Documents\anuja5.exe");

				
	}

}
