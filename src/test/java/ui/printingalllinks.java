package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printingalllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println(alltags.size());
		for(int i=0;i<alltags.size();i++) {
			System.out.println("links in the page  "+ i +alltags.get(i).getAttribute("href") );
		}

	}

}
