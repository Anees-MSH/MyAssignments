package week2day2;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Link {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/link.xhtml");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.xpath("//a[text()='Broken?']"));
		driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[3]")).click();
		System.out.println("No of links :"+driver.findElements(By.tagName("a")).size());
		System.out.println("No of links in layout :"+driver.findElements(By.xpath("(//a[@class='ui-link ui-widget'])[4]")).size());
	    //driver.close();
	
}
}