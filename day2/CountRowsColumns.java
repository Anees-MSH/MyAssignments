package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountRowsColumns {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
			 ChromeDriver driver=new ChromeDriver(option);
			 driver.get("https://html.com/tags/table/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			//to find the size of row size
				List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
				int rsize = rowData.size();
				System.out.println("Row size: "+rsize);
				
				//to find the size of the column
				List<WebElement> colData = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/td"));
				int csize = colData.size();
				System.out.println("Column Size: "+ csize );
	

}
}