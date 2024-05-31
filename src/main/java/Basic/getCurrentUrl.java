package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				ChromeDriver driver=new ChromeDriver();
			       //to maximize the window
					driver.manage().window().maximize();

				driver.get("https://www.ajio.com/");
				driver.findElement(By.name("searchVal")).sendKeys("Perfumes");
				driver.findElement(By.className("ic-search")).click();
		       //to maximize the window
				driver.manage().window().maximize();
				//To capture the url of the current webpage
				String title=driver.getCurrentUrl();
				//to print the current url in the console
				System.out.println(url);
		
			}

		}

	}

}
