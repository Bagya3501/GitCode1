package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/resizable/");
WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
WebElement ele =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
Actions action = new Actions(driver);
action.dragAndDropBy(ele, 300, 100).perform();
	}

}
