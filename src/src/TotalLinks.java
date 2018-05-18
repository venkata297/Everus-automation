package src;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TotalLinks {
	
	WebDriver driver;
	@Test
	public void GetAllLinks() {
		driver= new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1376,768));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://staging.luxdraws.com/");
		
		List<WebElement> nooflinks= driver.findElements(By.tagName("iframe"));
		int size= nooflinks.size();
		System.out.println("no of iframes on this webpage is " + size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(nooflinks.get(i).getText());
		}
	}

}
