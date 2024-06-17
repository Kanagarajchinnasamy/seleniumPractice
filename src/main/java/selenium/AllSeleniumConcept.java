package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class AllSeleniumConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropdowns");
		WebElement drop = driver.findElement(By.id("superheros"));
		Select s = new Select(drop);
		s.selectByVisibleText("Iron Man");
		s.selectByVisibleText("Thor");
		s.selectByVisibleText("Wolverine");
		s.selectByVisibleText("Wonder Woman");
		List<WebElement> allOptions = s.getAllSelectedOptions();
		for(WebElement e: allOptions) {
			System.out.println(e.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		
	}
	



}

