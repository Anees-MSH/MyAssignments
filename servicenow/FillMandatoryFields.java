package servicenow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class FillMandatoryFields {
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
	//Enter Knowledge  in filter navigator and press enter
	Shadow shadow=new Shadow(driver);
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement element2 = shadow.findElementByXPath("//input[@id='filter']");
	element2.sendKeys("Knowledge");
	shadow.findElementByXPath("//span[text()='Knowledge']").click();
	
	//Create new Article 
	WebElement element = shadow.findElementByXPath("//iframe[@name='gsft_main']");
	driver.switchTo().frame(element);
	
	driver.findElement(By.xpath("//span[@class='btn-icon icon-article-document homepage-icon']")).click();
	//Select knowledge base as IT and category as IT- java and Click Ok
	driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
	//driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("IT-Java");
	//Update the other mandatory fields
	driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("NON IT to IT");
	//Select the submit option
	driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	
    

}
}