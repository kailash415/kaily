package testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider ="test_data" )
	private void ouput(String username,int password) {
		System.out.println("username :" +username);
		System.out.println("username :" +password);
	}
	
	//  2d object
	@DataProvider
		private Object[][] test_data() {
       return new Object[][] {
    	   {"smith",198},
    	   {"kaily",123}  
       };
	}
	
	
	
	
	
	
	
	
}
