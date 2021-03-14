package Week5Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetCode {

		public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/");
		driver.findElementByXPath("//*[contains(text(),' Log in ')]").click();
		
		driver.findElementByXPath("//input[@name='email']").sendKeys("fav@gmail.com",Keys.ENTER);
		driver.findElementByXPath("//input[@name='password']").sendKeys("fav123",Keys.ENTER);
		driver.findElementByXPath("//button[contains(text(),'LOGIN')]").click();
		
		WebDriverWait wait = new WebDriverWait(driver, null, null, 0, 0);

		wait.until(null)
	}

}
