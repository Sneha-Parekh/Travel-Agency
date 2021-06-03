package SnehaParekh.TravelAgency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import TravelObjRep.*;

public class TravelAgency {

	String Title = "";
	TravelObjRep trObj;	

	public WebDriver driver;
	 
	public void userLaunchesURL() throws Throwable
	{	
		
		System.setProperty(trObj.CHROMEDRIVER, trObj.PATH);
		driver=new ChromeDriver();
		driver.navigate().to(trObj.APPURL); 
		Title = driver.getTitle();
	}
	
	public void travelLaunched() throws Throwable
	{   
		try
		{
				if(!Title.equals(trObj.APPTITLE));
					{
						throw new Exception();
					}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void entersDepCity(String depcity)
	{
		Select dpdown= new Select((WebElement) driver.findElements(By.name(trObj.DEPARTURE)));
		
		dpdown.selectByVisibleText(depcity);
	}
	
	public void entersDesCity(String descity)
	{
		Select dpdown= new Select((WebElement) driver.findElements(By.name(trObj.DESTINATION)));
		
		dpdown.selectByVisibleText(descity);

	}
	
	public void findFlights()
	{
		//on Landing page
		driver.findElement(By.xpath(trObj.FINDFLISGHTS)).click();

	}
	
	
	public void chooseFlights()
	{
		//on flight selection page
		driver.findElement(By.xpath(trObj.CHOOSEFLISGHTS)).click();

	}
	
	public void enterDetails(String name,String add,String city,String state,String zipcode,
			String cardtype , String crednum,String month,String year,
			String CardName)
			{
				driver.findElement(By.xpath(trObj.NAME)).sendKeys(name);
				driver.findElement(By.xpath(trObj.ADDRESS)).sendKeys(add);
				driver.findElement(By.xpath(trObj.CITY)).sendKeys(city);
				driver.findElement(By.xpath(trObj.STATE)).sendKeys(state);
				driver.findElement(By.xpath(trObj.ZIPCODE)).sendKeys(zipcode);			
				Select dpdown= new Select((WebElement) driver.findElement(By.xpath(trObj.CARDTYPE)));
				dpdown.selectByVisibleText(cardtype);
				driver.findElement(By.xpath(trObj.CARDNUMBER)).sendKeys(crednum);
				driver.findElement(By.xpath(trObj.MONTH)).sendKeys(month);
				driver.findElement(By.xpath(trObj.YEAR)).sendKeys(year);
				driver.findElement(By.xpath(trObj.CARDNAME)).sendKeys(CardName);
		
		
			}
	
	public void purchaseFlights()
	{
		//on request details page
		driver.findElement(By.xpath(trObj.PURCHASEFLISGHTS)).click();

	}

	
	public void confirmGenerated() throws Exception
	{
		String id = 	driver.findElement(By.xpath(trObj.CONFIRMATIONID)).getText();
		
		if(id.equals(null))
		{
			throw new Exception();
		}
			
		
		
	}
	
	public void logout()
	{
		driver.quit();
	}
	
	
	
}
