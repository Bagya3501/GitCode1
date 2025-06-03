package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentwaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/?mkevt=1&mkcid=1&mkrid=711-53200-19255-0&campid=5338853614&toolid=10001&customid=129857X1602039X9fbf27bb2918fa704bba1697c980cf46");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Wait<ChromeDriver> wait =new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofSeconds(1))
		            .withMessage("RCV Acadame") 
		            .ignoring(ElementNotInteractableException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
	}

}
