package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettingalloptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
	/*	driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
	List<WebElement> allopt =	driver.findElements(By.tagName("option"));
	System.out.println(allopt.size());
	for (int i =0; i<allopt.size();i++) {
		System.out.println(allopt.get(i).getAttribute("value"));*/

	}
		

	}
