package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest {


@Given("User opens application")
public void user_opens_application() {
    
	System.out.println(">>User opened application");
}

@When("User enters product {string} in search field")
public void user_enters_product_in_search_field(String searchText) {
    System.out.println(">>User entered product :" +searchText);
}

@When("User clicks on search button")
public void user_clicks_on_search_button() {
   
}

@Then("valid products should be displayed in search results")
public void valid_products_should_be_displayed_in_search_results() {
    
}

@Then("Proper text informing the user about no matching products should be displayed")
public void proper_text_informing_the_user_about_no_matching_products_should_be_displayed() {
    
}

	
}
