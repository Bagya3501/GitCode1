package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeDriver Driver = new ChromeDriver();
//Driver.get("https://www.saucedemo.com/v1/");
//Driver.findElement(By.id("user-name")).sendKeys("Bagya");
//Driver.findElement(By.className("form_input")).sendKeys("Lakshmi");
//Driver.findElement(By.cssSelector("#user-name")).sendKeys("Deepak");
//Driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Kumar");
//Driver.findElement(By.tagName("input")).sendKeys("TagName");
Driver.get("https://www.selenium.dev/documentation/");
//Driver.findElement(By.linkText("Drivers")).click();
//Driver.findElement(By.partialLinkText("Components")).click();
}

}
