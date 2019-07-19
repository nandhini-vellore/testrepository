package cucumber123;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample {
	/*
	@Given("^Browser must be installed by user$")
	public void browser_must_be_installed_by_user() throws Throwable {
		System.out.println("browser installed");
	}

	@When("^User enters AUT URL in browser$")
	public void user_enters_AUT_URL_in_browser() throws Throwable {
		System.out.println("URL entered");
	}

	@Then("^Application must open in  the browser$")
	public void application_must_open_inthe_browser() throws Throwable {
		System.out.println("Browser opens");
	}
	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	    System.out.println("User registered");
	}

	@When("^User enters credentials and performs login$")
	public void user_enters_credentials_and_performs_login() throws Throwable {
	  
		System.out.println("valid credentials");
	}

	@Then("^User must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
		System.out.println("User is in home page");
	}
	
	@Given("^user must be logged in$")
	public void user_must_be_logged_in() throws Throwable {
		System.out.println("User is in home page");
	   
	}


	@When("^User enters all the mandatory filed$")
	public void user_enters_all_the_mandatory_filed() throws Throwable {
		System.out.println("mandatory fields filled ");
	}

	@Then("^Registration done successfully$")
	public void registration_done_successfully() throws Throwable {
		System.out.println("Successful registration");
	    
	}
	@Given("^User must be logged in and search field must be present$")
	public void user_must_be_logged_in_and_search_field_must_be_present() throws Throwable {
		System.out.println("Field for search element is present");
	}

	@When("^Search for a product$")
	public void search_for_a_product() throws Throwable {
		System.out.println("searching required products");
	    
	}

	@Then("^Product details must be displayed$")
	public void product_details_must_be_displayed() throws Throwable {
		System.out.println("details displayed");
	    
	}*/
	
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
		System.out.println("printing credentials");
	}

	/*@When("^Login using <\"([^\"]*)\"> and <\"([^\"]*)\">$")
	public void login_using_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1+" "+arg2);
	}
	@When("^Login using laly(\\d+) and popins(\\d+)$")
	public void login_using_laly_and_popins(String arg1, String arg2) throws Throwable {
		System.out.println(arg1+" "+arg2);
	}

	@When("^Login using raji(\\d+) and great(\\d+)$")
	public void login_using_raji_and_great(String arg1, String arg2) throws Throwable {
		System.out.println(arg1+" "+arg2);
	}
	    

	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		System.out.println("home page opens");
	}*/

	@When("^Login using below credentials$")
	public void login_using_below_credentials(DataTable arg1) throws Throwable {
		
	   
	  
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	    
	}

}
