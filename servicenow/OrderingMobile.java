package servicenow;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class OrderingMobile {

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
	 //Click-AllEnter Service catalog in filter navigator and press enter
	Shadow shadow=new Shadow(driver);
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	shadow.setImplicitWait(10);
	shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
	shadow.setImplicitWait(10);
	shadow.findElementByXPath("//span[text()='Service Catalog']").click();
	 //Click on  mobiles
	shadow.setImplicitWait(10);
	WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(element);
	driver.findElement(By.xpath("//table//a[text()='Mobiles']")).click();
	

   //Select Apple iphone6s
	driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
	//Update color field to rose gold and storage field to 128GB
	
	driver.findElement(By.xpath("//label[text()='No']")).click();
	driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")).click();
	driver.findElement(By.xpath("//option[@value='Unlimited']")).click();
	driver.findElement(By.xpath("//label[text()='Blue']")).click();
	driver.findElement(By.xpath("//label[text()='128 GB']")).click();
	// Select  Order now option
	driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	 //Verify order is placed and copy the request number"
	WebElement element2 = shadow.findElementByXPath("//div[@class='notification notification-success']");
	//driver.switchTo().frame(element2);
	String text = element2.getText();
	System.out.println(text);
	String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
	System.out.println("Request Number"+text2);

}
}