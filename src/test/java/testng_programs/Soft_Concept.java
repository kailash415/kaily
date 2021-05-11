package testng_programs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Concept {

	@Test
	private void demo() {
		// TODO Auto-generated method stub


		String D_name="kailash";
		String actual_name="strac";
		SoftAssert soft= new SoftAssert();
		
		soft.assertEquals(D_name, actual_name);
		System.out.println("soft done");
	}
	
	
}
