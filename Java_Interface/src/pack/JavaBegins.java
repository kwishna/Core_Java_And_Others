package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Strings;

public class JavaBegins {
	
	int sum(int a, int b){
		return(a+b);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*    System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();  **/
		
		String url = "https://chrome.google.com/webstore/category/extensions?hl=en";
		driver.get(url);
		WebElement x = driver.findElement(By.id("searchbox-input"));
		x.click();
		x.clear();
		x.sendKeys("Grammarly");
		Thread.sleep(2000);
		x.sendKeys(Keys.DOWN);
		String s = x.getText();
		System.out.println(s);
		//Thread.sleep(5000);
	//	driver.findElement(By.xpath("//div[3]/div/div[2]/div/div/div/div")).click();

	
	}

}
