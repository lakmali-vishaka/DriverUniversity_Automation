package First_project.First_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google a
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='yellow']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='purple']")).click();
		
		//check whether the purple is selected and displayed and enabled
		System.out.println(driver.findElement(By.xpath("//input[@value='purple']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@value='purple']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@value='purple']")).isSelected());

		Thread.sleep(2000);
		
		//check whether orange is selected or not
		System.out.println(driver.findElement(By.xpath("//input[@value='orange']")).isSelected());
		
		
		
		driver.close();

	}

}
