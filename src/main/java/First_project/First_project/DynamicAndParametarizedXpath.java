package First_project.First_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAndParametarizedXpath {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		Thread.sleep(2000);
        driver.manage().window().maximize();
        
        //according to the element we can change the value
        String value = "CONTACT US";
        
        
        driver.findElement(By.xpath("//h1[text()='" + value +"']")).click();
        
        //driver.findElement(By.xpath("//h1[text]='LOGIN PORTAL']")).click();
        
        
        driver.close();



	}

}
