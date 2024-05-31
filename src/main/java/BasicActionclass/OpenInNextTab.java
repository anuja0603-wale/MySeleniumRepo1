package BasicActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNextTab {

public static void main(String[] args, WebElement books, WebElement computers, int apparel, int shoes, int downloads, int digital, WebElement jewelry, int cards, int gift) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Actions act=new Actions(driver);
Thread.sleep(2000);
WebElement book=driver.findElement(By.xpath("//a[contains(text(),'books')]")) ;
act.keyDown(Keys.CONTROL).click(books).build().perform();
WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
act.keyDown(Keys.CONTROL).click(computers).build().perform();
WebElement electronics=driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
act.keyDown(Keys.CONTROL).click(electronics).build().perform();
WebElement   apperalshoes  =driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
act.keyDown(Keys.CONTROL).click(apparel-shoes).build().perform();
WebElement     =driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
act.keyDown(Keys.CONTROL).click(digital-downloads).build().perform();
WebElement  jewelry   =driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
act.keyDown(Keys.CONTROL).click(jewelry).build().perform();
WebElement     =driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
act.keyDown(Keys.CONTROL).click(gift-cards).build().perform();



}
}