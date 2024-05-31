package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
   public static void OpenBrowser(String value) {
	if("chrome".equalsIgnoreCase(value)) {
		driver=new ChromeDriver();
		}
	if("firefox".equalsIgnoreCase(value)) {
		driver=new FirefoxDriver();
		}
	if("edge".equalsIgnoreCase(value)) {
		driver=new EdgeDriver();
		}

	}

}
