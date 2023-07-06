package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Naveenpage;



public class Naveentest {
WebDriver Driver;
	
	@BeforeTest
	public void test()
	{
		Driver=new ChromeDriver();
		Driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
	}
	
	@Test
	public void testlogin() throws InterruptedException
	{
		Naveenpage ob=new Naveenpage(Driver);
		ob.setvalues("Gokul","sreenivas");
		ob.setvalues2("gokulsreenivas21@gmail.com","9495450191");
		ob.setvalues3("gokulsreenivas12","gokulsreenivas12");
		Thread.sleep(8000);


}
}
