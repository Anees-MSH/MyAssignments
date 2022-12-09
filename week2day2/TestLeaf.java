package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestLeaf {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/select.xhtml");
		 driver.manage().window().maximize();
		 WebElement fav =driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		 Select ff=new Select(fav);
		 ff.selectByVisibleText("Selenium");
		
		 
		 WebElement country =driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		 Select cc=new Select(country);
		 cc.selectByVisibleText("India");
		 
		 WebElement city =driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		 Select cy=new Select(city);
		 cy.selectByVisibleText("Bengalure");
		 
		 WebElement course =driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
		 Select co=new Select(course);
		 co.selectByVisibleText("Selenium WebDriver");
		 
		 WebElement lang =driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']"));
		 Select ll=new Select(lang);
		 ll.selectByVisibleText("English");

		 WebElement chosen =driver.findElement(By.xpath("//label[@id='j_idt87:value_label']"));
		 Select ch=new Select(chosen);
		 ch.selectByVisibleText("Two");
		
		 
		 
		 
		 
		 
		 
		 
		 
	

}
}