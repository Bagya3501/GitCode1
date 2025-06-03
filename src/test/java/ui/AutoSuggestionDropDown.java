package ui;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.sastasafar.com/flight-deal?return_date=y&msclkid=3795b2f2fce313639f56d50446f3fa23&utm_source=bing&utm_medium=cpc&utm_campaign=Flight%20Booking-%20Competition&utm_term=makemytrip.com&utm_content=Exact%20Match");
WebElement nam = driver.findElement(By.xpath("//*[@id=\"origin\"]"));
nam.click();
nam.sendKeys("mumbai");
Thread.sleep(2000);
nam.sendKeys(Keys.ARROW_DOWN);
nam.sendKeys(Keys.ENTER);
	}

}
