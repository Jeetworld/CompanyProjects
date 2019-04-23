package FirstPackage;

import org.testng.annotations.Test;

public class firstClassTest {
  
	@Test(groups= {"a"})
	public void zero()
	{
			System.out.println("FMC");
	}	
	
	@Test(dependsOnMethods={"zero"})
	public void abc()
	{
		System.out.println("abc method");
	}
	
	@Test(groups= {"b"})
	public void jack()
	{
			System.out.println("jack");
	}	
	
	@Test(groups= {"b"})
	public void joshh()
	{
			System.out.println("josh");
	}	
	
	@Test(groups={"a"})
	public void rony()
	{
			System.out.println("rony");
	}	
	

  
}
