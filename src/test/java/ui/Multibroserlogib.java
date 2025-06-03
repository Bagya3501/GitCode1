package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multibroserlogib {

	
	public static String browser = "edge";
	public static WebDriver Driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(browser.equals("crome")) {
	WebDriverManager.chromedriver().setup();
	Driver = new ChromeDriver();
}
else if(browser.equals("edge")) {
}
Driver=new EdgeDriver();
Driver.get("https://www.meesho.com/auth");
Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/input")).sendKeys("9047246630");
Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/button/div")).click();
Driver.close();
	}

}
