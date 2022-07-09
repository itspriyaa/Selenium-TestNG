package TestNgfiles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class RegisterForm {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		  String path="D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();
	  }

	
  @Test
  public void Reg() {

		driver.get("file:///C:/Users/itctesting02/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/index.html");
		//first name
		driver.findElement(By.id("firstname")).sendKeys("Priyanga");

		//last name
		driver.findElement(By.id("lastname")).sendKeys("Ravichandran");

		//date of birth
		WebElement dateDob = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dateDob.sendKeys("20062022");

		//email
		driver.findElement(By.id("email")).sendKeys("priya@gmail.com");

		//phone number
		driver.findElement(By.id("phonenumber")).sendKeys("9360833472");

		//gender
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Female");
		gender.selectByIndex(1);

		//address
		driver.findElement(By.id("address")).sendKeys("Pollachi,Coiambatore");

		//state
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Tamil Nadu");
		state.selectByIndex(23);

		//resume upload
		WebElement uploadElement = driver.findElement(By.id("resume"));
		uploadElement.sendKeys("C:\\Users\\itctesting02\\Desktop");

		//registration date
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"registrationdate\"]"));
		dateBox.sendKeys("20062022");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0130PM");

		////password
		driver.findElement(By.id("password")).sendKeys("Rahul@123");

		//confirm password
		driver.findElement(By.id("confirm-password")).sendKeys("Rahul@123");

		//agree terms and condition
		driver.findElement(By.id("agree")).click();

		//register
		driver.findElement(By.id("submit-btn")).click();
		
		//agree
		driver.switchTo().alert().accept();
  }
  
  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
