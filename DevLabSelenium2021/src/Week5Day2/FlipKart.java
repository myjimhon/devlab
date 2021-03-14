package Week5Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipKart {

		public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		driver.findElementByXPath("(//button)[2]").click();
		
		WebElement somename = driver.findElementByClassName("xtXmba");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(somename);
			
		Select Ele = new Select(somename);
		Ele.selectByIndex(1);

		
	}

}
