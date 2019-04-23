package FirstPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secodnTest {
	

		@Test
	public void solid() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		//d.get("https://iut.trans.oati.com/tes_devtrans/tes-login.wml");
		//Thread.sleep(10000);
		//Runtime.getRuntime().exec("C:\\Users\\KamaljitS\\Desktop\\AutoIt Scripts\\AutoItScript.exe");
		/* d.get("https://mvnrepository.com/");
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@id='query']")).sendKeys("selenium");
		d.findElement(By.xpath("//input[@value='Search' and @type='submit']")).click();
		d.findElement(By.linkText("Selenium Java")).click();
		d.findElement(By.xpath("//a[@href='selenium-java/3.141.59']")).click();
		String ab= d.findElement(By.xpath("//*[@id='maven-a']")).getText();
		System.out.println(ab); */
		
		
		
		
		
		

	}

}
