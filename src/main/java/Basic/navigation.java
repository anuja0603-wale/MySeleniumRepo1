package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.navigate().to("https://www.ajio.com/s/perfumes-4405-57701?query=:relevance&classifier=intent");

}

}
