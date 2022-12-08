package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@id='ext-gen250']")).sendKeys("P");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=16388']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ARS");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText());
		driver.close();
		
		
		
		
		
		
		
		
		
}
}
