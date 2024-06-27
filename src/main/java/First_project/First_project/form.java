package First_project.First_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form {

	public static void main(String[] args) throws InterruptedException {
		//run web browser
				System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
				 
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
                
                driver.findElement(By.name("first_name")).sendKeys("vishaka");
                driver.findElement(By.name("last_name")).sendKeys("Lakmali");
                driver.findElement(By.name("email")).sendKeys("v45@gmail.com");
                driver.findElement(By.name("message")).sendKeys("nothing to comment");
                
               // driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
                driver.findElement(By.xpath("//input[@value='RESET']")).click();
                
                Thread.sleep(2000);
                
                
                
                
                
                
				
				
				driver.close();
				
			    
		

	}

}
