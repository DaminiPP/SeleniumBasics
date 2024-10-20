package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setUpProperties() {
		System.out.println("Setting up Properties");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login(){
		System.out.println("Login to the application");
	}
	
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}

	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout from application");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete All cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void testReport() {
		System.out.println("Generate Test Report");
	}
}
