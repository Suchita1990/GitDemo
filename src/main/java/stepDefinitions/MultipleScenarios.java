package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MultipleScenarios {
	
	@Before("Open {string} browser")
	public void setUp(String browser) {
		System.out.println("This is Setup method");

	}
	
	@Given("user is inside first feature")
	public void printMessage() {
		System.out.println("Welcome to First feature file");
	}
	@Then("print user name")
	public void printName() {
		System.out.println("Hello Testing Shatra");

	}
	@Given("user is inside next feature")
	public void secondFeature() {
		System.out.println("Welcome to second scenario of second file");

	}
	
	@Given("user is inside second feature")
	public void user_is_inside_second_feature() {
	    System.out.println("smoke test");
	}
	
	@Given("user is inside third scenario")
	public void user_is_inside_third_scenario() {
	    System.out.println("Hello Every One!");
	}

}
