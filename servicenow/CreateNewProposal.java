package servicenow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class CreateNewProposal {
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
	// Click All and Enter Proposal in filter navigator and press enter 
	Shadow shadow=new Shadow(driver);
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement element2 = shadow.findElementByXPath("//input[@id='filter']");
	element2.sendKeys(" Proposal");
	shadow.findElementByXPath("//span[text()='My Proposals']").click();
	 //Click- new  and  fill mandatory fields and click 'Submit' button
	//driver.switchTo().frame("gsft_main");
	WebElement element = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	driver.switchTo().frame(element);
	driver.findElement(By.xpath("//button[text()='New']")).click();
	String text2 = driver.findElement(By.xpath("//input[@id='std_change_proposal.number']")).getText();
	System.out.println(text2);
	driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Description");
	driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	 
	 //Verify the successful creation of new Proposal"
String text = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
System.out.println(text);
if(text==text2);
{
	System.out.println("Sucessful creation of new proposal");
}
}
}