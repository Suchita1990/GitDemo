package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterTest {
	float count;
	String fruitName;

	@Given("I have {float} {string}")
	public void iHaveApple(float x , String fruitName) {
		count = x;
		this.fruitName=fruitName;
	}

	@When("I ate {float} {string}")
	public void iAteApples(float y ,String fruitName) {
		count = count - y;
		this.fruitName=fruitName;
	}
	
    @Then("how much apples are left")	
    public void iHaveApples() {
     System.out.println("There are "+count+""+fruitName+" remaining");
	}
}
