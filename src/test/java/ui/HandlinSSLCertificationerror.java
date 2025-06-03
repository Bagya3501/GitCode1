package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlinSSLCertificationerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
DesiredCapabilities dc  = new DesiredCapabilities();
//dc.setAcceptInsecureCerts(true);
dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
ChromeOptions coptions = new ChromeOptions();
coptions.merge(dc);
ChromeDriver driver = new ChromeDriver(coptions);
driver.get("https://expired.badssl.com/");

	}

}
