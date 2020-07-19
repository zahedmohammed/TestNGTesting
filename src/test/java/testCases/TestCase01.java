package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase01 {
	
	@BeforeTest
	public static void openDbConnection() {
		System.out.println("DB Connection Established");
	}
	
	@AfterTest
	public static void closeDbConnection() {
		System.out.println("DB Connection Terminated");
	}
	
	@BeforeMethod
	public static void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public static void closeBrowser() {
		System.out.println("Closing Browser");
	}
	
	@Test
	public static void login() {
		System.out.println("Login successfully");
	}
	
	@Test(priority=1)
	public static void userRegistration() {
		System.out.println("Registration Successful");
	}

}
