package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAdd {
	
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("Before test executed...");
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}
	@Test
	public void testAd() {
		int inputBase = 4;
		int exp=3;
		int expectedValue=7;
		int actualValue=calc.add(inputBase, exp);
		assertEquals(expectedValue, actualValue);
		
	}
	

//	@Test
//	public void testAdd() {
//		fail("Not yet implemented");
//	}
//
}
