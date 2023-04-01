package src.com.ust.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(priority=1,description="this is executed first")
	  public void f() {
		  System.out.println("from test method f()");
	  }
	  @Test(priority=2,description="executed for testing")
	  public void a() {
		  System.out.println("from test method a()");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("from beforetest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("from aftertest");
	  }


}
