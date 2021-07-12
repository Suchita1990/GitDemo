package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SecondFeatureSteps {

	@Given("user is inside second feature ")
	public void displayMessage() {
		System.out.println("Welcome to Second feature file");
	}

	@Then("print his name")
	public void displayName() {
		System.out.println("Hello Testing Shastra");
	}

}
