package marathonBasicSeleniumandXpath;

import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase2 {
	
	public static void main(String[] args)throws InterruptedException {
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://in.bookmyshow.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Avatar: The Way of Water')]")).click();
	
	driver.findElement(By.id("wzrk-confirm")).click();
	
	WebElement e = driver.findElement(By.xpath("//a[contains(text(),'SPI Palazzo: Nexus Vijaya Mall, Vadapalani,Chennai')]"));

	//using getText method the retrieve the text of the element

	System.out.println(e.getText());
	
	driver.findElement(By.className("venue-info-text")).click();
	
	WebElement parkAvail = driver.findElement(By.xpath("//div[contains(@class,'facility-text')]"));
	
	 if (parkAvail.isDisplayed()) {
         System.out.println("Parking is available. " + parkAvail.isDisplayed());
     } else {
         System.out.println("Parking is not available. " + parkAvail.isDisplayed());
     }
	 
	 driver.findElement(By.className("cross-container")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'12:10 PM')]")).click();
		
		driver.findElement(By.id("btnPopupAccept")).click();
		
		driver.findElement(By.id("pop_1")).click();
		
		driver.findElement(By.id("proceed-Qty")).click();
		
		driver.findElement(By.id("A_9_0110")).click();
		
		driver.findElement(By.id("btnSTotal_reserve")).click();
		
		WebElement subTotal = driver.findElement(By.xpath("//span[contains(text(),'Rs.263.54')]"));
		String valueSub=subTotal.getText();
				
				System.out.println(valueSub+" "+subTotal.getText());
	}
}
