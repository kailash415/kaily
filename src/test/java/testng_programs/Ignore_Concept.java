package testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@BeforeSuite
	private void setproperty() {
		System.out.println("setproperty");
	}
	@BeforeTest
	private void browserlaunch() {
		System.out.println("browserlaunch");
	}
	@BeforeClass
	private void url() {
		System.out.println("url");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test
	private void book() {
System.out.println("book");
	}
	@Ignore
	@Test
	private void laptop() {
System.out.println("laptop");
	}
	@Test
	private void moblie() {
System.out.println("moblie");
	}
	
	@Test(enabled = false)
	private void earphone() {
System.out.println("earphone");
	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");

	}
	@AfterClass
	private void homepage() {
		System.out.println("homepage");

	}
	@AfterTest
	private void close() {
		System.out.println("close");
	}
	
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("deleteallcookies");

	}
}
