/**
 * 
 */
/**
 * @author Sneha Parekh
 *
 */
package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import SnehaParekh.TravelAgency.*;


@SuppressWarnings("unused")
public class StepDef{
	
	TravelAgency login =new TravelAgency();
	
	@Given("^User launches URL$")
	public void user_launches_URL() throws Throwable {
	    login.userLaunchesURL();
	   
	}
	@Then("^Travel website is launched$")
	public void travel_Launched() throws Throwable  {
	    login.travelLaunched();
	   
	}
	
	@Then("^User enters departure city as (.*)$")
	public void dep_city(String depcity) throws Throwable  {
	    login.entersDepCity( depcity);
	   
	}
	
	@Then("^User enters destination city as User enters departure city as (.*)$")
	public void des_city(String descity) throws Throwable  {
	    login.entersDepCity( descity);
	   
	}
	
	@Then("^User clicks on find flights$")
	public void find_Flights()   {
	    login.findFlights();
	}
	
	@Then("^User Chooses flight$")
	public void choose_Flights()   {
	    login.chooseFlights();
	}

	@Then("^User Enters (.*)(.*)(.*)(.*)(.*)(.*)(.*)(.*)(.*)(.*)$")
	public void enter_Detailss(String name,String add,String city,String state,String zipcode,
								String cardtype , String crednum,String month,String year,
								String CardName)   {
	    login.enterDetails(name, add, city, state,zipcode,
				 cardtype , crednum, month, year,
				 CardName);
	}
	
	
	@Then("^User purchases flight$")
	public void purchase_Flights()   {
	    login.purchaseFlights();
	}
	
	@Then("^User validates confirmation ID is generated$")
	public void confirm_Generated() throws Exception   {
	    login.confirmGenerated();
	}
	
	@Then("^User logs out$")
	public void logout()  {
	    login.logout();
	}
}