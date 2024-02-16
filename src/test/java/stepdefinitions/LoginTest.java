package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {


	
@Given("User navigates to Login page")
public void user_navigates_to_login_page() {
	System.out.println(">>User opens application");  
}

@When("^User enters valid email address (.+)$")
public void user_enters_valid_email_address(String email) {
    System.out.println(">>User enters email address : "+email);
}

@When("^enters valid password (.+)$")
public void enters_valid_password(String password) {
	System.out.println(">>User enters password : "+password);
}

@When("^enters invalid password (.+)$")
public void enters_invalid_password(String password)
{
	System.out.println(">>User enters invalid password : "+password);
}

@When("clicks on Login button")
public void clicks_on_login_button() {
    
}

@Then("User should be able to login successfully")
public void user_should_be_able_to_login_successfully() {
    
}

@Then("access account details")
public void access_account_details() {
    
}

@When("User enters invalid email address {string}")
public void user_enters_invalid_email_address(String string) {
    
}

@Then("User should not be able to login successfully")
public void user_should_not_be_able_to_login_successfully() {
    
}

@Then("user get proper warning message")
public void user_get_proper_warning_message() {
    
}

@When("User dont enter any credentials")
public void user_dont_enter_any_credentials() {
    
}

@When("User enters below invalid email address and valid password")
public void User_enters_below_invalid_email_address_and_valid_password(DataTable table)
{
	Map<String, String> map = table.asMap(String.class,String.class);
	System.out.println(">>User entered email address : "+map.get("email"));
	System.out.println(">>User entered password : "+map.get("password"));
}


}
