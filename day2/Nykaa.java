package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 //1)load url
			 driver.get("https://www.nykaa.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			 //2) Mouseover on Brands 
			 Actions find=new Actions(driver);
			 WebElement element = driver.findElement(By.xpath("//a[text()='brands']"));
			 find.moveToElement(element).perform();
			 
			// Search L'Oreal Paris
			 Thread.sleep(10000);
			 WebElement element2 = driver.findElement(By.id("brandSearchBox"));
		     find.sendKeys(element2,"L'Oreal Paris").perform();
			
		     //3) Click L'Oreal Paris
		    Thread.sleep(10000);
		    
		     WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'Paris')]"));
			 find.click(element3).perform();
			 
			 // 4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			 //5) Click sort By and select customer top rated
			 driver.findElement(By.xpath("//span[@class='sort-name']")).click();
			 driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
			 
			 
			 //6) Click Category and click Hair->Click haircare->Shampoo
			 find.scrollByAmount(0, 300).perform();
			 driver.findElement(By.xpath("//span[text()='Category']")).click();
			 driver.findElement(By.xpath("//span[text()='Hair']")).click();
			 driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
			 driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
			 
			 
			 //7) Click->Concern->Color Protection
			 find.scrollByAmount(0, 500).perform();
			 driver.findElement(By.xpath("//span[text()='Concern']")).click();
			 driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			 //8)check whether the Filter is applied with Shampoo
			 //find.scrollByAmount(300, 0).perform();
			String text = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
			System.out.println("What the filter is applied with :"+text);
	
			 
			 //9) Click on L'Oreal Paris Colour Protect Shampoo
			driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
			 //10) GO to the new window and select size as 175ml
			Set<String> windowHandles = driver.getWindowHandles();
			List<String>window=new ArrayList<String>(windowHandles);
			driver.switchTo().window(window.get(1));
			driver.findElement(By.xpath("//select[@title='SIZE']")).click();
			driver.findElement(By.xpath("//option[text()='175ml']")).click();
			 //11) Print the MRP of the product
			String text2 = driver.findElement(By.xpath("//span[@class='css-u05rr']")).getText();
			System.out.println("Mrp of the shampoo:"+text2);
			 //12) Click on ADD to BAG
			driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
			 //13) Go to Shopping Bag 
			driver.findElement(By.xpath("//span[@class='cart-count']")).click();
			 //14) Print the Grand Total amount
			String text3 = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']")).getText();
			System.out.println("Print the grand total:"+text3);
			 //15) Click Proceed
			driver.findElement(By.xpath("//span[text()='Proceed']")).click();
			 //16) Click on Continue as Guest
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
			 //17) Check if this grand total is the same in step 14
			driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
			String text4 = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText();
			System.out.println("Grand total :"+text4);
			 //18) Close all windows
			driver.close();
	}
}
