package tw.com.wd.example.unittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmptyTest {
	@Test
	public void testSth() {
		// Do test-case
	}
	
	@Before
	public void setUp() {
		// Do something before each test-case
	}
	
	@After
	public void tearDown() {
		// Do something after each test-case
	}
	
	@BeforeClass
	public static void beforeClass() {
		// Do something when test-class initial
	}
	
	@AfterClass
	public static void afterClass() {
		// Do something after test-class done		
	}
}
