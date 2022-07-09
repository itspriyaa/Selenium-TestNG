package priya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("princess");
		driver.findElement(By.id("password")).sendKeys("UGkqVm29zKp5fd@");
		driver.findElement(By.id("login")).click();
		driver.close();
		
				
		//

	}

}
