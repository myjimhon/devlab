package Week5.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/jim/Desktop/Softwarre Testing/Simplilearn/Automation/Phase 3/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		WebElement frame = driver.findElementByXPath("//iframe[@id=\"iframeResult\"]");
		driver.switchTo().frame(frame);
		
		//driver.switchTo().parentFrame();
		//driver.....defaultContent();
		
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		
		String data = "Jim";
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys(data);
		alert.accept();
		
		
		String text =  driver.findElementById("demo").getText();
		
		if (text.contains(data)) {
			System.out.println("pass");
			
		}
		else {
			
			System.out.println("fail");
		}
		

		
	}

}
