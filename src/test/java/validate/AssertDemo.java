package validate;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void assertStaticMethod() {
		String str=null;
		
		Reporter.log("Assert Class Static Method Before fail",true);
		Assert.fail("Welcome to TestNG");
		Reporter.log("Assert Class Static Method After fail",true);
//		Assert.assertEquals("Hello", "Hello");
//		Assert.assertTrue(6<7, "Welcome");
//		Assert.assertSame("Welcome", "Welcome");
//		Assert.assertNull(str, "Object is null");
//		Assert.fail("Welcome to TestNG");
	}

}
