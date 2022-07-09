package TestNgfiles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class contactme {
	WebDriver driver;
  @Test
  public void tstmd (){
	  String path1="D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe";
  }
  @BeforeMethod
  public void beforeMethod() {
  String path="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/itctesting02/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Home%20Page/priyangaPortfolio/contact.html");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.get("file:///C:/Users/itctesting02/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Home%20Page/priyangaPortfolio/contact.html");
		driver.findElement(By.id("name")).sendKeys("Priyanga");
		driver.findElement(By.id("email")).sendKeys("priyarp0001@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("Send your Resume");
		driver.findElement(By.id("message")).sendKeys("I'am quite impressed with your portfolio. May I know what is the good time to talk with you?");
		driver.findElement(By.id("submit")).click();
		driver.quit();
  }


  @DataProvider
  public void dp() {
   
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
