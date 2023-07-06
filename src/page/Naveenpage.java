package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Naveenpage {
	public Naveenpage(WebDriver Driver) {
		// TODO Auto-generated constructor stub
		
	this.driver=Driver;
	}
	WebDriver driver;
	
	By npFirstName=By.xpath("//*[@id=\"input-firstname\"]");
	By npLastName=By.xpath("//*[@id=\"input-lastname\"]");
	By npemail=By.xpath("//*[@id=\"input-email\"]");
	By nptelephone=By.xpath("//*[@id=\"input-telephone\"]");
	By nppassword=By.xpath("//*[@id=\"input-password\"]");
	By npconfrim=By.xpath("//*[@id=\"input-confirm\"]");
	By npsubcribe=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
	By npclick=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By npcontinue=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By npokey=By.xpath("//*[@id=\"content\"]/div/div/a");
	
	public void setvalues(String FristName,String LastName)
	{
		driver.findElement(npFirstName).sendKeys(FristName);
		driver.findElement(npLastName).sendKeys(LastName);
	}
	public void setvalues2(String email,String telephone) 
	{
		driver.findElement(npemail).sendKeys(email);
		driver.findElement(nptelephone).sendKeys(telephone);
	}
    public void setvalues3(String password,String confrim)
    {
    	driver.findElement(nppassword).sendKeys(password);
    	driver.findElement(npconfrim).sendKeys(confrim);
    	driver.findElement(npsubcribe).click();
    	driver.findElement(npclick).click();
    	driver.findElement(npcontinue).click();
    	driver.findElement(npokey).click();
    }
	

}
