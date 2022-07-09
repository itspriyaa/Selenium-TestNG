package TestNgfiles;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginPage {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass() {

		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		String path="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting02/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/Login%20Form/index.html");
	}

	@Test
	public void login1() {


		System.out.println("Entering login values");

		driver.findElement(By.id("phone-email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("priya642154");
		driver.findElement(By.id("submittion")).click();	
	}

	@Test
	public void login2() {


		System.out.println("Entering login values");

		driver.findElement(By.id("phone-email")).sendKeys("priyarp0001@gmail.com");
		driver.findElement(By.id("password")).sendKeys("priya642154");
		driver.findElement(By.id("submittion")).click();	
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After XClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
