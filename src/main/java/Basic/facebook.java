package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stubdriver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.partialLinkText("Forgotten passwor?")).click();

	

	}

}