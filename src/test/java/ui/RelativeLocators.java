package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver = new ChromeDriver();
		// open the link will use get method
			
			Driver.get("https://www.saucedemo.com/v1/");
			WebElement Password = Driver.findElement(By.id("password"));
			Driver.findElement(RelativeLocator.with(By.tagName("input")).above(Password)).sendKeys("Hello");
			Driver.findElement(RelativeLocator.with(By.tagName("input")).below(Password)).click();
			}

}
