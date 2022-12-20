package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Resize {
public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get("https://jqueryui.com/resizable/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 Actions find=new Actions(driver);
			 driver.switchTo().frame(0);
			 WebElement element = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle ui-resizable-se')]"));
						
			  find.clickAndHold(element).moveByOffset(600,500).release().perform();
			 
	

}
}