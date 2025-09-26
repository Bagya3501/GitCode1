package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselctorbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //ChromeDriver driver = new ChromeDriver();
		
		
		//driver.get("https://www.saucedemo.com/v1/");
		//driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("Hello");
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("Hello");
		//driver.get("https://signin.ebay.com.au/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com.au%2F");
		//driver.findElement(By.cssSelector("input.textbox__control")).click();//classname
		/*driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("wel");//other asttribute
		driver.findElement(By.cssSelector("input.form_input[placeholder='Username'][name='user-name']")).sendKeys("wellcom");//by using multiple attribute*/
		//driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
		//driver.findElement(By.cssSelector("input[id^='UserFirstName']")).sendKeys("name");//prefix
		//driver.get("https://www.saucedemo.com/v1/");
		//driver.findElement(By.cssSelector("input[name$='-name']")).sendKeys("name");//suffix
		//driver.findElement(By.cssSelector("input[name*='er-na']")).sendKeys("name");
		//driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
		//form[name^='signup_form_']>input[name='skipForm']-->select the child 
		//form[name^='signup_form_'] input -->select subchild
		//input[name='skipForm']+input -->selec the next sibling
		/*selecting first child
		 * select[name='CompanyCountry']>:first-child
		select[name='CompanyCountry'] :first-child
		select[name='CompanyCountry'] *:first-child
		select[name='CompanyCountry'] option:first-child*/
		
		/*selecting last child
		 * select[name='CompanyCountry']>:last-child
		 * select[name='CompanyCountry'] :last-child
		 * select[name='CompanyCountry'] *:last-child
		 * select[name='CompanyCountry'] option:last-child*/
		 
		 /*selecting nth child
		  * select[name='CompanyCountry']>:nth-child(2)
		 * select[name='CompanyCountry'] :nth-child(2)
		 * select[name='CompanyCountry'] *:nth-child(2)
		  * select[name='CompanyCountry'] option:nth-child(2)
		  * 
		  * seelcting nth child from last
		  * select[name='CompanyCountry']>:nth-last-child(3))
		  * select[name='CompanyCountry'] :nth-last-child(3)
		  * * select[name='CompanyCountry'] *:nth-last-child(3)
		  * select[name='CompanyCountry'] option:nth-last-child(3)
		  */
		
		 /*select the particular type of the parent class
		  * form[name^='signup_form_']>div:first-of-type - selct the 1st ele of type div
		  * form[name^='signup_form_']>div:last-of-type  - selct last ele of type div
		  * form[name^='signup_form_']>div:nth-of-type(5) - selec 5th ele of type div
		  */
		}
}
