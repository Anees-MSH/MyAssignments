package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get("http://leaftaps.com/opentaps/control/login");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.findElement(By.id("username")).sendKeys("DemoCSR");
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Contacts")).click();
			 driver.findElement(By.linkText("Merge Contacts")).click();
			 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
			 String windowHandle = driver.getWindowHandle();
			 System.out.println(windowHandle);
			 Set<String> windowHandles = driver.getWindowHandles();
			 List<String>window=new ArrayList<String>(windowHandles);
			 System.out.println(window);
			 driver.switchTo().window(window.get(1));
			driver.findElement(By.xpath("//a[text()='Mohammed']")).click();
			driver.switchTo().window(window.get(0));
			 
			 
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			String windowHandle1 = driver.getWindowHandle();
			 System.out.println(windowHandle1);
			 Set<String> windowHandles1 = driver.getWindowHandles();
			 List<String>window1=new ArrayList<String>(windowHandles1);
			 System.out.println(window1);
			 driver.switchTo().window(window1.get(1));
		     driver.findElement(By.xpath("//a[text()='srikanth']")).click();
		     driver.switchTo().window(window1.get(0));
			 driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
			//accept alert
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
			 //get title
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			 
			 
			 
		

	}

}
