package Week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty('WebDriver Chrome', '');
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get('https://devlabs-860f0.web.app/dropdown');
		
		WebElement ind = driver.findElement(By.id('index'));
		
		Select Ele = new Select(driver.findElement(By.id('index')));
		
		Ele.selectByValue(1);
		Ele.selectByIndex(1);
		
		List<WebElement> options = Ele.getOptions();
		
		System.out.println(options.size());
		
		for WebElemet (eachOptions : options) {
			System.out.println(eachOptions.getText());
			
		}
		
		
	
	}

}
