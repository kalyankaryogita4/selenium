package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingslider {
	EdgeDriver driver;	
	 void launch()
	 { 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\git\\repository\\selenium\\driverresource\\msedgedriver.exe");
				driver =new EdgeDriver();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	 
	 void leftslider() {
	WebElement left=driver.findElement(By.xpath("//span[@style='left: 2.6%;']"));
	Actions ac=new Actions(driver);
	ac.dragAndDropBy(left,120,0).build().perform();
	 }
	 
	 public static void main(String args[])
	 {
		 handlingslider ha=new handlingslider();
		 ha.launch();
		 ha.leftslider();
	 }
}
