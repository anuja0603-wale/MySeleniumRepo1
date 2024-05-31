package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test(priority = 2)
  public void createAccount ()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.chennaisuperKings.com/");
	  System.out.println("account is created");
  }
  @Test(priority = 1)
  public void modifyAccount() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.royalchallengers.com/");
	  System.out.println("Account is modify");
  }
  @Test(priority = 0)
  public void DeleteAccount() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  System.out.println("Account is deleted");
  }
}
