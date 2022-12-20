package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbsoluteValuesInLibrary {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get("https://html.com/tags/table/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         
			 List<WebElement> values= driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[2]/td"));
			 int size = values.size();
			 System.out.println(size);
	
	for (int i = 1; i <= size; i++) {
		String text = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[2]/td["+i+"]")).getText();
		System.out.println(text);
		
	}
	
	}
	
}
