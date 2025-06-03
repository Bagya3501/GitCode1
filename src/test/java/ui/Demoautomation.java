package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver Driver = new ChromeDriver();
		//FirefoxDriver Driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.amazon.com/");
	}

}
