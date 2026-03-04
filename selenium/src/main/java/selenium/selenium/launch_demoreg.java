package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class launch_demoreg {
	EdgeDriver driver;

    void launch() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
    
}
