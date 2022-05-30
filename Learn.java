package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement eleUserName = driver.findElement(By.id("username"));
		
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sampath");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SK");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("KM");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("MyFirstProject");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("samkptm@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadhu");
		
		driver.findElement(By.className("smallSubmit")).click();
						

	}

}
