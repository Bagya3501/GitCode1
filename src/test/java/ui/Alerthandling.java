package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//new child branch one
public class Alerthandling {
// new git change to updated
// new git change
	//b chnaged the code
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);(Switching to the frame by using index valeu)
		//driver.switchTo().frame("iframeResult");//by using id or name of the frame
		WebElement ele = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(ele);//by using webelemnt
		driver.findElement(By.xpath("/html/body/button")).click();
		//we need to handle the alert which we get while clicking try it button
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
		Thread.sleep(200);
		driver.switchTo().parentFrame(); 
		System.out.println(driver.getTitle());*/
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("My name is bagya");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println("hello github");
		System.out.println("hello github2");
	}

}
