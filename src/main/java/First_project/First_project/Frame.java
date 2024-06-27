package First_project.First_project;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google a
		
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		
		//finding the iframe from element
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame']"));
		
		//switch to 
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Our Products']")).click();
		
		
		
		//finding the element by id
		
		
		driver.switchTo().frame("frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Our Products']")).click();
		
		*/
		
		
		//finding the element by index
		
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Our Products']")).click();
				
	
		driver.close();
		

	}

}
