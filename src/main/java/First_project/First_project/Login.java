package First_project.First_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
		
        driver.manage().window().maximize();
        
        driver.findElement(By.id("text")).sendKeys("Vishaka");
        
        driver.findElement(By.id("password")).sendKeys("1234");
        
        driver.findElement(By.id("login-button")).click();
        
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
       
        
        
        
		
        driver.close();
	}

}
