package testng_programs;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {

	
	@Test
	@Parameters({"username","password"})
	private void demo(@Optional("99")String username ,@Optional("99")int password) {
System.out.println("user:"+username);
System.out.println("password:"+password);
	}
	
	
	
	
	
	
	
}
