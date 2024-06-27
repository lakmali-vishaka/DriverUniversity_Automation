package First_project.First_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google a
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//select the dropdown button
		
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select dropdownValue=new Select(dropdown);
		
		
		//find element in the selected dropdown using selectByIndex
		
		dropdownValue.selectByIndex(2);
		Thread.sleep(2000);
		
		//select by value
		dropdownValue.selectByValue("sql");
		Thread.sleep(2000);
		
		//select by  visible text
		
		dropdownValue.selectByVisibleText("C#");
		Thread.sleep(3000);
		
		driver.close();
		
		

	}


	

}
