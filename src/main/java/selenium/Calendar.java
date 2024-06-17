package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		//selectPastDate("14", "June", "2021","prev");
		selectDate("16", "June", "2023","future");


	}
	public static String[] getMonthYear(String monthYear) {
		return monthYear.split(" ");
	}

	                   
	
	public static void selectDate(String exDay, String exMonth, String exYear, String dateType) {
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);

		while(!(getMonthYear(monthYear)[0].equals(exMonth) 
				&& 
				getMonthYear(monthYear)[1].equals(exYear))) 
		{if(dateType.equals("past")) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			
		}
		else {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
	}
}
