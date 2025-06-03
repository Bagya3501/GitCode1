package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownpartone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		WebElement dropdown = driver.findElement(By.id("input_1_8"));
		Select select = new Select(dropdown);
		select.selectByValue("level1");
		Thread.sleep(200);
		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(200);
		select.selectByIndex(5);*/
		driver.get("https://harvesthq.github.io/chosen/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/ul/li/input")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/ul/li/input"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByVisibleText("United States");

	}

}
