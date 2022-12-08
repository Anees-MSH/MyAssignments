package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Venba");
			driver.findElement(By.id("lastNameField")).sendKeys("Lingaraja");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("VenbaRaja");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raja");
			driver.findElement(By.name("departmentName")).sendKeys("Play");
			driver.findElement(By.id("createContactForm_description")).sendKeys("Play Eat sleep");
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("divyaraja@gmail.com");
			WebElement Source =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			Select ss = new Select(Source);
			ss.selectByVisibleText("Indiana");
			
	        driver.findElement(By.className("smallSubmit")).click();
	        driver.findElement(By.xpath("//a[text()='Edit']")).click();
	        driver.findElement(By.id("updateContactForm_description")).clear();
	        driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testleaf");
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	        String title = driver.getTitle();
	        System.out.println(title);
	        
	        
	        
			
			
	
}
}