package testng_programs;

import org.testng.annotations.Test;

public class Group_Of_Group {
	@Test(groups = "electronic")
	private void laptop() {
System.out.println("laptop");
	}
	@Test(groups = "electronic")
	private void moblie() {
System.out.println("moblie");
	}
	@Test(groups = "electronic")
	private void earphone() {
System.out.println("earphone");
	}
	@Test(groups = "social media")
	private void whatsapp() {
System.out.println("whatsapp");
	}
	@Test(groups = "social media")
	private void insta() {
System.out.println("insta");
	}
	@Test(groups = "social media")
	private void snap() {
System.out.println("snap");
	}
	@Test(groups ="school" )
	private void bag() {
System.out.println("bag");
	}
}
