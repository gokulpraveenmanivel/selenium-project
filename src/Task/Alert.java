package Task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
          private static File srcFile;

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selenium task\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Alert a = (Alert) driver.switchTo().alert();
			((org.openqa.selenium.Alert) a).accept();
			
			driver.findElement(By.xpath("//a[@herf=#cancelTab']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			((org.openqa.selenium.Alert) a).dismiss();
			
			
			//takescreenshot
			TakesScreenshot tk = (TakesScreenshot) driver;
			tk.getScreenshotAs(OutputType.FILE);
			File desc = new File("C:\\Users\\user\\eclipse-workspace\\selenium task\\chrome//TK");
			FileUtils.copyFile(srcFile, desc);
}

}