package SampleOwnPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browseropening {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd ;
		String Url="https://www.facebook.com/";
		int i, num = 4;   	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok Kumar Raviraja\\Downloads\\chromedriver_win32\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("https://www.facebook.com/");
        System.out.println(wd.getTitle());
        Thread.sleep(1000);
        String newTab =Keys.chord(Keys.CONTROL,Keys.RETURN);
        for(i=0;i<num;i++) {
        wd.findElement(By.linkText("Forgotten password?")).sendKeys(newTab);
        }wd.switchTo().window(newTab);
        System.out.println(wd.getCurrentUrl());
	}
}

