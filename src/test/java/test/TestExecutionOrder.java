package test;

import org.testng.annotations.Test;

public class TestExecutionOrder {
	@Test(priority=1,groups= {"smoke"})
	public void test01() {
		System.out.println("Inside test01 method");
	}
	
	@Test(priority=2,groups= {"smoke"})
	public void test02() {
		System.out.println("Inside test02 method");
	}
	@Test(priority=3,groups= {"smoke"})
	public void test03() {
		System.out.println("Inside test03 method");
	}
	@Test(priority=4,groups= {"smoke"})
	public void test04() {
		System.out.println("Inside test04 method");
	}
	@Test(priority=5,groups= {"smoke"})
	public void test05() {
		System.out.println("Inside test05 method");
	}

}
