package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	
	@Test
	public void tc1() {
		
		System.out.println("Test 1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void tc2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
		}
	
	@Test
	public void tc3() {
		System.out.println("Test 3");
		System.out.println("Test add for Git");
		Assert.assertTrue(true);
	}
	
	//@Test(retryAnalyzer = Retry.class)
	
	
	
}

