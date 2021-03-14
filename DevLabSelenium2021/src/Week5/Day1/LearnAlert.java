package Week5.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/frame");
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("myframe");  // id or name
		
		WebElement frame = driver.findElementByXPath("//iframe[@src='/login']");
		driver.switchTo().frame(frame);
		
		//driver.switchTo().parentFrame();
		//driver.....defaultContent();
	
		driver.findElementById("username").sendKeys("admin");
		driver.findElementById("password").sendKeys("admin");
		
		driver.findE	lementByXPath("(//button)[2]").click();
		
		driver.switchTo().alert().accept();
		
		
		

		
	}

}
