package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nokri1 {

	//private static final CharSequence JAVA = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d=new ChromeDriver();
d.get("https://www.naukri.com/");
//d.findElement(By.xpath("//input[@class='suggestor-input'])[1]")).sendKeys("JAVA");
d.findElement(By.id("login_Layer")).click();
d.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("anuja@email.com");
d.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("anuja123");
//d.findElement(By.xpath("//button[text()='Login']")).click();
//d.manage().window().maximize();
//d.manage().window().minimize();
//d.manage().window().fullscreen();
//To get Height and width of the Window
//Dimension a=d.manage().window().getSize();
//System.out.println(a.getWidth());
//System.out.println(a.getHeight());
//To set Height and Width of the Window
//Dimension b=new Dimension(300,800);
//d.manage().window().setSize(b);
//to get x&y value
/*Point c=d.manage().window().getPosition();
System.out.println(c.getX());
System.out.println(c.getY());*/
//To set x & y value
/*Point p=new Point(200,400);
d.manage().window().setPosition(p);*/
 
 

	}

}
