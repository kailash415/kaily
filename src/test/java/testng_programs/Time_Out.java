package testng_programs;

import org.testng.annotations.Test;

public class Time_Out {
@Test(timeOut = 3000 )
private void demo() throws InterruptedException  {
System.out.println("setproperty");
Thread.sleep(2000);
System.out.println("browser");
Thread.sleep(2000);

System.out.println("url");
System.out.println("launch");


}
}
