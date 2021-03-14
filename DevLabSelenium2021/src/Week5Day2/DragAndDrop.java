package Week5Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
		
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			driver.get("https://devlabs-860f0.web.app/aui");
//			WebElement src = driver.findElement(By.id("draggable"));
//			WebElement tgt = driver.findElement(By.id("droppable"));
//			
			Actions builder = new Actions(driver);
//			builder.dragAndDrop(src, tgt).perform();
			
			
			driver.get("https://jqueryui.com/draggable/");
			driver.switchTo().frame(0);
			WebElement src = driver.findElement(By.id("draggable"));
			Point location = src.getLocation();
			int x = location.getX();
			int y = location.getY();
			builder.dragAndDropBy(src, x+10, y+10).perform();
			Thread.sleep(5000);
			driver.quit();
		}

	}

