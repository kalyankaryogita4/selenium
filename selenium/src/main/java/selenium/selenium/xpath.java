package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {
	EdgeDriver driver;
	public void launch_demoblaze()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
	}
	void xpath_locator() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img")).click();
		
	}
	
	void css_selector()
	{
		//driver.findElement(By.cssSelector("a[id='login2']")).click();
		//driver.findElement(By.cssSelector("a#login2")).click();
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		xpath xp=new xpath();
		xp.launch_demoblaze();
		xp.css_selector();
		Thread.sleep(3000);
	}
}
