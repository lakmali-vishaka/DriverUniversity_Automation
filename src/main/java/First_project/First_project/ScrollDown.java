package First_project.First_project;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		//scroll to action using pixel 0,2500 pixel daala thiyennne
		
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        
        /*
		WebElement element=driver.findElement(By.xpath("//h1[text()='ACTIONS']"));
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2500)");
		
		//we  difinetly dont know how much pixel we need to scroll  in this case we can use this
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
		Thread.sleep(2000);
		element.click();
		*/
		
        //scroll down until the end of the page
        js.executeScript("window.scrollTo(0,document.body.scollHeight)");
        
		
		driver.close();
		
		
		
		


	}

}
