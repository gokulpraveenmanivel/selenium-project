package Task;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	
		@SuppressWarnings("unused")
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selenium task\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			WebElement drag = driver.findElement(By.xpath("//a[@class='button button-orange']"));
			WebElement drop = driver.findElement(By.xpath("//li[@class='placeholder']"));
			
			Actions acc = new Actions(driver);
			acc.dragAndDrop(drag, drop).build().perform();
			
			

}
}