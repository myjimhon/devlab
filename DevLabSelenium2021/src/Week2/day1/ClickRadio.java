package Week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/radiobutton");

		driver.findElementById("name1").click();
		//WebElement.sendKeys(Key.TAB);
		//WebElement.sendKeys(Key.Enter);
		/*
		 * WebElement append = driver.findElementById("join"); append.clear();
		 * append.sendKeys("person",Keys.TAB);
		 * 
		 * String tag = driver.findElementByTagName("h1").getText();
		 * System.out.println(tag);
		 */

	}

}
