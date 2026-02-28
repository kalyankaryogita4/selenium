package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
	
	public class MyntraTest {

	    public static void main(String[] args) throws InterruptedException {

	        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	        
	        EdgeDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.myntra.com/");

	        // Search for Shoes
	        driver.findElement(By.className("desktop-searchBar")).sendKeys("Shoes");
	        driver.findElement(By.className("desktop-submit")).click();

	        Thread.sleep(3000);

	        // Click first product
	        driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();

	        Thread.sleep(5000);

	        driver.quit();
	    }
	}

