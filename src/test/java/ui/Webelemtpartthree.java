package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemtpartthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.sugarcrm.com/au/");
			driver.manage().window().maximize();
			driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).click();			driver.findElement(By.id("input_1_1")).sendKeys("gamil.com");
			driver.findElement(By.id("input_1_1")).clear();
			System.out.println(driver.findElement(By.id("input_1_1")).getAttribute("name"));
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).getCssValue("color"));
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).getLocation());
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/a/img[1]")).getText());
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).getSize());
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).getTagName());
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).isEnabled());
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).isSelected());
			System.out.println(driver.findElement(By.id("gform_submit_button_1")).isDisplayed());
			

	}

}
