package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Chittorgarh {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get(" https://www.chittorgarh.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      Actions find=new Actions(driver);
			 //click on stock market
			 WebElement element = driver.findElement(By.id("navbtn_stockmarket"));
			 find.click(element).perform();
			 //Click on NSE bulk Deals
			 WebElement element1 = driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']"));
			 find.click(element1).perform();
			 
			 //Get all the Security names
			 //column size
			 List<WebElement> colData = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr/td[3]"));
			 int csize = colData.size();
			System.out.println("Column Size: "+csize); 
			//add to list
			List<String>listNames=new ArrayList<String>();
			//all names in the field
			for(int i=1;i<=csize;i++) {			
				String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr["+i+"]/td[3]")).getText();
				//System.out.println(text);	
				listNames.add(text);
								
			}
			
			
			//list to set to get unique names
			Set<String>uniqueNames= new LinkedHashSet<String>(listNames);
			if(listNames.size()==uniqueNames.size())
			{
				System.out.println("No duplicates");
			}
			else
			{
				System.out.println("Duplicates");
			}
			
			//unique names 
			for (String string : uniqueNames) {
			System.out.println(string);
			}
			
			
			
			
			
			 
			 
			 
			 
			 

	}

}
