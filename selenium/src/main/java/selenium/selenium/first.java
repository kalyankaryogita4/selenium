package selenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class first {

    EdgeDriver driver; // Always use WebDriver interface

    void launch() {
     System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\yogitajava\\selenium\\driverresource\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
    }

    public static void main(String[] args) {
        first ob = new first();
        ob.launch();
    }
}