package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		//to maximize the window
       //to maximize the window
		driver.manage().window().maximize();
		//To capture the title of the current webpage
		String title=driver.getTitle();
		//to print in console
		System.out.println(title);
	}

}
