package validate;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void softAssertNonStaticMethod() {
		SoftAssert softassert=new SoftAssert();
		
		Reporter.log("Before Assert", true);
		
		softassert.assertSame("abcd", "abcd");
		
		softassert.fail();
		
		Reporter.log("After Assert", true);
		Reporter.log("Hello World Assert", true);
	}
}
