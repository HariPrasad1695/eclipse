package org.cts.test.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu\\eclipse-workspace\\Sel\\drivers\\chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.google.com");
    	
    }
}
