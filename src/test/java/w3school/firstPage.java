package w3school;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstPage {
	
		
	@Test
	public void startUp()
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/");
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Learn SQL")).click();
		 driver.findElement(By.xpath("//a[@class='w3-btn w3-margin-bottom']")).click();
		 driver.findElement(By.xpath("//*[@class=' CodeMirror-line ']")).clear();
		 
				
	}
	
	
	
	

}
