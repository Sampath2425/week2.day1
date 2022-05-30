package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		//open the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//maximize the browser window
		
		driver.manage().window().maximize();
		
		// 1). identify the dropdown element (select tag)
		
		WebElement ele = driver.findElement(By.id("dropdown1"));
		
		// 2). create an object for select class and link with dropdown element
		
		Select dd = new Select(ele);
		
		// 3). choose the option
		
		// a). choose the option based on value
		
		//dd.selectByValue("2");
		
		// b). choose the option based on visible text
		
		dd.selectByVisibleText("UFT/QTP");
		
		// c). choose the option based on index
		
		//dd.selectByIndex(1);

	}

}
