package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup chromedriver
		
		WebDriverManager.chromedriver().setup();
		
		//open the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		
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
		
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SK");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Madhu");
		
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.name("description")).sendKeys("MyProject");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("samkptm@gmail.com");
		
		WebElement ele = driver.findElement(By.id("dropdown1"));
		
		Select dd = new Select(ele);
		
		dd.selectByVisibleText("New York");

	}

}
