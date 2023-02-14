package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class LaunchApplicationByXpath_week2day2Ass1 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.Facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shyamala");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vedachalam");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080517496");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Nanda@123");
		
		WebElement sourceDropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		// Create an object for Select class and pass the dd webelement

		Select dd = new Select(sourceDropdown);
		// select using visible text
        dd.selectByValue("2");
        
    	WebElement sourceDropdown1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		// Create an object for Select class and pass the dd webelement

		Select dd1 = new Select(sourceDropdown1);
		// select using visible text
        dd1.selectByValue("10");
        
    	WebElement sourceDropdown2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		// Create an object for Select class and pass the dd webelement

		Select dd2 = new Select(sourceDropdown2);
		// select using visible text
        dd2.selectByValue("1986");
        
        
        driver.findElement(By.xpath("//input[@value='1']")).click();
	}
 
}