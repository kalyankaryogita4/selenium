package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class newwindow {

	EdgeDriver driver;	
	 void launch_amazon()
	 { 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\git\\repository\\selenium\\driverresource\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 driver.get("https://www.amazon.in/");
		 
}
	 void newtab()
	 {
		WebElement w_page=driver.findElement(By.id("a-page")); 
		w_page.sendKeys(Keys.CONTROL+"t");//using keys enum
		driver.navigate().to("https://www.unipune.ac.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);//using new method window
		driver.navigate().to("https://www.fortunecloudindia.com/leadership-award-2026");
	 }
	 void newwindow1()
	 {
		driver.switchTo().newWindow(WindowType.WINDOW);//switching to new window
		driver.navigate().to("https://socialoffline.in/restaurant/fc-road-social/");
		driver.quit();
	 }
	public static void main(String args[]) 
	{
		newwindow nw=new newwindow();
		nw.launch_amazon();
		nw.newtab();
	}
}
