package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSub {
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
	public void testsub() {
		int inputBase = 4;
		int exp=3;
		int expectedValue=1;
		int actualValue=calc.sub(inputBase, exp);
		assertEquals(expectedValue, actualValue);
		
	}

//	@Test
//	public void testSub() {
//		fail("Not yet implemented");
//	}

}
