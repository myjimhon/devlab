/**
 * 
 */
package Week5.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author jim
 *
 */


public class LearnWindowHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="https://the-internet.herokuapp.com/windows";
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("Click here").click();
		Set<String> allwins = driver.getWindowHandles();
		
		List<String> openWindows = new ArrayList<>(allwins);
		
		driver.switchTo().window(openWindows.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(openWindows.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
