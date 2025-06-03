package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicmethodsparttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> webele = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
		System.out.println(webele);
		driver.navigate().to("https://www.sugarcrm.com/au/");
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		String windowhandle = driver.getWindowHandle();
		System.out.println("window:"+windowhandle);
		driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).click();
		Set<String> windowshandles = driver.getWindowHandles();
		System.out.println(windowshandles);
		
	}

}
