package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFACEBOOKLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String uRL = driver.getCurrentUrl();
		System.out.println(uRL);
		driver.quit();
		
		
	}

}
