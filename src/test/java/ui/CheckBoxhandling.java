package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		//code to scroolldoewn
		WebElement submit = driver.findElement(By.id("gform_submit_button_1"));
		Actions action = new Actions(driver);
		action.moveToElement(submit);
		action.perform();
		//code to select the checkbox
		driver.findElement(By.id("input_1_12_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input_1_12_1")).click();
		System.out.println(driver.findElements(By.xpath("//*[@data-gtm-form-interact-field-id='0']")).size());
		System.out.println("adding just to check github");
		}

}
