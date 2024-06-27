package First_project.First_project;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.*;




public class Screenshot {

	public static void main(String[] args)throws InterruptedException, IOException {
	
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*
		
		//full screenshot of the page and a=save in the location that specified
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\java\\First_project\\First_project\\image.png"));
		*/
		
		//how to get elements screenshot
		WebElement element=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		File scrFile2 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2,new File("C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\java\\First_project\\First_project\\image2.png"));
		
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
