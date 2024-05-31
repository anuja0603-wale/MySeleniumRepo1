package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.ilovepdf.com/word_to_pdf");
    Thread.sleep(1000);
   WebElement input_file= driver.findElement(By.xpath("//input[@text='file']"));
    
    
	}

}
