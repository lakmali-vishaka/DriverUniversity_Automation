package First_project.First_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {
        
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
      
            // Open the target URL
            driver.get("http://www.webdriveruniversity.com");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            
            // Store the original window handle
            String originalWindow = driver.getWindowHandle();
            
            // Click on the LOGIN PORTAL link
            driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']")).click();
            Thread.sleep(5000);
            
            /*
            
            // Switch to the new parent window)(login)
            for (String windowHandle : driver.getWindowHandles()) {
                if (!originalWindow.contentEquals(windowHandle)) {
            
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            
            */
            // Perform actions in the new window
            driver.findElement(By.id("text")).sendKeys("vishaka");
            Thread.sleep(2000);
            
            // Close the new window
            driver.close();
            
            //switch again to original window
            
            driver.switchTo().window(originalWindow);
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//h1[text()='CONTACT US']")).click();
            
           
            // Quit the WebDriver instance
            driver.quit();
        
    }
}
