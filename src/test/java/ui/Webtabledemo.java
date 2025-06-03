package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();

driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
List<WebElement> ros =driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr"));
int roesize = ros.size();
System.out.println(roesize);
List<WebElement> col =driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
int colsize = col.size();
System.out.println(colsize);
for ( int i=1;i<=roesize;i++) {
	for(int j=1;j<=colsize;j++) {
		System.out.print(driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()+" ");
		}
	System.out.println();
}
System.out.println("done");
	}

}
