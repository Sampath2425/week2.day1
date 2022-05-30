package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// setup chromedriver
		
				WebDriverManager.chromedriver().setup();
				
				// open the browser
				
				ChromeDriver driver = new ChromeDriver();
				
				// to load the url
				
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				// to maximize
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				
				driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
				
				driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
				
				driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("Tratum");
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sam");
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
				

	}

}
