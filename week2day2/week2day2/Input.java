package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Input {
	public static void main(String[] args) {
		 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Divya");
		 driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
		 driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Banglore");
		System.out.println(driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled());
		 driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		 System.out.println(driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value"));
		 driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("divyadurai@gmail.com");
		 driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Nov batch Non IT to IT");
		 driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Nov batch Non IT to IT");
		 driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
		 System.out.println(driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText());
		 
	

	
}
}