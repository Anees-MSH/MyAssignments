package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 //1)load url
			 driver.get(" https://www.myntra.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// 2) Mouse hover on MeN 
			 Actions find=new Actions(driver);
			 WebElement element = driver.findElement(By.xpath("//a[text()='Men']"));
			 find.moveToElement(element).perform();
			  //3) Click Jackets
			 WebElement element2 = driver.findElement(By.xpath("//a[text()='Jackets']"));
			 find.click(element2).perform();
			 //4) Find the total count of item 
			 
			System.out.println("Total count of item:"+driver.findElement(By.xpath("//span[@class='title-count']")).getText());
			 //5) Validate the sum of categories count matches
			WebElement element3 = driver.findElement(By.xpath("//span[@class='categories-num']"));
			
			WebElement element4 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]"));
			
			System.out.println("sum of category count mataches:"+(element3.getText()+element4.getText()));
			
			 //6) Check jackets
			driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
			 //7) Click + More option under BRAND
			driver.findElement(By.xpath("//div[@class='atsa-more']")).click();
			 //8) Type Duke and click check box
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite filter-search-iconSearch sprites-search']")).click();
			driver.findElement(By.xpath("//input[@class='filter-search-inputBox']")).sendKeys("duke");
			driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
			 //9) Close the pop-up x
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite filter-search-closeSearch sprites-remove']")).click();
			find.scrollByAmount(0, 500).perform();
			 //10) Confirm all the Coats are of brand Duke
			//Hint : use List 
			List<WebElement> elements = driver.findElements(By.tagName("h3"));
			System.out.println(elements.size());
			for(int i=1;i>=elements.size();i++) 
			{
			System.out.println("names"+ elements.get(i).getText());
			}
			
			 //11) Sort by Better Discount
			find.scrollByAmount(0, 2000).perform();
			driver.findElement(By.xpath("(//label[@class='common-customRadio vertical-filters-label'])[5]")).click();
			 //12) Find the price of first displayed item
			System.out.println("Price of the first displayed product:"+driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText());
			 //Click on the first product
			driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
			 //13) Take a screen shot
			Set<String> windowHandles = driver.getWindowHandles();
			List<String>window=new ArrayList<String>(windowHandles);
			driver.switchTo().window(window.get(1));
			Thread.sleep(1000);
			File source=driver.getScreenshotAs(OutputType.FILE);
			File destination=new File("./snap/pic2.jpeg");
			FileUtils.copyFile(source, destination);
			
			
			 //14) Click on WishList Now
			driver.close();
			driver.switchTo().window(window.get(0));
			
			 //15) Close Browser
			driver.close();
			

	

}
}