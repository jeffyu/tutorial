/**
 * 
 */
package net.familyyu.jeff.testng.simple;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author jeffyu
 *
 */
public class SimpleTest {
	
	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("This is SimpleTst BeforeClass");
	}
	
	@Test
	public void simpleTest1() throws Exception {
		String s = "Hello TestNG";
		System.out.println("SimpleTest1");
	}
	
	@Test
	public void sTest2() throws Exception {
		String s2 = "Hello TestNG2";
		System.out.println("sTest2");
	}

}
