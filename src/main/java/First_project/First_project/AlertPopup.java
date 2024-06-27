package First_project.First_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopup {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("button4")).click();
		Thread.sleep(2000);
		
		/*
		
		//store the alert in a variable
		Alert alert=driver.switchTo().alert();
		alert.accept();
		*/
		
		// store the alert in a variable
		
		Alert alert=driver.switchTo().alert();
		String value= alert.getText();
		System.out.println(value);
		
		alert.dismiss();	
		
		driver.close();
		

	}

}
