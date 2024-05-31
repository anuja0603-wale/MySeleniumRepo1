package TestngTravel;



	import java.time.Duration;
	import org.testng.annotations.Test;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class makemyTrip{

           @Test(groups="regression")
	
	public makemyTrip() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.ajio.com/");
			
		}

	}


