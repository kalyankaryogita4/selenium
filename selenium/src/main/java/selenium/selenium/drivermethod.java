package selenium.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class drivermethod {

    EdgeDriver driver;

    void launch() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    void practice_form() throws InterruptedException {

        // ===== Basic Details =====

        driver.findElement(By.id("name")).sendKeys("Yogita");
        driver.findElement(By.id("email")).sendKeys("yogita@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9876543210");
        driver.findElement(By.id("textarea")).sendKeys("Mumbai, Maharashtra");

        // ===== Gender =====
        driver.findElement(By.id("female")).click();

        // ===== Days =====
        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("friday")).click();

        // ===== Country Dropdown =====
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("India");

        // ===== Colors (Multiple Select Dropdown) =====
        Select colors = new Select(driver.findElement(By.id("colors")));
        colors.selectByVisibleText("Red");
        colors.selectByVisibleText("Green");

        // ===== Sorted List (Animals) =====
        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Cat");
        animals.selectByVisibleText("Dog");

        // ===== Date Picker 1 (mm/dd/yyyy) =====
        driver.findElement(By.id("datepicker")).sendKeys("02/28/2026");

        // ===== Date Picker 2 (dd/mm/yyyy) =====
        driver.findElement(By.id("txtDate")).sendKeys("28/02/2026");

        // ===== Date Picker 3 (Date Range) =====
        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]"))
                .sendKeys("01-03-2026");

        driver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]"))
                .sendKeys("05-03-2026");

        // ===== Submit Button =====
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(3000);
    }

    public static void main(String args[]) throws InterruptedException {

        drivermethod ob = new drivermethod();
        ob.launch();
        ob.practice_form();
    }
}