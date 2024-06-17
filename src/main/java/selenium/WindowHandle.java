package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> childWindows = driver.getWindowHandles();
		Iterator<String> it = childWindows.iterator();
		String parent = driver.getWindowHandle();
		/*
		 * while(it.hasNext()) { String value =it.next(); if(!value.equals(parent)) {
		 * driver.switchTo().window(value); if(driver.getTitle().equals("New Window")) {
		 * System.out.println(driver.findElement(By.tagName("h3")).getText()); } }
		 * 
		 * }
		 */
		/*
		 * for(String s :childWindows) {
		 * 
		 * driver.switchTo().window(s); if(driver.getTitle().equals("New Window")) {
		 * System.out.println(driver.findElement(By.tagName("h3")).getText()); } }
		 */
		
		/*
		 * ArrayList<String> list = new ArrayList<String>(childWindows); for(int
		 * i=0;i<list.size();i++) {
		 * 
		 * }
		 */
		driver.quit();
	}

}
