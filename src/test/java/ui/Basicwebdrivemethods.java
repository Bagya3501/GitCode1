package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicwebdrivemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver Driver = new ChromeDriver();
Driver.get("https://www.saucedemo.com/v1/");
Driver.manage().window().maximize();
/*String currenturl = Driver.getCurrentUrl();
	System.out.println(currenturl);
	String title = Driver.getTitle();
	System.out.println(title);
	String pagesource = Driver.getPageSource();
	System.out.println(pagesource);
	Driver.navigate().to("http://google.com");
	Driver.close();*/

	}

}
