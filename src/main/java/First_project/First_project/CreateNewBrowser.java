package First_project.First_project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateNewBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google a
		
		driver.get("http://www.webdriveruniversity.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//open a new tab
		//driver.switchTo().newWindow(WindowType.TAB);
				

		
		
		//get another url in that window
		driver.get("http://www.google.com");
		
		
		
		
		
		driver.quit();
		
		

	



	}

}
