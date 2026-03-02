package selenium.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshothandling {
	EdgeDriver driver;
	private File src;	
	 void flipcart_launch()
	 { 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\git\\repository\\selenium\\driverresource\\msedgedriver.exe");
				driver =new EdgeDriver();			
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 }
	 
	 void screen_shot() throws IOException
	 {
		 File ts=driver.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\kalya\\OneDrive\\flipcartdashboard.jpg");
		 FileHandler.copy(src, dest);
	 }
	  void partial_ss() throws IOException
	  {
		  WebElement image=driver.findElement(By.xpath("//img[@alt='FLIPKART']"));
		  File src=image.getScreenshotAs(OutputType.FILE);
		  File destination=new File("C:\\Users\\kalya\\git\\cucumber-project\\automationtesting");
		  FileHandler.copy(src, destination);
	  }
	  
	 public static void main(String args[]) throws IOException
	 {
		 screenshothandling o=new screenshothandling();
		 o.flipcart_launch();
		 o.screen_shot();
		 o.partial_ss();
	 }
}
