package FirstPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthClass {
   @Test(dataProvider="seen")
   public void datap(String ll, String mm)
   {
	   System.out.println(ll + mm);
	  // System.out.println(mm);
	   
	   
   }
   
   @DataProvider
   public Object[][] seen()
   {
	   Object[][] a = new Object[2][2];
	   //a[Rows][Column];
	   a[0][0]="first";
	   a[0][1]="second";
	   a[1][0]="third";
	   a[1][1]="fourth";
	   return a;
	   
   }
}
