package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class fileupload  extends launch_demoreg{
void file() throws InterruptedException
{
	
 WebElement image=driver.findElement(By.id("imagesrc"));
	image.sendKeys("C:\\Users\\kalya\\OneDrive\\Pictures\\Screenshots\\resume.png");
	Thread.sleep(2000);
	driver.close();
}

public static void main(String args[]) throws InterruptedException {
	fileupload f=new fileupload();
	f.launch();
	f.file();
}
}
