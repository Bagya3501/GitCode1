package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
WebElement frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
WebElement click = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
Actions action = new Actions(driver);
action.contextClick(click).perform();
}

}
