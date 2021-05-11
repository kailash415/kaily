package testng_programs;

import org.testng.annotations.Test;

public class Expected_Expection {
@Test(expectedExceptions = ArithmeticException.class)
private void exception() {
int a=10;
System.out.println(a/0);
}
}
