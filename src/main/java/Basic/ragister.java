package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ragister {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();	
		d.get("https://demo.automationtesting.in/Register.html");
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anuja");
		Thread.sleep(3000);
        d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Wale");
        Thread.sleep(3000);
		d.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Deccan,pune");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("anuja123@email.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("8080864634");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@value='FeMale']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("checkbox1")).click();
		d.findElement(By.id("checkbox2")).click();
		d.findElement(By.id("checkbox3")).click();
		Thread.sleep(3000);
		WebElement target=d.findElement(By.xpath("//option[@value='English']"));
		Actions s=new Actions(d);
		s.moveToElement(target);
		s.click(target);
		Thread.sleep(3000);
    	//WebElement wb=d.findElement(By.id("Skills"));
		//Select selectelement=new Select(wb);
		//SelectElement
		//action.moveToElement(wb).click().sendKeys("java").build().perform();
	}

}
