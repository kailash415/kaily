package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
// (retryAnalyzer = Retry_Class.class)
	@Test
	private void demo() {

		String D_name="kailash";
		String actual_name="kailash";	
		Assert.assertEquals(D_name, actual_name);
	}
	@Test
	private void dummy() {
		String D_password="kailash@123";
		String actual_password="strac@123";	
		Assert.assertEquals(D_password, actual_password);

	}
	
	
	
	
	
	
	
}
