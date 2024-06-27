package First_project.First_project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		//run web browser
				System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//navigate to google a
				
				driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='option-1']")).click();
				
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='option-2']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='option-1']")).click();
				
				driver.close();



	}

}
