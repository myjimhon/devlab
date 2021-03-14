package Week5.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToDoTen {

	public static void main(String[] args) {
		String url ="https://www.irctc.co.in/nget/profile/forgot-password?pageType=U";	
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.getWindowHandles();
		
		
		driver.findElementByXPath("//button").click();
		driver.findElementByXPath("//i[@class='fa fa-facebook-square']").click();
		String ttle = driver.getTitle();
		
		System.out.println(ttle);
		Set<String> wndowHandles = driver.getWindowHandles();
		List<String> lit = new ArrayList<>(wndowHandles);
		
		driver.switchTo().window(lit.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(lit.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}

}
