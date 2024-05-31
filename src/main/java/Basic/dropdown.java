package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	private static WebElement[] all;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("https://letcode.in/test");
d.findElement(By.linkText("Drop-Down")).click();

//click on dropdown
d.findElement(null)





//step2:Create object



//Step4:call non static method
List<WebElement> all= s.getOption();


//System.out.println(all);
for(WebElement e:all) {
	System.out.println(e.getText());
	
}


	}

}
