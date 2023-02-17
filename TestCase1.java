package marathonBasicSeleniumandXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chenn");
		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bang");
		
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath("//td[text()='17']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		// Locating the element 

		WebElement e = driver.findElement(By.xpath("//span[text()='104']"));

		//using getText method the retrieve the text of the element

		System.out.println(e.getText());
		
		WebElement SlChkBox = driver.findElement(By.xpath("//input[@id='bt_SLEEPER']"));
        driver.executeScript("arguments[0].click();", SlChkBox);
		
		WebElement e1 = driver.findElement(By.xpath("//div[contains(text(),'Yolo')]"));

		//using getText method the retrieve the text of the element

		System.out.println(e1.getText());
		
		   String title = driver.getTitle();

			System.out.println(title);
			
		

		
		
		
		
		
}
}
