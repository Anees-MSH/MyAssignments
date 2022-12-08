package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	 public static void main(String[] args) {
		 //WebDriverManager.ChromeDriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Divya");
		 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Durai");
		 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("divyadurai59@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("567890");
		 WebElement Day=driver.findElement(By.name("birthday_day"));
		 Select dd=new Select(Day);
		 dd.selectByIndex(4);
		 WebElement Month=driver.findElement(By.name("birthday_month"));
		 Select mm=new Select(Month);
		 mm.selectByVisibleText("Sep");
		 WebElement Year=driver.findElement(By.name("birthday_year"));
		 Select yy=new Select(Year);
		 yy.selectByValue("1995");
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 
		 
		 
		 
		 
		 


	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
	 

}
