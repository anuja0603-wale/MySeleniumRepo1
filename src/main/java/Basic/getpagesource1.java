package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	       //to maximize the window
			driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		driver.findElement(By.name("searchVal")).sendKeys("Perfumes");
		driver.findElement(By.className("ic-search")).click();
    //to maximize the window
		driver.manage().window().maximize();
		//To capture the url of the current webpage
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
	}

}
