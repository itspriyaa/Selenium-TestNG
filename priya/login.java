package priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String path="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/itctesting02/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/Login%20Form/index.html");
		driver.findElement(By.id("phone-email")).sendKeys("priyarp0001@gmail.com");
		driver.findElement(By.id("password")).sendKeys("priya642154");
		driver.findElement(By.id("submittion")).click();
		
        driver.close();
	}

}
