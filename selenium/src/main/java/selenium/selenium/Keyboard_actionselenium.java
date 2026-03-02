package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Keyboard_actionselenium {
	EdgeDriver driver;	
	 void launch()
	 { 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\git\\repository\\selenium\\driverresource\\msedgedriver.exe");
				driver =new EdgeDriver();			
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 }
	  void search() {
		 WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		 //enter key
		 se.sendKeys("software tester");
		 se.sendKeys(Keys.ENTER);
	 }
	  
	 void cpypaste()
	  {
		  WebElement name= driver.findElement(By.id("name"));
	  name.sendKeys("yogita");
	  name.sendKeys(Keys.CONTROL+"A");
	  name.sendKeys(Keys.CONTROL+"C");
	 }
	 
	  void delete() throws InterruptedException
	  {
		  WebElement se=driver.findElement(By.id("wikipedia1_wikipedia-search-input"));
	      se.sendKeys("java");
	      Thread.sleep(2000);
	      se.sendKeys(Keys.CONTROL+"A");
	      se.sendKeys(Keys.DELETE);
	  }
	  public static void main(String[] args) {
		  Keyboard_actionselenium ob=new Keyboard_actionselenium();
		  ob.launch();
	}
}
