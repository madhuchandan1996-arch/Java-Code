package Basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods
{
 public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
    String parentid= driver.getWindowHandle();
    System.out.println(parentid);
    Set<String>parentchildid=   driver.getWindowHandles();
    System.out.println(parentchildid);
}
 
}
