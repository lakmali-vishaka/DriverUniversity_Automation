package First_project.First_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		//how to performe double click
		WebElement element1=driver.findElement(By.id("double-click"));
		
		action.doubleClick(element1).perform();
		Thread.sleep(2000);
		
		//click and hold
		
        WebElement element2=driver.findElement(By.id("click-box"));
		
		action.clickAndHold(element2).perform();
		Thread.sleep(2000);
		
		/*
		
		//mouse hover
        WebElement element3=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        
		
		action.moveToElement(element3).perform();
		Thread.sleep(2000);
	  //after mouse over  we need to click relevent option
		driver.findElement(By.xpath("//a[text()='Link 1']")).click();
		Thread.sleep(3000);
		
		*/
		
		//drag  and drop
		//element need to drop
		 WebElement element4=driver.findElement(By.id("draggable"));
		 
		 //place need to drop
		 WebElement element5=driver.findElement(By.id("droppable"));
		 action.dragAndDrop(element4, element5).perform();
		
		
		
		driver.close();
		
		

	}

}
