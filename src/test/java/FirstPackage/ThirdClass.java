package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdClass {

	@Parameters({"Para"})
	 @Test
	    public void thirdclass(String a)
	    {
	    	System.out.println(a);
	    	
	    }
	
	@Test
    public void vclass()
    {
    	System.out.println("v method");
    	
    }
	@Test(enabled=false) //enabled is used to skip
    public void nclass()
    {
    	System.out.println("false enabled method");
    	
    }
	
	 
	

}
