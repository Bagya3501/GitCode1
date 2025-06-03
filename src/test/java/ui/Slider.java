package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/slider/#colorpicker");
WebElement frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
WebElement redslider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
//*[@id="green"]/span
Actions action = new Actions(driver);

action.dragAndDropBy(redslider, -100, 20).perform();
}

}
