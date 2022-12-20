package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class select {
public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get("https://jqueryui.com/selectable/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 Actions find=new Actions(driver);
			 driver.switchTo().frame(0);
			 WebElement element=driver.findElement(By.xpath("//li[text()='Item 1']"));
			 WebElement element1=driver.findElement(By.xpath("//li[text()='Item 5']"));
			 find.clickAndHold(element).moveToElement(element1).release().perform();
			 
}
}
