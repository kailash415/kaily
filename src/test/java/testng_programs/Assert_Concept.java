package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	@Test
	private void demo() {
    
		String D_name="kailash";
		String actual_name="strac";
		
		System.out.println("welcome to sign in page ");
		
//		Assert.assertEquals(D_name, actual_name);
		
//		Assert.assertNotEquals(actual_name, D_name);
		
		Assert.assertNull(D_name);
		
		System.out.println("Welcome to home page");
	}
	
	
	
	
}
