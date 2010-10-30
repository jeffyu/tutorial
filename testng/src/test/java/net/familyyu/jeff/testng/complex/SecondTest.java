/**
 * 
 */
package net.familyyu.jeff.testng.complex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author jeffyu
 *
 */
public class SecondTest {
	
	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("This is beforeClass");
	}
	
	@BeforeMethod
	public void init() throws Exception{
		System.out.println("this is beforeMethod");
	}
	
	@Test
	public void secTest() throws Exception {
		System.out.println("This is secTest");
	}
	
	@Test
	public void threeTest() throws Exception {
		System.out.println("This is thirdTest");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		System.out.println("This is afterClass");
	}

}
