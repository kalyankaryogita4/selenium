package selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class blogspot {
	EdgeDriver driver;
	void launch()throws InterruptedException 
	{
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown =driver.findElement(By.id("colors"));
		Select color =new Select(dropdown);
		color.selectByIndex(4);
		System.out.println("dropdown selection successfull");
		Thread.sleep(2000);
	}
	
	void sorted_list()
	{
		WebElement dropdown =driver.findElement(By.id("animals"));
		Select list =new Select(dropdown);
		list.selectByIndex(5);
		System.out.println("list is display");
	}
	
	void date1() throws InterruptedException 
	{
		WebElement date =driver.findElement(By.id("datepicker"));
		date.click();
		date.sendKeys(Keys.CONTROL+"a");
		date.sendKeys("12/02/2026");
		date.sendKeys(Keys.ENTER);
		System.out.println("date picker is display");
		Thread.sleep(2000);
	}
	
	void date_range() throws InterruptedException
	{
		driver.findElement(By.id("start-date")).sendKeys("12/04/2027");
		driver.findElement(By.id("end-date")).sendKeys("17/08/2029");
		driver.findElement(By.className("submit-btn")).click();
		System.out.println("date range is display");
		Thread.sleep(2000);
	}
	
	void upload_file()
	{
		WebElement upload =driver.findElement(By.id("singleFileInput"));
		upload.sendKeys("C:\\Users\\kalya\\yogitajava\\selenium");
		System.out.println("file is upload");
	}
	 void webtable() throws InterruptedException
	 {
		 driver.findElement(By.name("BookTable")).click();
		 System.out.println("webtable is display");
		 Thread.sleep(2000);
	 }
	 
	 void pagination_table() throws InterruptedException
     {
    	 driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr[1]/td[4]/input")).click();
         System.out.println("Pagination checkbox clicked");
         Thread.sleep(2000);
     }
     void svg() throws InterruptedException
     {
    	 WebElement svgElement = driver.findElement(By.xpath("//*[local-name()='svg']"));

         if (svgElement.isDisplayed()) {
             System.out.println("SVG is visible");
         } else {
             System.out.println("SVG not visible");
         }
         Thread.sleep(2000);
     }
     
  void scrolling_dropdown() throws InterruptedException
  {
	   WebElement sc=driver.findElement(By.id("dropdown"));
	   Select dropdown=new  Select(sc);
	   dropdown.deselectByIndex(3);
	   System.out.println(" scrolling dropdown is display");
	   Thread.sleep(2000);
  }
  
  void mobile_links() throws InterruptedException
  {
	  driver.findElement(By.id("samsung")).click();
	  driver.findElement(By.id("realme")).click();
	  driver.findElement(By.id("moto")).click();
	  System.out.println(" link is work properly");
	  Thread.sleep(2000);
  }
   void  laptops_links() throws InterruptedException
   {
	   driver.findElement(By.id("apple")).click();
	   driver.findElement(By.id("lenovo")).click();
	   driver.findElement(By.id("dell")).click();
	   Thread.sleep(2000);
   }
    void shadow_dom() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"shadow_host\"]//input[3]")).click();
    	Thread.sleep(2000);
    }
    
     void  form() throws InterruptedException
     {
    	 driver.findElement(By.id("input1")).sendKeys("saurabh");
    	 driver.findElement(By.id("btn1")).click();
    	 System.out.println(" section 1 is display");
    	 driver.findElement(By.name("input2")).sendKeys("vaibhav");
    	 driver.findElement(By.className("rectangular-button")).click();
    	 System.out.println(" section 2 is display");
    	 Thread.sleep(2000);
     }
     
    void footer_links() throws InterruptedException
    {
    	driver.findElement(By.tagName("a")).click();
    	 System.out.println(" link is open");
    	 
    	driver.findElement(By.linkText("Hidden Elements & AJAX")).click();
    	System.out.println(" hidden link is open");
    	
    	driver.findElement(By.linkText("Download Files")).click();
    	System.out.println(" download folder is open");
    	Thread.sleep(2000);
    }
public static void main(String[] args) throws InterruptedException {
	blogspot obj = new blogspot();
    obj.launch();
   obj.sorted_list();
   obj.date1();
   //obj.date2();
   obj.date_range();
   obj.upload_file();
  //obj.webtable();
   obj.pagination_table();
   obj.svg();
   //obj.scrolling_dropdown();
   obj.mobile_links();
   //obj.shadow_dom();
   obj.form();
   obj.footer_links();
   obj.driver.quit();   
}
}

