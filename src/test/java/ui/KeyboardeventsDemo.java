package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardeventsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://extendsclass.com/text-compare.html#google_vignette");
driver.manage().window().maximize();
WebElement select = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
Actions action = new Actions(driver);
action.keyDown(select, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
WebElement sel = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[1]/pre/span"));
action.keyDown(sel, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
WebElement scrool= driver.findElement(By.xpath("//*[@id=\"result\"]/div[3]/input[2]"));
action.moveToElement(scrool).perform();
WebElement elemntthr = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/pre"));
WebElement elemtfor = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]//div[5]/div[1]/pre"));
	}

}
