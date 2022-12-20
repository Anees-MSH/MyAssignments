package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 //1)load url
			 driver.get(" https://www.snapdeal.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 //2. Go to Mens Fashion
			 
			 Actions find=new Actions(driver);
				
				WebElement element = driver.findElement(By.xpath("//span[@class='catText']"));
				find.moveToElement(element).perform();
				
			 //3. Go to Sports Shoes
				WebElement element1 = driver.findElement(By.xpath("//span[@class='linkTest']"));
				find.click(element1).perform();
			 //4. Get the count of the sports shoes
				String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
				System.out.println("Count of shoes"+count);

				
			 //5. Click Training shoes
				//driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
				//6. Sort by Low to High
				
				
				driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
				driver.findElement(By.xpath("//li[@class='search-li']")).click();
				
			 //7. Check if the items displayed are sorted correctly
				
			 //8.Select the price range (900-1200)
				
				
				find.pause(600).scrollByAmount(0, 400).perform();
				driver.findElement(By.name("fromVal")).clear();
				driver.findElement(By.name("fromVal")).sendKeys("900");
				driver.findElement(By.name("fromVal")).click();
				driver.findElement(By.name("toVal")).clear();
				driver.findElement(By.name("toVal")).sendKeys("1200");
				driver.findElement(By.name("toVal")).click();
				driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
				
			 //9.Filter with color Navy 
				
				WebElement element4 = driver.findElement(By.xpath("(//button[text()='View More '])[1]"));
				find.scrollToElement(element4).click(element4).perform();
				
				//WebElement element5 = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
				//find.scrollToElement(element5).click(element5).perform();
			 //10 verify the all applied filters 
				
			 //11. Mouse Hover on first resulting Training shoes
				find.scrollByAmount(0, 200).perform();
				WebElement element2 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
				find.moveToElement(element2).perform();

				
				
			 //12. click QuickView button
				//find.scrollByAmount(0, 300).perform();
				WebElement element3 = driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"));
				find.scrollToElement(element3).click(element3).perform();
				
			 //13. Print the cost and the discount percentage
				
				String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
				System.out.println("Price of the shoe:"+price);
				String percentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
				System.out.println("Percentage:"+percentage);
			 //14. Take the snapshot of the shoes.
				Thread.sleep(2000);
				File source=driver.getScreenshotAs(OutputType.FILE);
				File destination=new File("./snap/img.jpeg");
				FileUtils.copyFile(source, destination);
				
			 //15. Close the current window
				driver.close();
			 //16. Close the main window
				driver.quit();


}
}