package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class takingscrrenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
Date currentDate = new Date();
String ssfilename =currentDate.toString().replace(" ", "-").replace(":", "-");
System.out.println(currentDate);
driver.get("https://www.ebay.com/");
TakesScreenshot scrShot =((TakesScreenshot)driver);	
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SrcFile,new File(".//Screenshot"+ssfilename+".png"));
	}
	}
	
