package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.icicilombard.com/travel-insurance?utm_source=bing_search&utm_medium=CPC&utm_campaign=Travel_Bing_Search_Generic_Others_Jun24&utm_adgroup=&utm_keyword=best%20trip%20insurance&utm_device=c&utm_ad=&utm_placement=&utm_network=o&utm_matchtype=b&msclkid=d162e8a6fab518a96c338f5ecb28b1bc&utm_term=best%20trip%20insurance&utm_content=Trip_Insurance");
		WebElement radio1=driver.findElement(By.xpath("//*[@for='ilgeography']"));
WebElement radio2= driver.findElement(By.xpath("//*[@for='ilcountry']"));
				radio2.click();
				System.out.println(radio1.isSelected());
				int size = driver.findElements(By.xpath("//*[@type='radio']")).size();
System.out.println(size);

			}

}
