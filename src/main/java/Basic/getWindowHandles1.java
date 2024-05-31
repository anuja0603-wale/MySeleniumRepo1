package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Propagator.Setter;

public class getWindowHandles1 {

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
				//click on selected watch image
				driver.findElement(By.cssSelector("img[alt='Product image of Skylona skm 9180 Analogue Watch with Deployant Clasp ']")).click();
				//To transfer the driver control from parent window to child window
				//step1:How many tab/window are there
				Set<String> ids = driver.getWindowHandles();
				System.out.println(ids);
				//step2:for-each loop when we have multiple windows/tab
				for(String e:ids) {
					//System.out.prinln(e);
					/*String url = driver.getCurrentUrl();
					 System.out.println(url);*/
					 String allurl = driver.switchTo().window(e).getCurrentUrl();
					 System.out.println(allurl);
					 
					 String childurl = "https://www.ajio.com/Skylona skm 9180 Analogue Watch with Deployant Clasp";
					 if(allurl.contains(childurl)) {
					 
					 break;
					 }
				}
				//click on add to bag button
				driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
				/*To capture id of the current window
				Set<String> id = driver.getWindowHandles();*/
				//To print id of the current window in the console
				//System.out.println(id);
				//driver.quit();
	}
	

}
