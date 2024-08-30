package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass {

	private static LoginPage loginpage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();   
	    
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
	 loginpage= new LoginPage();
	 loginpage.enterUsernameAndPassword(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	    
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		loginpage.clickOnLoginButton();  
	}
}
