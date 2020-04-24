package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertProgram {
	WebDriver driver;
	
  @BeforeClass
  public void beforeclass(){
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://uitestpractice.com/");
	  
  }
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://uitestpractice.com/");
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[7]/a")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
	  String poptext=driver.switchTo().alert().getText();
	  System.out.println(poptext);
	  driver.switchTo().alert().accept();
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rose");
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Opens in a new window")).click();
	  driver.findElement(By.linkText("Select")).click();
  }
  @AfterClass
  public void afterclass(){
	  driver.close();
  }
}
	  
 
  
  
