package week4.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 //1)load url
			 driver.get("https://www.amazon.in/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 Actions find=new Actions(driver);
			// 2.search as oneplus 9 pro 
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			 
			 
			 //3.Get the price of the first product
			 System.out.println("Price of the first product :"+driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText());
			 find.scrollByAmount(0, 300).perform();
			 //4. Print the number of customer ratings for the first displayed product
			 
			 //5. Mouse Hover on the stars
			 WebElement element = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']"));
			 element.click();
			 find.moveToElement(element).perform();
			 System.out.println("Customer rating of the first product :" +driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText());
		
			 //6. Get the percentage of ratings for the 5 star.
	         WebElement element2 = driver.findElement(By.xpath("(//a[contains(@title,'5 stars represent 25% of rating')])[3]"));
	         find.moveToElement(element2).perform();
	         System.out.println("Percentage rating for the 5 star:"+element2.getText());
			 //7. Click the first text link of the first image
			Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M04 Light Green, 4GB RAM, 128GB Stora')]")).click();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> window =new ArrayList<String>(windowHandles);
			driver.switchTo().window(window.get(1));
			 //8. Take a screen shot of the product displayed
			Thread.sleep(1000);
			File source=driver.getScreenshotAs(OutputType.FILE);
			File destination=new File("./snap/pic.jpeg");
			FileUtils.copyFile(source, destination);
			 //9. Click 'Add to Cart' button
			find.scrollByAmount(0, 400).perform();
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			 //10. Get the cart subtotal and verify if it is correct.
			System.out.println("Cart subtotal:"+driver.findElement(By.xpath("//span[contains(@id,'attach-accessory-cart-total-string')]/b")).getText());
			driver.quit();
	
}
}