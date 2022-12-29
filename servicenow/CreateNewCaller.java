package servicenow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class CreateNewCaller {
	public static void main(String[] args) throws IOException {
		 ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
	ChromeDriver driver=new ChromeDriver(option);
	//Launch ServiceNow application
	driver.get("https://dev102013.service-now.com/now/nav/ui/classic/params/target/ui_page.do%3Fsys_id%3D620fe3909704211034c172571153af61");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 //Login with valid credentials username as admin and password as India@123
	 driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2$Trythebest");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	//Click-All and Enter Callers in filter navigator and press enter 
	Shadow shadow=new Shadow(driver);
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement element2 = shadow.findElementByXPath("//input[@id='filter']");
	element2.sendKeys("Callers");
	shadow.findElementByXPath("//span[text()='Callers']").click();
	
	//Create new Caller by filling all the fields and click 'Submit'.
	WebElement element = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	driver.switchTo().frame(element);
	
	driver.findElement(By.xpath("//button[text()='New']")).click();
	driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Divya");
	driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Durai");
	driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Chief Executive Officer");
	driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("divyaddddi55@gmail.com");
	driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("9999999999");
	driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("8888888888");
	driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	//Search and verify the newly created Caller"
String text = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
System.out.println(text);
}
}