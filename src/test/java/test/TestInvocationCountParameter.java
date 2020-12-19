package test;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class TestInvocationCountParameter {
	@Test(groups= {"regression"})
	public void register() {
		Reporter.log("Register", true);
	}
	@Test(enabled=false,groups= {"regression"})
	public void deleteUser() {
		Reporter.log("Delete User", true);
	}
	
	
	@Test(invocationCount=2,groups= {"regression"})
	public void login() {
		Reporter.log("Login", true);
	}
}
