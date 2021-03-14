package Week5Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumCricket {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElementByName("q").sendKeys("cricket",Keys.ENTER);
		List<WebElement> words = 
				driver.findElementsByXPath
				("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");	
		// wrong List<WebElement> words = (List<WebElement>) driver.findElementByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
		
		System.out.println(words.size());
		
		
	
	}

}
