package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathByAttribute {
public static void main (String[] args)
{
ChromeDriver d=new ChromeDriver();	
//d.get("https://www.flipkart.com/");
//d.findElement(By.xpath("//span[text()='Grocery']")).click();
d.get("https://shop-global.malaicha.com/login");
//d.findElement(By.xpath("//button[text()='Register']")).click();
d.findElement(By.xpath("//button[text()='Register']")).click();




}
}
