package First_project.First_project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Basic {

	public static void main(String[] args) throws InterruptedException {
		
		
		//run web browser
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google and facebook pages
		
		driver.get("https://google.com/");
		Thread.sleep(2000);
		
		
		
		driver.get("https://web.facebook.com");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		
		
		//back,forward,refresh
		
	    driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//get title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// get page source 
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
		//find element by link text
		
		driver.findElement(By.linkText("About")).click();
		
		
		//find element by partial link text
		
		driver.findElement(By.partialLinkText("Abo")).click();
		
		
		
		//find element by tags 
		
			List <WebElement> elements = driver.findElements(By.tagName("a"));
			
			for(WebElement element: elements) {
				System.out.println(element.getText());
			}
		
		
		
		// find element by Relevent xpath
		
		driver.findElement(By.xpath("//input[@title='search')")).sendKeys("animals");
		
		
		
		
		driver.quit();
		
		

	}

}
