package First_project.First_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		Thread.sleep(2000);
        driver.manage().window().maximize();
        
        String rowNumber="2";
        String columnNumber="2";
        
        /*
        //use xpath to find data
        String value= driver.findElement(By.xpath("//table[@id='t02']//tr[2]//td[3]")).getText();
        System.out.println(value);
        
        String value2= driver.findElement(By.xpath("//table[@id='t02']//tr[3]//td[1]")).getText();
        System.out.println(value2);
        */
        
        //use parametardlize xpath to find data
        
        String value= driver.findElement(By.xpath("//table[@id='t02']//tr["+ rowNumber+"]//td["+columnNumber+"]")).getText();
        System.out.println(value);
        
        
        
		
        
        driver.close();

	}

}
