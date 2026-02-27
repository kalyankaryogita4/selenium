package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ohrm {
	EdgeDriver driver;
void launch()
{
    driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
    void login()
    {
    	//driver.findElement(By.name("username")).sendKeys("admin");
    	//driver.findElement(By.name("password")).sendKeys("admin@123");
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    }
    public static void main(String args[])
    {
    	ohrm o=new ohrm();
    	o.launch();
    	o.login();
    }
}
