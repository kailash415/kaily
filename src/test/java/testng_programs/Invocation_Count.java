package testng_programs;


import org.testng.annotations.Test;

public class Invocation_Count {

	@Test
	private void setproperty() {
System.out.println("setproperty");
	}
	
	
	@Test
	private void browser() {
		System.out.println("browser");

	}
	@Test(invocationCount = 2)
	private void refresh() {
			System.out.println("refresh");


	}
	@Test
	private void url() {
			System.out.println("url");


	}
	
}
