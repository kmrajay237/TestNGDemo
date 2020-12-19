package test;

import org.testng.annotations.Test;

public class TestDependsOnMethod {
	@Test(groups= {"smoke"})
	public void register() {
		System.out.println("Registration Success!!");
	}
	@Test(groups= {"smoke"})
	public void deleteUser() {
		System.out.println("User Deleted");
	}
	
	
	@Test(dependsOnMethods= {"register"},groups= {"smoke"})
	public void login() {
		System.out.println("Login Success!!");
	}
}
