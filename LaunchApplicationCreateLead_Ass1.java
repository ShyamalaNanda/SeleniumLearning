package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplicationCreateLead_Ass1 {
	
public static void main(String args[]) throws InterruptedException{
		
		EdgeDriver driver = new EdgeDriver();
 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Shyamala");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shyamala");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vedachalam");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shyamala");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Computer Science");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shyam.chennai42@gmail.com");
		
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		// Create an object for Select class and pass the dd webelement

		Select dd = new Select(sourceDropdown);
		// select using visible text
        dd.selectByVisibleText("New York");

       driver.findElement(By.className("smallSubmit")).click();
		
       String title = driver.getTitle();

		System.out.println(title);
	}

}
