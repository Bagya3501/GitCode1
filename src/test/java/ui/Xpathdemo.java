package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
		//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input")).sendKeys("Bagya");//Absolutexpath
		//driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("G");//Relative xpath
		//driver.findElement(By.xpath("//input[starts-with(@id,'UserEmail')]")).sendKeys("bga@gamil.com");//starts-with fun
		//driver.findElement(By.xpath("//input[contains(@id,'Title')]")).sendKeys("hello");//contains fun
		//driver.findElement(By.xpath("//a[text()='Salesforce Program Agreement']")).click();//text() method
		//driver.findElement(By.xpath("//input[@type='text' and @name='UserFirstName']")).sendKeys("And oprtators");// and expression
		//driver.findElement(By.xpath("//input[@autocomplete='email' or @name='UserEmail']")).sendKeys("mail");//or expression
	//driver.findElement(By.xpath("//option[@value='US']//parent::select")).click();//axes method
	//driver.findElement(By.xpath("//option[@value='US']//self::option")).click();//axes method
	//driver.findElement(By.xpath("select[@name='CompanyCountry']//child::option[3]")).click();//axes method
	////div[@class='checkboxInput section']//descendant::div
	/////div[@class='checkboxInput section']//descendant-or-self::div
	//////div[@id='mainModal']//ancestor:: div -->ancestor method 
	/////div[@id='mainModal']//ancestor-or-self:: div -- >ancestor-or self
	/////option[@value='SE']//following::option -->FOLLOWING
	/////option[@value='SE']//following-sibling::option -->following sibling
	/////option[@value='Haryana']//preceding::option
	/////option[@value='Haryana']//preceding-sibling::option
	}
	

}
