package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
Driver.get("https://search.yahoo.com/search?fr2=p%3ads%2cv%3aomn%2cm%3asa%2cbrws%3achrome%2cpos%3a1&fr=mcafee&type=E210US885G0&p=salesforce+login");
Driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
Set<String> windowshandles =Driver.getWindowHandles();
System.out.println(windowshandles);
Iterator<String> Iterator =windowshandles.iterator();
String Firstwindow =Iterator.next();
String Secondwindow=Iterator.next();
Driver.switchTo().window(Secondwindow);
Driver.findElement(By.id("username")).sendKeys("baya");
Driver.findElement(By.id("password")).sendKeys("Password");
Driver.switchTo().window(Firstwindow);
	}

}
