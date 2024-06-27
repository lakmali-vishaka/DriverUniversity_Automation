package First_project.First_project;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://www.webdriveruniversity.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		js.executeAsyncScript("arguments[0].click();",element);
		
				

		
		
	}

}
