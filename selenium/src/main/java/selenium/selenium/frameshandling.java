package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class frameshandling 
{

	EdgeDriver driver;	
	 void launch_demoreg()
	 { 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\git\\repository\\selenium\\driverresource\\msedgedriver.exe");
		 driver=new  EdgeDriver();
		 driver.get("https://demo.automationtesting.in/Frames.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
	 
	 void frame() 
	 {
		 WebElement wt=driver.findElement(By.id("singleframe"));
	 driver.switchTo().frame(wt);
	 driver.findElement(By.tagName("input")).sendKeys("mina");;
		
	 }
	 
	 public static void main(String args[])
	 {
		 frameshandling fr=new frameshandling();
		 fr.launch_demoreg();
		 fr.frame();
	 }
}
