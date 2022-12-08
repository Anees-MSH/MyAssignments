package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//span[text()='Email']")).click();
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("divyadurai59@gmail.com");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText());
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	
	driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("16569");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	System.out.println(driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
	
			
			
	}

}
