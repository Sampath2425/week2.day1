package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sampath");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select option = new Select(dropDown);
		
		option.selectByVisibleText("Conference");
		
		driver.findElement(By.name("submitButton")).click();
		
		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(firstname);
		
		//to close the browser
		
		//driver.close();
		
		
	}

}
