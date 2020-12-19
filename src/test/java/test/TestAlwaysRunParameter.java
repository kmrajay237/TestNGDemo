package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;

public class TestAlwaysRunParameter {
	@Test(groups= {"regression"})
	public void register() {
		AssertJUnit.fail();
		Reporter.log("Register", true);
	}
	@Test(groups= {"regression"})
	public void deleteUser() {
		Reporter.log("Delete User", true);
	}
	
	
	@Test(dependsOnMethods= {"register"},alwaysRun=true,groups= {"regression"})
	public void login() {
		Reporter.log("Login", true);
	}
}
