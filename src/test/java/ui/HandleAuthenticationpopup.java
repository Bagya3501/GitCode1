package ui;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationpopup {
public static String username = "admin";//Reading from the external xls or csv
public static String password = "admin";//Reading from the external xls or csv
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
driver.get("https://" +username + ":"+password+"@the-internet.herokuapp.com/basic_auth");
//https://(admin:admin)@the-internet.herokuapp.com/basic_auth    by adding username : password
	}

}
