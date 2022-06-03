package abc_practices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailSigninTest {
	public static void main(String[] args) throws Throwable  {
	System.out.println ("This is gmail signin test!");	
	System.setProperty("webdriver.chrome.driver",
			 "C:/Users/saied rahman/utilities/chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // For Chrome Browser
			driver.get("https://www.google.com");
			driver.findElement(By.id("gb_70")).click();
			System.out.println("I clicked on the Sign in button ..............");
			Thread.sleep(5000);
			// TODOs: Complete the remaining codes
			Thread.sleep(2000);
			driver.close();
	
	
	
	
	
	
	}
}