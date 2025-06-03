package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//browsersetup
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
	// open the link will use get method
		
		Driver.get("https://www.meesho.com/auth");
	Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div[2]/input")).sendKeys("9047246630");
	Driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/button/div")).click();
	Driver.close();
	}

}
