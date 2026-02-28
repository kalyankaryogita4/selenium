package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	EdgeDriver driver;

    void launch() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
    void mousehover()
    {
    Actions act=new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath("//span[text()='Fresh']"))).build().perform();
    }
    
    public static void main(String args[])
    {
    	actionclass ac=new actionclass();
    	ac.launch();
    	ac.mousehover();
    }
    
}
