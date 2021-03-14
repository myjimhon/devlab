
package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsere {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://devlabs-860f0.web.app/");
	//driver.quit();


	}

}
