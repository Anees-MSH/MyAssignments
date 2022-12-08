package week2day2;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Button {
	public static void main(String[] args) {
		 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/button.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled());
		 System.out.println( driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation());
		 System.out.println( driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).getCssValue("background"));
		 System.out.println( driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize());
		 System.out.println( driver.findElement(By.xpath("//span[text()='Success']")).getCssValue("background-color"));
		 driver.findElement(By.xpath("//span[text()='Image']")).click();
		 driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']"));
		 
		 
		 

}
}
