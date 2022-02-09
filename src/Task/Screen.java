package Task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selenium task\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\user\\eclipse-workspace\\selenium task\\chrome//TK");
		File srcFile = null;
		FileUtils.copyFile(srcFile, desc);
}

}
