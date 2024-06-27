package First_project.First_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TODo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/To-Do-List/index.html");
		 
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        
        //add new iteam into todo list
        //driver.findElement(By.id("plus-icon")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("writing Notes");
        Thread.sleep(2000);
        
        
        driver.close();
        

	}

}
