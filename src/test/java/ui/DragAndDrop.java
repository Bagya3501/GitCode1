package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
WebElement frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
WebElement drag =driver.findElement(By.id("draggable"));
WebElement drop = driver.findElement(By.id("droppable"));
Actions action = new Actions(driver);
action.dragAndDrop(drag, drop).perform();
	}

}
