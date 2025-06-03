package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
JavascriptExecutor jsex = (JavascriptExecutor)driver;
// get the title
String script = "return document.title;";
String title = (String) jsex.executeScript(script);
System.out.println(title);
// to perform click
driver.switchTo().frame("iframeResult");
String fun = "myFunction()";
jsex.executeScript(fun);
Thread.sleep(2000);
driver.switchTo().alert().accept();
// highlightinh
WebElement button =driver.findElement(By.xpath("/html/body/button"));
jsex.executeScript("arguments[0].style.border='3px solid red'", button);
//scrool
driver.navigate().to("https://www.w3schools.com/jsref/met_win_alert.asp");
WebElement ele =driver.findElement(By.xpath("//*[@id=\"spacemyfooter\"]/div[1]/div[4]/a"));
jsex.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

}
