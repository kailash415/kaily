package testng_programs;

import org.testng.annotations.Test;

public class Priority_Concept {
@Test()
private void book() {
System.out.println("book");
}
@Test(priority = -1)
private void earphone() {
System.out.println("earphone");
}
@Test(priority = 3)
private void apple() {
	System.out.println("apple");

}

}
